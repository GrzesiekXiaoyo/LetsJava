package com.company.CheckMe;

public class Check {
    public void StupidMethod() {
        try {
            String test = (String) null;
            int length = test.length();
            System.out.println("No Exception");
        } catch (Exception e) {
            System.out.println("Hi Exception");
        }
    }

    public void StupidMethod2() {
        try {
            Integer value = Integer.MAX_VALUE + 1;
            System.out.println("No Exception");
        } catch (Exception e) {
            System.out.println("Hi Exception");
        }
    }

    public void StupidMethod3() {
        try {
            //checked jak w c# zlapal by wyjatek ? nie ma w javie trzeba pisac wlasna implementacje
            Integer value = Math.addExact(Integer.MAX_VALUE ,1);
            System.out.println("No Exception ");
        } catch (Exception e) {
            System.out.println("Hi Exception");
        }
    }
}
