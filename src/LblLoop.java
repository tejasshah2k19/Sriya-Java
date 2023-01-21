
public class LblLoop {

	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.print(j);
		}
	}
}
//1
//12
