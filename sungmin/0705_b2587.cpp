#include <iostream>
#include <cmath>

using namespace std; 

int main()
{
	int a, b;
	int c[5];
	int sum = 0 ;
	int avg=0;
	int temp;
	int min = 100;
	for (int i = 0; i < 5; i++)
	{
		cin >> b;
		c[i] = b;
	}
	for (int j = 0; j < 5; j++)
	{
		for (int q = 0; q < 5; q++)
		{
			if (c[j] <= c[q])
			{
				temp = c[q];
				c[q] = c[j];
				c[j] = temp;
			}
		}
	}

	for (int i = 0; i <5; i++)
	{
		sum += c[i];
	}

	avg = sum / 5;

	cout << avg << endl << c[2];
}
