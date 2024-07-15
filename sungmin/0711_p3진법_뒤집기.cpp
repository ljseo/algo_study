#include <string>
#include <vector>
#include <cmath>
using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> a;
    for(int i=0;n>0;i++)
    {
        a.push_back(n%3);//10진법 n을 3진법 n으로 배열a에 저장
        n=n/3;
    }
    for(int i=0;i<a.size();i++)
    {
        answer+=a[i]*pow(3,a.size()-i-1);//3진법으로 저장된 배열a를 뒷자리부터 더해서 10진법 수를 구합니다.
    }
    return answer;
}
