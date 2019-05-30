interface Honda {
	void engine();
}
interface Bike {
	void type();
}
public class InterfaceExample implements Honda,Bike {
	public void engine() {
		System.out.println("this contains egine implementation....in "+Honda.class);
	}
	public void type() {
		System.out.println("this is of type bike.....in "+Bike.class);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i=new InterfaceExample();
		Honda h=new InterfaceExample();
		i.engine();
		i.type();
	}

}
