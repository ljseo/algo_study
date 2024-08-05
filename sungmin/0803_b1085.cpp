#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
	int a,b,c,d;
	int min1,min2,min3,min4;
	int sum = 0;
	
	scanf("%d %d %d %d", &a,&b,&c,&d);
	
	min1 = abs(c - a);
	min2 = a;
	min3 = abs(d-b);
	min4 = b;

	if ((min1 <= min2) && (min1 <= min3) && (min1 <= min4))
	{
		printf("%d", min1);
	}
	else if ((min2 <= min1) && (min2 <= min3) && (min2 <= min4))
	{
		printf("%d", min2);
	}
	else if ((min3 <= min2) && (min3 <= min1) && (min3 <= min4))
	{
		printf("%d", min3);
	}
	else
	{
		printf("%d", min4);
	}

	return 0;
}
