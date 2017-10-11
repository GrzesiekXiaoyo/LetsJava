package com.company.EqualTheObjects;

public class Person implements Comparable<Person> {
    public String Name;
    public String Name2;

    @Override //ciekawostka jezeli bysmy chcieli przechowywac ten obiekt w HashSet/LinkedHashSet/HashMap bysmy musieli overidowac metode hashCode() zeby dziallo super szybko
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person2 = (Person) obj;
            return this.Name.equals(person2.Name) && this.Name2.equals(person2.Name2);
        }

        return false;
    }

    @Override
    public int compareTo(Person o) {
        if (this.Name.compareTo(o.Name) == 0 && this.Name2.compareTo(o.Name2) == 0) {
            return 0;
        }
        return 1;
    }
}
