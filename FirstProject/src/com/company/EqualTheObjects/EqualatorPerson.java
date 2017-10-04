package com.company.EqualTheObjects;

public class EqualatorPerson {

    public void EqualPerson(Person person, Person person2)
    {
        if(person.equals(person2))
        {
            System.out.println("Person are the same");
        }
        else
        {
            System.out.println("Person are not the same");
        }
    }

    public void EqualPersonPropByProp(Person person, Person person2)
    {
        if(person.Name==person2.Name && person.Name2==person2.Name2)
        {
            System.out.println("Person are the same");
        }
        else
        {
            System.out.println("Person are not the same");
        }
    }

}
