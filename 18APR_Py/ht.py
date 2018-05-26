import re, requests
from bs4 import BeautifulSoup as bs

def getAttributes(url):
    #categoria = re.search('\/shop\/([^\/.]+)\/', url)
    #re = requests.get(url)
    data = requests.get(url).text
    soup = bs(data, 'lxml')
    
    #Teste para Ficha Técnica
    all_a = soup.find_all('a')
    all_div = soup.find_all('div')
    
    link_f_tecnica = None
    prod_description = None
    prod_designer = None
    prod_tag_images = None
    
    for one_a in all_a:
        if 'href' in one_a.attrs:
            if '.pdf' in one_a.attrs['href']:
                link_f_tecnica = one_a.attrs['href']
    prod_name = soup.find(itemprop = 'name').text
    
    if soup.find(itemprop = 'description'):
        prod_description = soup.find(itemprop = 'description')
    if soup.find(id = 'mais_produtos_designer'):
        prod_designer = soup.find(id = 'mais_produtos_designer')
    prod_tag_images = soup.find('div', id = 'novo-images')
    prod_images_list = []

    if prod_tag_images: # Handle cases where prod_tag_images equal None
        for tags in prod_tag_images.find_all('a'):
            prod_images_list.append(tags.attrs['href'])
    print(prod_name, prod_description, prod_designer, link_f_tecnica, prod_images_list)
