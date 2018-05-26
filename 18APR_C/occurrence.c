#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct occurence {
    char ch;
    int occurs;
};

int main() {
    char *name = "Oighea";

    
    for(int j=0;j<strlen(name);j++){
        for(int i=0;i<strlen(name);i++){
            if(chars[i].ch=='\0'){
                chars[i].ch=name[i];
                chars[i].occurs=1;
                break;
            }
            else if(chars[j].ch==name[i]){
                chars[i].occurs++;
                break;
            }
        }
    }   
}