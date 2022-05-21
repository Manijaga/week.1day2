package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		int[] arrtwo = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arrtwo.length; j++) {
				if (arr[i] == arrtwo[j]) {
					System.out.println("The Matching Value Array Is " + arr[i]);
					break;
				}
			}

		}

	}

}
