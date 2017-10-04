package com.company.Enkapsulacja;

public class Person {

    //chcemy zadbac o to zeby do Name nikt nie wpisal Nulla, dzieki metodzie mozemy zadbac o to co sie stanie zanim zostanie przypisane
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.length() < 4) {
            throw new Exception();
        }

        Name = name;
    }
}
