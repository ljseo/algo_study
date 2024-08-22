#include <string>
#include <vector>
#include <cmath>
using namespace std;

int solution(string s) {
    int answer = 0;
    string a="";
    for(int i=0;i<s.size();i++)
    {
        if(s[i]>='0'&&s[i]<='9')
        {
            a+=s[i];
        }
        else if(s[i]=='z')
        {
            a+='0';
            i=i+3;
        }
          else if(s[i]=='o')
        {
            a+='1';
            i=i+2;
        }
         else if(s[i]=='t')
        {
             if(s[i+1]=='w')
             {
                a+='2';
                i=i+2;
             }
             else
             {
                a+='3';
                i=i+4; 
             }
        }
         else if(s[i]=='f')
        {
             if(s[i+1]=='o')
             {
                a+='4';
                i=i+3;
             }
             else
             {
                a+='5';
                i=i+3; 
             }
        }
        else if(s[i]=='s')
        {
             if(s[i+1]=='i')
             {
                a+='6';
                i=i+2;
             }
             else
             {
                a+='7';
                i=i+4; 
             }
        }
           else if(s[i]=='e')
        {
            a+='8';
            i=i+4;
        }
           else if(s[i]=='n')
        {
            a+='9';
            i=i+3;
        }
    }
    for(int i=0;i<a.size();i++)
    {
        answer+=(a[i]-'0')*pow(10,a.size()-1-i);
    }
    return answer;
}
