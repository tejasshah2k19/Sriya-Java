
public class ForEachAndLblLoop {

	public static void main(String[] args) {
		int a[] = { 1, 2, 33, 44, 55, 66 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// forEach -- read only
		for (int x : a) {
			System.out.println(x);
			x = x + 20;
		}

		f: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (i == j)
					break f;
			}
			System.out.println("");
		}

		int j = 95;
		switch (j) {
		case 100:
			System.out.println("100");
			break;
		case 90:
			System.out.println("90");
		case 45 + 50:
			System.out.println("45+50");
		default:
			System.out.println("default");
			break;
		}

	}
}
