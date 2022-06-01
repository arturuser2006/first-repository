
public class Main {

	static int[] array = new int[250];
	static boolean isSorted = false;
	
	public static void main(String[] args) {
		
		generateArray(array);
		
		while (!isSorted) {
			
			isSorted = true;
			
			for (int i = 1;i < array.length;i++) {
				
				if (array[i] < array[i-1]) {
					
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					isSorted = false;
				}
			}
			showArray(array);
		}
	}

	public static void showArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void generateArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random() * 251);
		}
	}
}
