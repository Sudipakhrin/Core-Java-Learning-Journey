package OOP.Abstract;

public interface shape {
    public static final int i =34;

    void calculator(int r);
    //defult abstract method
}

class Circle implements shape{
    @Override
    public void calculator(int r) {
        System.out.println("Area of circle is "+(Math.PI*r*r));
    }

    public static void main(String[] args) {
        shape s1 = new Circle();
        s1.calculator(2);
    }
}