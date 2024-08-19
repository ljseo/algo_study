#include <iostream>
#include <string>
#include <vector>
#include <cmath>
using namespace std;

int main()
{
    int a, b,d;
    vector<int> c;
    int sum = 0;
    cin >> a;

    for (int i = 0; i < a; i++)
    {
        cin >> b;
        if (b == 0)
        {
            if (empty(c) == 1)
            {
                c.push_back(b);
            }
            else
            {
                c.pop_back();
            }
        }
        else
        {
            c.push_back(b);
        }
    }

    for (int i = 0; i<c.size(); i++)
    {
        sum += c[i];
    }
    cout << sum;
    return 0;
}
