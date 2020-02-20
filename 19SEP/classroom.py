classroom = {'Classroom': 
    [{'Subject': "Calculus", 'Students': 
        [
        {'Name': "Joe", 'Age': 12, 'Weight': 126, 'Gender': "Male"}, 
        {'Name': "Doug", 'Age': 13, 'Weight': 95, 'Gender': "Male"},
        {'Name': "Omg", 'Age': 50, 'Weight': 99, 'Gender': "Female"}
        ]
    }]
}

mylist = []
studentlist = classroom['Classroom'][0]['Students']
for s in studentlist:
    m = (s['Name'], s['Age'], s['Gender'])
    mylist.append(m)
print(mylist)
