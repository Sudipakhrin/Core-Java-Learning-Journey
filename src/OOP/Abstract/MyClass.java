package OOP.Abstract;

abstract public class MyClass {
    //complete method
    public void cal(){
        System.out.println("calculating results");
    }
    //abstract method
    abstract void LunchRocket();
}

// abstract class cannot have object
class Start{
    public static void main(String[] args) {
        MyChild mychild = new MyChild();
            mychild.LunchRocket();
            mychild.cal();


    }

}