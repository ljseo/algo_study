#include <iostream>
#include <cmath>

using namespace std; 

int main()
{
	int a, b;
	int c;
	int d[1000] = {0};
	int sum = 0 ;
	int avg=0;
	int temp;
	int min = 10000;
	cin >> a>>b;
	for (int i = 0; i < a; i++)
	{
		cin >> c;
		d[i] = c;
	}

	for (int p = 0; p < a; p++) {
		for (int k = 0; k < a; k++)
		{
			if (d[p] >= d[k])
			{
				temp = d[p];
				d[p] = d[k];
				d[k] = temp;
			}
		}
	}
	cout << d[b - 1];
}
