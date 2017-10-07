package com.company.EqualTheObjects;

public class EqualTester {

    public static void Test()
    {
        Person first = new Person();
        first.Name = "Tomasz";
        first.Name2 = "Kowalski";

        Person otherThenFirst = new Person();
        otherThenFirst.Name = "Grzesiek";
        otherThenFirst.Name2 = "Kowalski";

        Person otherThenFirst2 = new Person();
        otherThenFirst2.Name = "Tomasz";
        otherThenFirst2.Name2 = "Nowak";

        Person likeFirst = new Person();
        likeFirst.Name = "Tomasz";
        likeFirst.Name2 = "Kowalski";

        EqualatorPerson equalatorPerson = new EqualatorPerson();
        System.out.println("***equalatorPerson.EqualPerson()***");
        equalatorPerson.EqualPerson(first,otherThenFirst); //Person are not the same
        equalatorPerson.EqualPerson(first,otherThenFirst2); //Person are not the same
        equalatorPerson.EqualPerson(first,likeFirst); // Person are the same

        System.out.println("***equalatorPerson.EqualPersonPropByProp()***");
        equalatorPerson.EqualPersonPropByProp(first,otherThenFirst); //Person are not the same
        equalatorPerson.EqualPersonPropByProp(first,otherThenFirst2); //Person are not the same
        equalatorPerson.EqualPersonPropByProp(first,likeFirst); // Person not the same

        System.out.println("***first.compareTo(others)***");
        System.out.println(first.compareTo(otherThenFirst)); //1
        System.out.println(first.compareTo(otherThenFirst2));//1
        System.out.println(first.compareTo(likeFirst));//0

        System.out.println("***first.equals(others)***");
        System.out.println(first.equals(otherThenFirst)); //false
        System.out.println(first.equals(otherThenFirst2));//false
        System.out.println(first.equals(likeFirst));//true
    }
}
