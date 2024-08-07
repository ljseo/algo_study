#include <iostream>

using namespace std; 

int main()
{
	int a,b,c;

	cin >> a ;
	cin >> b;
	cin >> c;

	if (a + b + c == 180)
	{
		if ((a == 60) && (b == 60) && (c == 60))
		{
			cout << "Equilateral";
		}
		else if ((a == b) && (a != c))
		{
			cout << "Isosceles";
		}
		else if ((b == c) && (a != c))
		{
			cout << "Isosceles";
		}
		else if ((a == c) && (b != c))
		{
			cout << "Isosceles";
		}
		else
		{
			cout << "Scalene";
		}
	}
	else
	{
		cout << "Error";
	}

	return 0;
}
