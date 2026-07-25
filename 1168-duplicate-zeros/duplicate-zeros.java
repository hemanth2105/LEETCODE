class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;
        int[] arr1 = new int[n];

        int i = 0;
        int j = 0;

        while (i < n && j < n) {

            if (arr[i] == 0) {
                arr1[j] = 0;
                j++;

                if (j < n) {
                    arr1[j] = 0;
                    j++;
                }
            } else {
                arr1[j] = arr[i];
                j++;
            }

            i++;
        }

        for (int k = 0; k < n; k++) {
            arr[k] = arr1[k];
        }
    }
}