#include <iostream>
#include <cmath>

using namespace std; 

int main()
{
	int a, b;
	int sum = 1;
	int count;
	cin >>a;
	count = 1;
	if (a > 1)
	{
		while (sum < a )
		{
			sum = sum + 6*count;
			count++;
		}
		cout << count;
	}
	else
	{
		cout << count;
	}




}
