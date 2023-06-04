class Test { //CLass keyword is use to create class and Test is the class name

    public static void main(String args[])// this is a way to create a function we have to remember  this and this line runs in jvm. JVM consisder Main as starting point
    {
        System.out.println("Hellow World!!"); //Prints the output
        int a = 50;
        System.out.println(a);

        a = 20; //changing the variable value . We dont need to declare value data type later changing
        System.out.println(a);

        //Type Casting
        //Automatic type casting done by JVM(Implicit type casting)
        int i = 5;
        System.out.println(i);
        double d = i;
        System.out.println(d);
        //Forcefully (Explicit type casting)
        double myval = 34.32;
        int myint = (int) d;    // Have to use int to change
        System.out.println(myint);


    }

}
