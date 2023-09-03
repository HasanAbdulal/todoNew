package javaLevel1;

public class ArrayString {
    public static void main(String[] args) {
        String str = "Hello ThinkPad Lover";
        str = str.concat(", Enjoy your journey"); // concat() method appends the string at the end
//        str = str + ", Enjoy your journey";
        System.out.println(str);

        // Two string objects are created in the heap memory
        // They both refer to the same place in memory
        String str0 = "Think";
        String str1 = "Think"; // String literals are stored in a common pool
        String str2 = "ThinkPad"; // 
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str0 == str1); // true

        // compare two strings
        /*
         * st1 > st2: return positive
         * st1 < st2: return negative
         * st1 == st2: return zero
         * Its based on the unicode value of each character in the string,
         * The comparison begins with the first distinct characters after comparing all the characters st1 and st2.
         * */
        String st1 = "ABCD"; // D: 68
        String st2 = "ABCe"; // e: 101
        System.out.println(st1.compareTo(st2)); // 68-101 = -33

        // Trim method
        String st3 = "   Hello World   ";
        System.out.println(st3.trim() + ", Hi"); // remove the leading and trailing spaces

        // Upper case and lower case
        String st4 = "Samsung Galaxy S24 Ultra";
        System.out.println("Upper case : " + st4.toUpperCase());
        System.out.println("Lower case : " + st4.toLowerCase());

        // Transform a different data type to string
        // Casting from int to string
        int num = 100;
        String st5 = String.valueOf(num);
        String st6 = num + "";
        System.out.println(st5);

        // Equals method
        String st7 = "Hello";
        String st8 = "Hello";
        String st9 = "hello";
        System.out.println(st7 == st8); // true
        System.out.println(st7.equals(st8)); // true
        System.out.println(st7.equals(st9)); // false

        // The key word new will create a new object in the heap memory
        // Which means the two strings are not equal from the address side
        String st10 = new String("Hello"); // The two strings are equal from the value side
        String st11 = new String("Hello");
       /* st10 = st11; // st10 and st11 are pointing to the same address, which means they are equal from the address side 
        System.out.println("st10 == st11 : " + (st10 == st11));*/
        System.out.println("st10 == st11 : " + (st10 == st11)); // false, because they are two different addresses
        System.out.println(st10.equals(st11)); // true, because they are equal from the value side, and the e quals 
        // method compares the value

        // EqualsIgnoreCase method
        // It compares the value of two strings, but ignore the case
        // It is case-insensitive
        // It must respect the quantity of characters and the characters themselves; otherwise, it will return false.
        System.out.println(st7.equalsIgnoreCase(st9)); // true

        // Replace method
        String st12 = "Welcome to the world of Java";
        String replaceStr = st12.replace("Java", "Python");
        System.out.println(replaceStr);
        String replaceStrg = st12.replace("e", "W");
        System.out.println(replaceStrg);

        // Contains method  
        String st13 = "Welcome to the world of Java";
        System.out.println(st13.contains("Java")); // true
//        System.out.println(st13.contains('j')); // false, accepts only " not '
        System.out.println(st13.contains("J")); // true, case-sensitive, 
        System.out.println(st13.contains("Think")); // false

        // EndsWith method
        String st14 = "Welcome to the world of C#";
        System.out.println(st14.endsWith("C#")); // true
        System.out.println(st14.endsWith("c#")); // false, case-sensitive\

        // substring method
        String st15 = "Welcome";
        System.out.println(st15.substring(3)); // come
        System.out.println(st15.substring(0, 4)); // Welc

        // Split method
        // Remove the spaces and split the string into a string
        String st16 = "Welcome; to; the; world; of; Java;";
        String removeSpace = st16.replace(" ", "");
        String[] splitStr = removeSpace.split(";");
        for (String s : splitStr) {
            System.out.print(s);
        }
        /*for (int i = 0; i < splitStr.length; i++) {
            System.out.print(splitStr[i]);
        }*/
    }
}
