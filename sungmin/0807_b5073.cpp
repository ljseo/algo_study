#include <iostream>

using namespace std; 

int main()
{
	int a,b,c;
	cin >> a >> b >> c;
	while ((a != 0) && (b != 0) && (c != 0))
	{
		if ((a == b) && (a == c))
		{
			cout << "Equilateral\n";
		}
		else
		{

			if ((a >= b) && (a >= c))
			{
				if (a < b + c)
				{
					if ((b == c) || (a == b) || (a == c))
					{
						cout << "Isosceles\n";
					}
					else {
						cout << "Scalene\n";
					}
				}
				else
				{
					cout << "Invalid\n";
				}
			}
			else if ((a <= b) && (b >= c))
			{
				if (b < a + c)
				{
					if ((b == c) || (a == b) || (a == c))
					{
						cout << "Isosceles\n";
					}
					else {
						cout << "Scalene\n";
					}
				}
				else
				{
					cout << "Invalid\n";
				}
			}
			else
			{
				if (c < b + a)
				{
					if ((b == c) || (a == b) || (a == c))
					{
						cout << "Isosceles\n";
					}
					else {
						cout << "Scalene\n";
					}
				}
				else
				{
					cout << "Invalid\n";
				}
			}
		}
		cin >> a >> b >> c;

	}

	return 0;
}
