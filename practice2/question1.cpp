#include <stdio.h>
#include<iostream>
#include <iostream>
using namespace std;
int main()
{
   int a,b,c;
   cout<<"Enter the values";
   cin>>a>>b>>c;
   if(a!=7 && b!=7 && c!=7)
   {
       cout<<a*b*c;
   }
   else if(b==7){
       cout<<c;
   }
   else if(a==7){
       cout<<c*b;
   }
   else{
       cout<<"-1";
   }
   return 0;
   
}
