import java.util.Scanner;
class DeleteSpecificNumber
{
	public static void main(String[] args)
	{
		int j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("How many numbers you wanna enter in the array?");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers in array");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Your Array:");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]:"+a[i]);
		System.out.println("Enter the number you wanna delete from the array");
		int del=s.nextInt();
		int f=0;
		for(int i=0;i<n;i++)
		{
			while(a[i]==del)
			{
				a[i]=a[i+1];
				f++;
				for(j=i;j<n;j++)
					a[j]=a[j+1];
			}
		}
		System.out.println("Your Array:");
		for(int i=0;i<(n-f);i++)
			System.out.println("a["+i+"]:"+a[i]);
	}
}