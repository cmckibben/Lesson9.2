package org.example;

class Grandparent {
  private int age;

  public Grandparent(int age) { this.age = age;}

  public void getAge() {
    System.out.println("Grandparent Age: " + age);
  }
  public void getNoise() { System.out.println("Grandparent noise");}
}

class Parent extends Grandparent{
  private int age;

  public Parent(int age) {
    super(age+30);
    this.age = age;
  }

  public void getAge() {
    super.getAge();
    System.out.println("Parent Age: " + age);
  }
}

class Child extends Parent{
  private int age;

  public Child(int age) {
    super(age+30);
    this.age = age;
  }

  public void getAge() {
    super.getAge();
    System.out.println("Child Age: " + age);
  }
}

class Main {
  public static void main(String[] args) {
    Child myChild = new Child(15);
    myChild.getAge();
  }
}