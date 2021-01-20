package com.javalearning;

public class RemoveDuplicateFromArray {
    public static int removeDuplicate(int[] a, int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1])
                a[j++] = a[i];
        }
        a[j++] = a[n - 1];
        return j;
    }


    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 4, 4};
        int length = a.length;
        length = removeDuplicate(a, length);
        for (int i = 0; i < length; i++) {
            System.out.println(a[i]);
        }
    }


}



