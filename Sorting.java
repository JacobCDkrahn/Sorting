import java.util.Arrays;

public class Sorting {
	public static int k = 0;

	public static void main(String[] args) {
		int small[] = ArrayBuilder(10);
		int small2[] = small.clone();

		int medium[] = ArrayBuilder(100);
		int medium2[] = medium.clone();
		int large[] = ArrayBuilder(1000);
		int large2[] = large;

		int bubbleSmall;
		int bubbleMed;
		int bubbleLarge;
		int qsSmall;
		int qsMed;
		int qsLarge;

		System.out.println("__________________________________");
		System.out.println("__________________________________");
		System.out.println("________________Small_____________");
		System.out.println("_________Unsorted array___________");
		System.out.println("__________________________________");

		System.out.println(Arrays.toString(small));
		System.out.println("__________________________________");
		System.out.println("________________Small_____________");
		System.out.println("___________BubbleSort_____________");
		System.out.println("__________________________________");
		k = 0;
		bubbleSort(small);
		bubbleSmall = k;
		System.out.println(Arrays.toString(small));
		System.out.println("Total number of actions:" + bubbleSmall);

		System.out.println("__________________________________");
		System.out.println("________________Small_____________");
		System.out.println("___________QuickSort______________");
		System.out.println("__________________________________");
		k = 0;

		quickSort(small2, 0, small2.length - 1);
		qsSmall = k;
		System.out.println(Arrays.toString(small2));
		System.out.println("Total number of actions:" + qsSmall);

// ---------------------------------------------------------------------

		System.out.println("__________________________________");
		System.out.println("__________________________________");
		System.out.println("_____________Medium_______________");
		System.out.println("_________Unsorted array___________");
		System.out.println("__________________________________");

		System.out.println(Arrays.toString(medium));
		System.out.println("__________________________________");
		System.out.println("_______________Medium_____________");
		System.out.println("___________BubbleSort_____________");
		System.out.println("__________________________________");
		k = 0;
		bubbleSort(medium);
		bubbleMed = k;
		System.out.println(Arrays.toString(medium));
		System.out.println("Total number of actions:" + bubbleMed);

		System.out.println("__________________________________");
		System.out.println("______________Medium_____________");
		System.out.println("___________QuickSort______________");
		System.out.println("__________________________________");
		k = 0;

		quickSort(medium2, 0, medium2.length - 1);
		qsMed = k;
		System.out.println(Arrays.toString(medium2));
		System.out.println("Total number of actions:" + qsMed);

		// ---------------------------------------------------------------------

		System.out.println("__________________________________");
		System.out.println("__________________________________");
		System.out.println("______________Large______________");
		System.out.println("_________Unsorted array___________");
		System.out.println("__________________________________");

		System.out.println(Arrays.toString(large));
		System.out.println("__________________________________");
		System.out.println("________________Large_____________");
		System.out.println("___________BubbleSort_____________");
		System.out.println("__________________________________");
		k = 0;
		bubbleSort(large);
		bubbleLarge = k;
		System.out.println(Arrays.toString(large));
		System.out.println("Total number of actions:" + bubbleLarge);

		System.out.println("__________________________________");
		System.out.println("________________Large_____________");
		System.out.println("___________QuickSort______________");
		System.out.println("__________________________________");
		k = 0;

		quickSort(large2, 0, large2.length - 1);
		qsLarge = k;
		System.out.println(Arrays.toString(large2));
		System.out.println("Total number of actions:" + qsLarge);

		System.out.println("__________________________________");
		System.out.println("______________Results______________");
		System.out.println("__________________________________");
		System.out.println("Bubble Sort Small Array: "+ bubbleSmall);
		System.out.println("Quick Sort Small Array: "+ qsSmall);
		System.out.println("Bubble Sort Medium Array: "+ bubbleMed);
		System.out.println("Quick Sort Medium Array: "+ qsMed);
		System.out.println("Bubble Sort Large Array: "+ bubbleLarge);
		System.out.println("Quick Sort Large Array: "+ qsLarge);
		
		
		
		
		
	}

	public static int[] ArrayBuilder(int size) {
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 100);

		}

		return array;
	}

	public static void quickSort(int[] array, int start, int end) {

		if (start < end) {
			k++;
			int middle = partition(array, start, end);

			quickSort(array, start, middle - 1);
			quickSort(array, middle + 1, end);
		}

	}

	public static int partition(int[] array, int start, int end) {
		k++;

		int last = array[end];
		int i = (start - 1);
		for (int j = start; j < end; j++) {
			k++;

			if (array[j] <= last) {

				i++;
				k++;
				int temp = array[i];
				k++;
				array[i] = array[j];
				k++;
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		k++;
		array[i + 1] = array[end];
		k++;
		array[end] = temp;

		return i + 1;
	}

	public static void bubbleSort(int[] array) {

		k = 0;
		boolean swapped;
		for (int i = 0; i < array.length - 1; i++) {
			k++;
			swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				k++;
				if (array[j] > array[j + 1]) {
					k++;
					int temp = array[j];
					k++;

					array[j] = array[j + 1];
					k++;
					array[j + 1] = temp;
					k++;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}

	}

}
