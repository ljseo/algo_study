#include <iostream>
#include <cmath>

using namespace std; 

int main()
{
	int a, b;
	int sum=0;
	int Quarter ;
	int Dime ;
	int Nickel ;
	int Penny;
	cin >>a;

	for (int i = 0; i < a; i++)
	{
		cin >> b;
		Quarter = b / 25;
		Dime = (b % 25) / 10;
		Nickel = ((b % 25) % 10) / 5;
		Penny = ((b % 25) % 10) % 5;
		cout << Quarter <<" " << Dime << " " << Nickel << " " << Penny<<endl;
	}
	

}
