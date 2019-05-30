class Arithmetic{
	int add(int a,int b) {
		return (a+b);
	}
	float add(float a,float b) {
		return (a+b);
	}
	double add(double a,double b) {
		return (a+b);
	}
}
public class Adder extends Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a=new Adder();
		System.out.println("double method:" +a.add(22.3,3443.56));
		System.out.println("int method" +a.add(13, 20));
		System.out.println("float method"+a.add(3.5, 4.5));
	}

}
