import java.util.Scanner;

public class SwayaanAss {
   public static void main(String[] args) {
	System.out.println("Enter the size  of an Array: ");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	int arr[]=new int[s];
	System.out.println("Enter the Elements:  ");
	for(int i=0;i<s;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0,c=0;
	for(int i=0;i<s;i++)
	{
		if(isValid(arr[i]))
		{
			c++;
			sum+=arr[i];
		}
	}
	System.out.println(sum/c);
}

private static boolean isValid(int n) {
	int p=2;
	while(p<=n)
	{
		if(p==n)
			return false;
		p=p*2;
	}
	return true;
}
}
