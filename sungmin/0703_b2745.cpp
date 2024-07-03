#include<iostream> 
#include<cmath>
#include<cstring>
using namespace std;

int main()
{
	string a;
	int b,sum;
	
	cin >> a >> b;
	sum = 0;

	for (int i = 0; i < a.size(); i++)
	{
		if (a[i] >= '0' && a[i] <= '9')
		{
			sum += (a[i] - '0')*pow(b, a.size() - 1 - i);
		}
		else
		{
			sum += (a[i] - '7')*pow(b, a.size() - 1 - i);
		}
	}
	cout << sum;
}
