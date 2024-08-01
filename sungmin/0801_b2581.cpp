#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int a,b;
	int c[10000] = { 0 };
	int d[10000] = { 0 };
	int min;
	int sum = 0;
	
	scanf("%d", &a);
	scanf("%d", &b);
	min = b;
	for (int i = a; i <= b; i++)
	{
		for (int j = i; j > 0; j--)
		{
			if (i % j == 0)
			{
				d[i] += 1;
			}
		}
	}

	for (int q = a; q <=b; q++)
	{
		if (d[q] == 2)
		{
			if (q < min)
			{
				min = q;
			}
			sum+=q;
		}
	}
	if (sum == 0)
	{
		printf("-1");
	}
	else {
		printf("%d\n", sum);
		printf("%d\n", min);
	}
	return 0;
}
