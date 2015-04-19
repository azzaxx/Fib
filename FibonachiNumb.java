public class FibonachiNumb {
	public static void main(String[] arg) {
		int fFirst = 0;
		int fSecond = 1;
		int lValue = 0;
		int max = 4000000;

		for (int i = 0; fFirst < max;) {
			i = fFirst + fSecond;
			if (i % 2 == 0) {
				lValue += i;
			}
			fSecond = fFirst;
			fFirst = i;
		}
		System.out.println(lValue);
	}
}
