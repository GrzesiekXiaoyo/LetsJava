package com.company.Enkapsulacja;

public class EnkapsulacjaTester {
    public static void Test() {
        Person p = new Person();
        // p.Name compilation error
        //1. co sie stanie kiedy teraz na person zawolamy Name?
        System.out.println(p.getName()); //null

        //2. Prawidlowy Set
        try {
            p.setName("TESTOWO");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(p.getName()); //TESTOWO
        p = new Person();

        //3. Nieprawidlowy Set
        try {
            p.setName(null);
        } catch (Exception e) {
            System.out.println("exception"); //exception
            System.out.println(p.getName()); //null
        }
        p = new Person();

        //p.setName("aa");



        //4. Nieprawidlowy Set
        try {
            p.setName("aa");
        } catch (Exception e) {
            System.out.println("exception"); //exception
            System.out.println(p.getName()); //null
        }
        p = new Person();
    }

}
