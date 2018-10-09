public class MergeInPlace {

		//int[] List = {1, 3, 5, 7, 9, 11, 0, 3, 6, 9, 12, 15};
		//              0  1  2  3  4   5  6  7  8  9  10  11

		// We will merge and put the results back into the same
		// places they came from, here's the calling signature:
		// MergeInPlace(List, Start, Middle (index of 2nd half), End)
		//MergeInPlace(List, 0, 6, 11);

	public static void FunctMergeInPlace(int[] list, int aStart, int bStart, int bEnd) {
		int[] sortedList = new int[list.length];
		// i = index for A, j = index for B, k = index for C
		for (int i = aStart, j = bStart, k = aStart; k <= bEnd; k++) {
			if (bEnd <= j) {
				sortedList[k] = list[i];
				i++;
			} else if (bStart - 1 <= i) {
				sortedList[k] = list[j];
				j++;

			} else if(list[i] <= list[j]) {
				sortedList[k] = list[i];
				i++;
			} else {
				sortedList[k] = list[j];
				j++;
			}
		}
		for (int i = aStart; i <= bEnd; i++) {
			list[i] = sortedList[i];
		}

	}

	public static void main(String[] args) {
		int[] aaaa = {1, 3, 5, 7, 9, 11, 0, 3, 6, 9, 12, 15, 16};
		//            0  1  2  3  4   5  6  7  8  9  10  11, 12

		for(int i = 0; i < aaaa.length; i++) {
			System.out.print(aaaa[i] + " ");
		}
		System.out.println();
						
		// We will merge and put the results back into the same
		// places they came from, here's the calling signature:
		// MergeInPlace(List, Start, Middle (index of 2nd half), End)
		FunctMergeInPlace(aaaa, 0, 6, 11);

		for(int i = 0; i < aaaa.length; i++) {
			System.out.print(aaaa[i] + " ");
		}
		System.out.println();

	}
}
