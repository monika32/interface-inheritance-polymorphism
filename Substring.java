import java.util.*;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		System.out.println("enter range:");
		int i=s.nextInt();
		int j=s.nextInt();
		s.close();
		String sub=str.substring(i, j);
		System.out.println("substring is: "+sub);
		
		
	}

}
