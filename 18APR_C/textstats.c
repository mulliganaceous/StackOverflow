void inputtext(){

    char text[1000][1000];
    FILE *fptr;
    char fname[100]="text.file";
    fptr=fopen(fname,"w");
    if(fptr==NULL){
        printf("Error in opening file");
        exit(1);
    }
    while(!feof(stdin)){
        fgets(text,sizeof text,stdin);
        fprintf(fptr,"%s",text);
    }
    fclose(fptr);
}

void textstatistics(){

    char text[1000][1000];
    FILE *fptr;
    char fname[100]="text.file";
    char fname2[100];
    FILE *fptr2;
    char ch;
    int wrd=0,chr1=0,chr2=0,dupl=0;
    int i,j;
    fptr=fopen(fname,"r");
    ch=fgetc(fptr);
    while(ch!=EOF){
         /*words*/
        if(ch==' ' || ch=='\n'){
            wrd++;
        }
         /*characters with blanks*/
        if(ch!=' ' && ch!='\n'){
            chr1++;
        }
        /*characters without blanks*/
        if(ch!='\n'){
            chr2++;
        }
        ch=fgetc(fptr);
    }
