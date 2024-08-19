#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

bool desc(int a, int b) {
    return a > b;
}

int main()
{
    string a;
    long long b,c=0;

    cin >> b;
    a = to_string(b);

    for (int i = 0; i < a.size(); i++)
    {
        sort(a.begin(), a.end(),desc);
    }
    for (int i = 0; i < a.size(); i++)
    {
        c += (a[i] - '0') * pow(10, a.size() - 1 - i);
    }
    cout << c;
    return 0;
}
