package com.company.CheckMe;

public class CheckMeTester {
    public static void Test() {
        Check check = new Check();
        check.StupidMethod(); //Hi Exception
        check.StupidMethod2(); // No Exception
        check.StupidMethod3(); // No Exception
    }
}
