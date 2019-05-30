import java.util.*;
class Student {
}
class Rockstar {
}
class Hacker {
}
public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of times you want to call objects");
		int n=s.nextInt();
		String[] a=new String[n];
		int count1=0,count2=0,count3=0;
		System.out.println("enter classes names :");
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		for(int i=0;i<n;i++) {
			if(a[i].equalsIgnoreCase("student")) {
				//System.out.println("student");
				Student student=new Student();
				if(student instanceof Student) {
					count1++;	
				}
			}else if(a[i].equalsIgnoreCase("rockstar")) {
				Rockstar rockstar=new Rockstar();
				if(rockstar instanceof Rockstar) {
					count2++;
				}
			}else if(a[i].equalsIgnoreCase("hacker")) {
				Hacker hacker=new Hacker();
				if(hacker instanceof Hacker) {
					count3++;
				}
			}else {
				System.out.println("invalid entry");
			}
		}
		s.close();
		System.out.println("Student	       	rockstar	    Hacker");
		System.out.println("  "+count1+ "                    "+count2+ "		  "+count3 );

	}

}
