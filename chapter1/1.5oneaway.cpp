#include<iostream>
#include<map>
#include<string.h>
#include<stdlib.h>

using namespace std;

int main(){

	char inp1[100];
	char inp2[100];
	
	cin >> inp1;
	cin >> inp2;
	
	int len1 = strlen(inp1);
	int len2 = strlen(inp2);
	
	int i,j;
	int oca = 1;
	
	int changes = abs(len1-len2);
	
	if(changes<=1){
		int min = len1<=len2?len1:len2;
		for(i=0;i<min;i++){
			if(changes < 2){
				if(inp1[i] != inp2[i]){
					changes++;
				}
			}
			else{
				oca = 0;
				break;
			}
		}
	}
	else{
		oca = 0;
	}
	
	if(oca == 1){
		cout << "One change away\n";
	}
	else{
		cout << "Not one change away\n";
	}
		
}
