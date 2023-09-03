package javaLevel1;

public class Methods {
    // Very simple method
    // A method is a block of code which only runs when it is called.
    // You can pass data, known as parameters, into a method.
    // javaLevel1.Methods are used to perform certain actions, and they are also known as functions.
    // Why use methods? To reuse code: define the code once, and use it many times.
    // You can use the same code many times with different arguments, to produce different results.
    // When a method has a void return type, use the keyword return without a value to return.
    // When a method has a non-void return type, you must use the keyword return followed by a value to return.
    /* Any method declared void doesn't return a value. It does not need to contain a return statement,
     * but it may do so. In such a case, a return statement can be used to branch out of a control flow block
     * and exit the method and is simply used like this: return; */
    // This faction cannot be stored in a variable if any method returns a void value.
    /*static void myMethod(int n1, int n2) {
        System.out.println("sum = " + (n1 + n2));
        return;
    }*/

    static String myWords(String word) {
        System.out.println(word);
        return word;
    }

    public static void main(String[] args) {
//        myMethod(5, 10);
        String word = myWords("Hello Thinker!");
        System.out.println(word);
    }
}
