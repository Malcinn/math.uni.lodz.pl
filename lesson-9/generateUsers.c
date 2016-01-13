#include <stdio.h>

int main (int argc, char* argv[]){

	char* fileName;
	char* fileMode;
	FILE* file;
	int numberOfUsers;

	if (argc == 3){
		fileName = argv[1];
		numberOfUsers = atoi(argv[2]);
	}else{
		fileName = "Users.csv";
		numberOfUsers = 10;
	}
	
	fileMode = "w";
	file = fopen(fileName,fileMode);

	if (file == 0){
		printf("%s\n", "Could not open a file.");
	}
	else{
		int iterator = 0;
		for (iterator = 0; iterator<numberOfUsers; iterator++){
			fprintf(file,"%s", "Marcin,");
			fprintf(file,"%s", "Kowalczyk,");
			fprintf(file,"%s%i%s", "marcinkowalczyk1992",iterator,"@gmail.com");
			fprintf(file,"\n");
		}
		fclose(file);
	}
	
	return 0;
}