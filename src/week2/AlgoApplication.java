package week2;

public class AlgoApplication {
    public static void main(String[] args) {
        maxSortArray();
        minSortArray();
    }

    private static void maxSortArray() {
        int[] arr = {20, 15, 30, 100, 5 ,75, 40, 2};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if ()
//            }
//        }
    }

    private static void minSortArray() {
        int[] arr = {4, 15, 30, 100, 5, 1 ,75, 2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
