#include<iostream>
#include<string.h>

using namespace std;

int main(){
	char str[100];
	char check[100];
	int i,j;
	cin >> str;
	int k = 0;
	int len = strlen(str);
	int unique = 1;
	for(i=0;i<len;i++){
		int contains = 0;
		for(j=0;j<k;j++){
			if(str[i] == check[j]){
				contains = 1;			
			}				
		
		}
		if(contains == 0){
			check[k] = str[i];
			k++;
		}
		else{
			unique = 0;
		}
	}
	if(unique == 1){
		cout << "Unique characters";
	}
	else{
		cout << "Repetetive characters";
	}
}
