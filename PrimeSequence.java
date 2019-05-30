import java.util.*;
public class PrimeSequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter count :");
		int n=s.nextInt();
		System.out.println("enter numbers:");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		int rem=0,num=0;
		for(int j=0;j<n;j++) {
			num=a[j];
			 rem=num%2;
			 num=num/2;
			 rem=rem/2;
			
		}
	}

}
