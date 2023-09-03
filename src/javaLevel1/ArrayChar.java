package javaLevel1;

import java.util.Arrays;

public class ArrayChar {
    public static void main(String[] args) {
        char[] chars = new char[7];
        chars[0] = 'E';
        chars[1] = 'y';
        chars[2] = 'e';
        chars[3] = 's';
        chars[4] = 'a';
        chars[5] = 'f';
        chars[6] = 'e';
        System.out.print(chars);
        /*for (char aChar : chars) {
            System.out.print(aChar);
        }*/
        char[] chars0 = {'E', 'y', 'e', 'S', 'a', 'f', 'e'};
        System.out.print(chars0);

        // ACII code
        char[] chars1 = new char[]{55, 44, 22, 44, 77, 43};
        System.out.print("\n" + chars1); // [C@15aeb7ab

        char[] arr = {'r', 'w', 'M', 'u', 'h', 'm'};
        Arrays.sort(arr);
        System.out.println("\n" + Arrays.toString(arr));

        char[] arr0 = {'r', 'w', 'M', 'u', 'h', 'm'};
        String str = new String(arr0, 2, 4);
        System.out.println("\n" + str);// Muhm
    }
}
