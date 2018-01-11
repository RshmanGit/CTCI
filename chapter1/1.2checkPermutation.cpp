#include<iostream>
#include<string.h>
#include<map>
#include<utility>

using namespace std;

int main(){

	char str1[100];
	char str2[100];
	
	cin >> str1 >> str2;
	
	map<char, int> checkMap1;
	map<char, int> checkMap2;
	
	int len1 = strlen(str1);
	int len2 = strlen(str2);
	
	int i,j;
	
	bool perm = true;
		
	if(len1 != len2){
		perm = false;
	}
	else{
		for(i=0;i<len1;i++){
			checkMap1[str1[i]] = 0;
			checkMap2[str2[i]] = 0;
		}
		for(i=0;i<len1;i++){
			checkMap1[str1[i]]++;
			checkMap2[str2[i]]++;
		}
		for(i=0;i<len1;i++){
			if(checkMap1[str1[i]] != checkMap2[str1[i]]){
				perm = false;
				break;
			}
		}
	}
	if(perm){
		cout << "The strings are permutations of each other";
	}
	else{
		cout << "Not permutations";
	}
	
}
