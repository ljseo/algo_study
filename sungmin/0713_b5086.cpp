#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	int a,b,c;
	a = 1;
	b = 1;
	while ((a != 0) && (b != 0))
	{
		scanf("%d %d", &a, &b);
		if (a == 0 && b == 0)
		{
			break;
		}
		if (b % a == 0)
		{
			printf("factor\n");
		}
		else if (a % b == 0)
		{
			printf("multiple\n");
		}
		else
		{
			printf("neither\n");
		}
	}

	return 0;
}
