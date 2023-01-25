package com.example.hellworld; /* declare package source */

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("hello world!"); /* sout */
        // String s = "hello zhang liang";
        // System.out.println(s);

        // Variables v = new Variables();
        // v.printTypeMinMaxValue();
        // v.printFloatAddition();
        // v.printStringMethods();
        // v.printArray();

        //var interactive = new Interactive();
        // interactive.inputDemo();
        // interactive.flowDemo();
        // System.out.println(interactive.div(3.14,69.0));

        // Staff staff = new Staff("hello world!", 10);
        // Staff[] staffs = {
        //         new Staff("CY", 30),
        //         new Staff(11),
        //         new Staff("YUNA"),
        // };
        // for (Staff staff1 : staffs) {
        //     System.out.println(staff1.toString());
        // }
        // Staff.print_hello();
        // System.out.println(Staff.greetings);
        // staff.handle(new int[] {1, 2, 3});
        // staff.handle(new int[]{});
        // int[] r = staff.returnArray();
        // System.out.println(Arrays.toString(r));

        Derived derived = new Derived();
        System.out.println(derived.foo());
        System.out.println(derived.bar());
    }
}
