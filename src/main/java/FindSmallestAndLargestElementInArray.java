public class FindSmallestAndLargestElementInArray {
    public static void main(String[] args) {
        int[] data = {10,20,5,15,22,30,30,0,1,};
        findSmallestAndLargestElementInArray(data);
    }

    public static void findSmallestAndLargestElementInArray(int[] data) {
        if (data != null && data.length > 0) {
            int smallest = data[0];
            int largest = data[0];
            for (Integer element : data) {
                if (element < smallest) {
                    smallest = element;
                }
                if (element > largest) {
                    largest = element;
                }
            }
            System.out.println("Smallest: " + smallest + " largest: " + largest);
        }
    }

}
