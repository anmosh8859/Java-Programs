import java.util.Scanner;
class Array
{
	public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter,How many number you want to enter in array");
		int n=p.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers in array");
		int i=0;
		for(i=0;i<n;i++)
			arr[i]=p.nextInt();
		System.out.println("Enter the number to be searched");
		int searchNumber=p.nextInt();
		for(i=0;i<n;i++)
			{
				if(arr[i]==searchNumber)
				{
					System.out.println("Number is present");
					break;
				}
			}
			if(i==n)
				{
					if(arr[i-1]!=searchNumber)
						System.out.println("Number is not present");
				}
		for(i=0;i<n;i++)
			System.out.println("a["+i+"]:"+arr[i]);
	}
}