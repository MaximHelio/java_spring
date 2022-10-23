package chap03.Ex10_DynamicBinding;

class SuperObject{
	int a = 10;
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("Super Object");
	}
}

public class Subobject extends SuperObject {

	int a = 20;
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		super.draw();
		System.out.println("Sub Object");
	}
	
	public static void main(String[] args) {
		SuperObject obj = new Subobject();
		
		obj.paint();
		System.out.println(obj.a);
	}
}
