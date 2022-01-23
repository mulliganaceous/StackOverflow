import numpy as np
import matplotlib as mpl
import matplotlib.pyplot as plt
from matplotlib.colors import LinearSegmentedColormap
from math import sqrt, pi

# PRINT OPTIONS
np.set_printoptions(precision=3)

# CONSTANTS FOR DIMENSIONS
WINDOW_H = 256
WINDOW_W = 1024

def init_inputspace(width, height, init_x, init_y):
    '''Set up the space of inputs, implemented as a numpy array.
    '''
    xspace = np.broadcast_to(np.array(range(width)), (height, width))
    yspace = np.broadcast_to(np.array(range(height)), (width, height)).transpose()
    inputs = np.empty([height, width, 2])
    inputs[:,:,0] = -yspace + init_y
    inputs[:,:,1] = xspace + init_x
    return inputs

def coordinates(inputspace, x, y):
    '''Given x and y coordinates, return the array element of the input space
       in input coordinates.'''
    return inputspace[-y, x]

def toindex(inputspace, x, y):
    indices = np.round([-y+inputspace[0,0,1],x+inputspace[0,0,0]]).astype(int).transpose()
    """
    indices = indices[indices[:,:,0] >= 0]
    indices = indices[indices[:,:,0] < inputspace.shape[0]-1]
    indices = indices[indices[:,:,1] >= 0]
    indices = indices[indices[:,:,1] < inputspace.shape[1]-1]
    """
    return indices

def constant(inputspace, k):
    return np.ones([inputspace.shape[0], inputspace.shape[1]])*k

def circularwave(inputspace, x, y, wl):
    '''Represents and individual circular wave'''
    outputspace = np.empty([inputspace.shape[0], inputspace.shape[1]])
    outputspace[:,:] = np.sqrt((inputspace[:,:,0] - x)**2 + (inputspace[:,:,1] - y)**2)
    outputspace[:,:] = np.sin(2*pi*outputspace[:,:]/wl)
    return outputspace

def traceray(inputspace, x, y, wl, count):
    outputspace = constant(inputspace, 0)
    distance=1000
    position=np.broadcast_to([x,y], (count, 2))
    rng = np.random.default_rng()
    direction=rng.random(count)*2-1
    direction=np.array((np.cos(direction*pi/2), np.sin(direction*pi/2))).transpose()
    print(position)
    print(direction)
    k = 0
    while k < distance:
        indices = toindex(inputspace, position[:,0], position[:,1])
        print(indices.transpose())
        position = position + direction
        k += 1
    return outputspace

# CREATE DIFFRACTION
inputspace = init_inputspace(WINDOW_W, WINDOW_H, 0, (WINDOW_H - 1)/2)
outputspace = constant(inputspace, 0)
outputspace += circularwave(inputspace, 16, -32, 16)
outputspace += circularwave(inputspace, 16, 32, 16)
outputspace += traceray(inputspace, 16, -32, 1, 3)

plt.imshow(outputspace, \
           extent=[np.min(inputspace[:,:,0]), np.max(inputspace[:,:,0]), np.min(inputspace[:,:,1]), np.max(inputspace[:,:,1])], \
           interpolation='nearest', vmin=-4, vmax=4, cmap=mpl.cm.bwr)
plt.show()
