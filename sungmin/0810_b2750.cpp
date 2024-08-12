#include <iostream>
#include <cmath>

using namespace std; 

int main()
{
	int a, b;
	int c[1000];
	int sum = 1;
	int count;
	int temp;
	cin >>a;
	
	for (int i = 0; i < a; i++)
	{
		cin >> b;
		c[i] = b;
	}

	for (int j = 0; j < a-1; j++)
	{
		for (int q = j + 1; q < a; q++)
		{
			if (c[j] <= c[q])
			{
				temp = c[q];
				c[q] = c[j];
				c[j] = temp;
			}
		}
	}

	for (int i = a-1; i >=0; i--)
	{
		cout << c[i]<<endl;
	}

}
