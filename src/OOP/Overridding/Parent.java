package OOP.Overridding;

public class Parent {
    //Overridden method
    public void m1()
    {
        System.out.println("i am m1() of parent class");
    }

}

class child extends Parent{
    //overridding method
    public void m1(){
        System.out.println("I am m1() of child class");
    }

}
