package com.company.Enkapsulacja;

public class Person {

    //chcemy zadbac o to zeby do Name nikt nie wpisal Nulla, dzieki metodzie mozemy zadbac o to co sie stanie zanim zostanie przypisane
    private String Name;
    private String Name2;

    public String getName() {
        return Name + " "+  Name2;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.length() < 4) {
            throw new Exception();
        }

        if(name.length()>12)
        {
            Name2 = name.substring(12);
        }

        Name = name;
    }
}
