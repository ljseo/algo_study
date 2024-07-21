#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int a,b;
	int c[10000] = { 0 };
	int count=0;
	int sum = 0;
	
	scanf("%d", &a);
	do
	{

		for (int i = a; i > 0; i--)
		{
			if (a % i == 0)
			{
				c[count] = a / i;
				count += 1;
			}
		}

		for (int i = 0; i < count - 1; i++)
		{
			sum += c[i];
		}
		if (sum == a)
		{
			printf("%d = ", a);
			for (int j = 0; j < count - 1; j++)
			{
				if (j == count - 2)
				{
					printf("%d\n", c[j], a);
				}
				else
				{
					printf("%d + ", c[j]);
				}
			}
		}
		else
		{
			printf("%d is NOT perfect.\n", a);
		}
		sum = 0;
		count = 0;
		scanf("%d", &a);
	} while (a != -1);

	return 0;
}
