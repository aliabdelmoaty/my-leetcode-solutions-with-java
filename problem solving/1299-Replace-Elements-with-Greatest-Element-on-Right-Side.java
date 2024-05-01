class Solution {
     public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                }
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));

        return arr;
    }
}