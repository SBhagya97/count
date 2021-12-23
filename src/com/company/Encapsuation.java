package com.company;

public class Encapsuation {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
class Encap{
public static void main(String[] args) {
    Encapsuation e= new Encapsuation();
    String name="Dons";
    e.setName(name);
    System.out.println(e.getName());
}
}