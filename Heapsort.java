
public class Heapsort {

	
	public static Comparable[] sort (Comparable[] a) {
		Comparable[] array = a;
		int length = array.length;
		Comparable[] sorted = new Comparable[length];
		
		//length/2-1 is the formula for the last parent
		for(int j = length/2-1; j >= 0; j--) {
		max_heap(array, length, j);
		}
		
		for(int v = length-1; v>0; v--) {
			swap(0, v, array);
			length--;
			max_heap(array, length, 0);
		}
		
		
		return array;
		
	}
	
	private static void max_heap(Comparable[] array, int size, int parent) {
		int max = parent;
		int left_child = parent*2+1;
		int right_child = parent*2+2;
		
		
		
		if(left_child < size && isSmaller(array[max], array[left_child])  ) {
			max = left_child;
		}
		
		if(right_child < size && isSmaller(array[max], array[right_child])) {
			max = right_child;
		}
		
		if(max != parent) {
			swap(max,parent,array);
			max_heap(array, size, max);
		}
		
	}
	
	private static boolean isSmaller(Comparable smaller, Comparable bigger) {
        return smaller.compareTo(bigger) < 0;
    }
	
	private static Comparable[] swap(int i1, int i2, Comparable[] array) {
		Comparable[] arr = array;
		Comparable temp;
		temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		return arr;
	}
	
	
}
