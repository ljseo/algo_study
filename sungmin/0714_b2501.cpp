#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int a,b;
	int c[10000] = { 0 };
	int count=0;
	
	scanf("%d %d", &a, &b);

	for (int i = a; i >0; i--)
	{
		if (a % i == 0)
		{
			c[count] = a / i;
			count += 1;
		}
	}
	if (c[b-1] != 0)
	{
		printf("%d", c[b-1]);
	}
	else
	{
		printf("0");
	}

	return 0;
}
