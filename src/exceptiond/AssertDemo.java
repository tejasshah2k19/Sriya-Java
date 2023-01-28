package exceptiond;

public class AssertDemo {

	public static void main(String[] args) {

		System.out.println(MyMath.add(5, 6));

		assert MyMath.add(6, 6) == 12;
//		assert MyMath.add(5, 5) == 11:"expecting 11 but got "+MyMath.add(5, 5);
	}
}

class MyMath {

	static int add(int x, int y) {
		return x + y;
	}
}

//java 1.4


//1 2 3
//int assert;//

//4+
//int assert;//error 