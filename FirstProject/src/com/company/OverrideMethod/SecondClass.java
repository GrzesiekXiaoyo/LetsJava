package com.company.OverrideMethod;

public class SecondClass extends FirstClass {

    @Override
    public String LetFight() {
        String a = super.LetFight(); //nie musimy wolac klasy bazowej, oprocz tego nie jest tka jak w konstruktorach to znaczy ze mozemy zawolac kilka razy
        super.LetFight();
        super.LetFight();
        return a+"SC";
    }

}
