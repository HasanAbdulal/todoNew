package com.think.javalevel1;

public class ArrayPassingToMethod {
    //  Variables call by value, but array call by reference (address)
    // 1.Passing array to method
    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    static int[] getArray() {
        int ar[] = {1, 2, 3, 5};
        return ar;
    }

    static void setArray(int[] a) {
        a[0] = 104; // This array will affect the main array
    }

    // Compare this method with the above method
    static void getArray(int k) {
        k = 7;
    }

    public static void main(String[] args) {
        // 1.
        int[] arr = {1, 2, 3, 4, 5};
        print(arr);
        /*int[] x = new int[]{4, 2, 3, 1, 0};
        System.out.println(new int[]{4, 2, 3, 1, 0}[2]);*/
//        System.out.println(getArray()); // [I@15aeb7ab
        int[] ar1 = getArray();
        System.out.println(ar1[1]);

        // A track
        int[] aro1 = {1, 2, 3, 4, 5};
        int[] aro2 = {45, 24, 20, 60, 10};
        aro1 = aro2;
        aro2[0] = 100;
        System.out.println("An array #" + aro1[0]); // 100 not 45 or 1

        // An array call by reference
        int ref[] = {91, 32, 63, 40, 25}; // the main array
        setArray(ref);
        System.out.println("Array Reference : " + ref[0]); // 104 not 91

        // An array call by value
        int val = 109;
        getArray(val);
        System.out.println("Array Value : " + val); // 109 not 7
    }
}
