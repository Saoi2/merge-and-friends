public class Merge2Lists {

	public static int[] Merge(int[] A, int[] B) {
		int size = (A.length + B.length);
		int[] C = new int[size];

		System.out.println("A.length = " + A.length);
		System.out.println("B.length = " + B.length);

		// i = index for A, j = index for B, k = index for C
		for (int i = 0, j = 0, k = 0; k < size; k++) {
			if (B.length <= j) {
				C[k] = A[i];
				i++;
			} else if (A.length <= i) {
				C[k] = B[j];
				j++;

			} else if(A[i] <= B[j]) {
				C[k] = A[i];
				i++;
			} else {
				C[k] = B[j];
				j++;
			}
		}
		return C;
	}

	public static void main(String[] args) {
		int[] sortedListA = {2, 4, 6, 10, 11, 12, 13};
		int[] sortedListB = {1, 2, 3, 5};

		int[] newSortedList = Merge(sortedListA, sortedListB);

		for(int i = 0; i < newSortedList.length; i++) {
			System.out.println(newSortedList[i]);
		}

	}
}
