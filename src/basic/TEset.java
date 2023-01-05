package basic;

public class TEset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] multiArr[] = new int[3][4];
//
//		for (int i = 0; i < multiArr.length; i++) {
//			for (int j = 0; j < multiArr[i].length; j++) {
//				System.out.println(multiArr[i][j]);
//			}
//		}

		// Case2
		String[] u_Apt[] = { { "가", "나", "다" }, { "a", "b", "c" } }; // {} 개수가 그거임

		// Case3
		String herApt[][] = new String[][] { { "A", "B" }, { "C", "D" }, { "Z", "Y", } };
		for (int i = 0; i < herApt.length; i++) {
			for (int j = 0; j < herApt[i].length; j++) {
				System.out.println(herApt[i][j]);
			}
		}
		char[] stars[] = new char[10][];
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i + 1];
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
	}
}
