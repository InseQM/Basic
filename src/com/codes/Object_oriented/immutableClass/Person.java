package com.codes.Object_oriented.immutableClass;

public class Person {

    private final Name name;
//    public Person(Name name){
//
//        this.name = name;
//    }
//
//    public Name getName() {
//
//        return name;
//    }
    public Person(Name name){
        this.name = new Name(name.getFirstname(), name.getLastname());
    }

    public Name getName() {
        return new Name(name.getFirstname(), name.getLastname());
    }

    public static void main(String[] args){
        Name n = new Name("悟空" ,"孙");
        Person p = new Person(n);
        System.out.println(p.getName().getFirstname());
        n.setFirstname("八");
        System.out.println(p.getName().getFirstname());
    }
}

