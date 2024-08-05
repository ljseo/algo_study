#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int a,b;
	int c[10000] = { 0 };
	int d[10000] = { 0 };
	int count=0;
	int sum = 0;
	
	scanf("%d", &a);

	for (int i = 0; i < a; i++)
	{
		scanf("%d", &b);
		c[i] = b;

		for (int j = c[i]; j > 0; j--)
		{
			if (c[i] % j == 0)
			{
				d[i] += 1;
			}
		}
	}

	for (int q = 0; q < a; q++)
	{
		if (d[q] == 2)
		{
			sum += 1;
		}
	}
	printf("%d", sum);
	return 0;
}
