/**
 * © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/9/11 12:50 <br>
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 3, 54,11, 6, 8, 9, 4, 7, 4};
        me(arr);
    }

    public static void me(int[] arr) {
        //for (int i = 1; i < arr.length; i++) {
        //    for (int j = 0; j < arr.length - i; j++) {
        //        if (arr[j] > arr[j + 1]) {
        //            int temp = arr[j];
        //            arr[j] = arr[j + 1];
        //            arr[j + 1] = temp;
        //        }
        //    }
        //}

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

