public class Main {
    public static void main(String[] args) {
        int[] test = {53, 25, 67, 13, 4, 9, 60, 23};
        sortArray(test); // output: 4, 9, 13, 23, 25, 53, 60, 67
        // !!! Sorting an array in ascending order is a precondition for binary searching
        for (int k : test)
            System.out.print(k + " "); // printing out our new array which is sorted to check sorting algorithm
        System.out.println();
        int result = BinarySearch.binarySearch(test, 60);
        System.out.println(result);
    }

    static void sortArray(int[] list) {
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k <= list.length - 1; k++) {
                if (list[i] > list[k]){
                    temp = list[i];
                    list[i] = list[k];
                    list[k] = temp;
                }
            }
        }
    }
}