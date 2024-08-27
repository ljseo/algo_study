#include <string>
#include <vector>
#include <cmath>
using namespace std;

int solution(int number, int limit, int power) {
    int answer = 0;
    vector<int> a;
    for(int i=1;i<=number;i++)
    {
        int b=0;
        for(int j=1;j<=sqrt(i);j++)
        {
            if(i%j==0)
            {
                b++;
                if (j * j != i) {
                        b++;
                    }
            }
        }
        a.push_back(b);
    }
    
    for(int i=0;i<a.size();i++)
    {
        if(a[i]<=limit)
        {
            
        }
        else
        {
            a[i]=power;
        }
        answer+=a[i];
    }
    return answer;
    
}
