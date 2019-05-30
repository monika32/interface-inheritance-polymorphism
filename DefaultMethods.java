interface Sayable {       
	default void say(){
		System.out.println("Hello, this is default method");    
    }        
    void sayMore(String msg);    
    static void sayLouder(String msg){   
    	System.out.println(msg);    
    }    
}    
public class DefaultMethods implements Sayable{    
	public void sayMore(String msg){     
		System.out.println(msg);    
    }    
	static void sayLouder(String msg) {
    	System.out.println("sowjanya barrey "+msg);    
    } 
    public static void main(String[] args) {    
      DefaultMethods dm = new DefaultMethods();    
      dm.say();                       
      dm.sayMore("Work is worship");        
      DefaultMethods.sayLouder("Helloooo...");   
    }    
}