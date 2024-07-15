package com.day1;

/*import java.util.Scanner;

public class Program4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}*/
public class Program4
{
	public static void main(String[] args) {
		int i,m=0,flag=0;
		int n=8;
		m=n/2;
		if(n==0|| n==1)
		{
			System.out.println(n+"is not Prime number");
		}
		else {
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" Is not a prime number");
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				System.out.println(n+" Is prime number");
			}
		}
	}
}

