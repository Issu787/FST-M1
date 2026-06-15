package activities;

public class Activity2 {
	public static void main(String[] args) {
		int [] numArrays= {10, 77, 10, 54, -11, 10};
		int sum=0;
		//System.out.println("Original Array: " + Arrays.toString(numArrays));
		
		for (int num : numArrays) {
            if (num == 10) {
                sum += num;
            }
        }
		
		boolean result = (sum == 30);


        System.out.println("Result: " + result);
	}
}
