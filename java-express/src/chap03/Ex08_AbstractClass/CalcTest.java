package chap03.Ex08_AbstractClass;

public class CalcTest {

	public static void main(String[] args) {
		
		GoodCalc gc = new GoodCalc();
		int [] arr = {1, 2, 3, 4, 5};
		
		System.out.println("a + b = " + gc.add(10, 20));
		System.out.println("a - b = " + gc.subtract(20, 10));
		System.out.println("arr¿« ∆Ú±’ = " + gc.average(arr));
	}
}
