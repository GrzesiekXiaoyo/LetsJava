package com.company;

import com.company.AbstractClass.AbstractTester;
import com.company.CheckMe.CheckMeTester;
import com.company.Enkapsulacja.EnkapsulacjaTester;
import com.company.EqualTheObjects.EqualTester;
import com.company.Konstruktory.KonstruktorTester;
import com.company.MyCollection.MyCollectionTester;
import com.company.OverrideMethod.OverrideTester;
import com.company.Polimorfizm.PolimorfizmTester;

public class Main {

    public static void main(String[] args) {
        PolimorfizmTester.Test();
        EnkapsulacjaTester.Test();
        KonstruktorTester.Test();
        OverrideTester.Test();
        AbstractTester.Test();
        CheckMeTester.Test();
        MyCollectionTester.Test();
        EqualTester.Test();
    }
}
