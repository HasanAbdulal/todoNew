package com.think.javaOOP.anonymousInnerClass2;

public class Main {
    public static void main(String[] args) {
        // Anonymous class is created and instantiated at the same time
        // Anonymous inner class does not have a constructor because it is not a class

        // TryClass tryClass = new TryClass(3)
        // The var keyword is used to declare a local variable
        // It accepts any type of data (primitive or class )
        // Is not allow to use var in class level (generally)
        // Not allow with a generic type
        // Limitation: var is not allowed to be used in the parameter list of a method 
        var tryClass = new TryClass(3) {
            // We can, in fact, attach an initializer block to an anonymous inner class.
            {
                System.out.println("Initializer block called");
            }

            private int x = 3;

            @Override
            public void tryMethod() {
                System.out.println(this.getClass());
            }

            public void tryMethod2() {
                System.out.println("Anonymous class called " + x);
            }
        };
        tryClass.tryMethod2();
    }
}
