package chap03.Ex08_AbstractClass;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	@Override
	public int subtract(int a, int b) {
		int sum = a - b;
		return sum;
	}

	@Override
	public double average(int[] a) {
		double avg = 0.0;
		int sum = 0;
		
		/* �迭 a ��ҵ��� ����� ���Ͽ� return �Ͻÿ�. */
		int cnt = a.length;
		for(int i= 0; i<cnt; i++) {
			sum += a[i];
		}
//		for (int i : a) {
//			sum += i;
//		}
		avg = sum / cnt;
		return avg;
	}

}
