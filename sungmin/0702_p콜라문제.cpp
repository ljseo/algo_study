#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int n) {
    int answer = 0;
    while(a<=n&&n<=1000000)
    {
        answer+=b*(n/a);
        n=n-(a*(n/a))+b*(n/a);
    }
    return answer;
}
