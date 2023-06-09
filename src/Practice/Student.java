//Create a Student class with two private instance variables: name (String) and age (int). 
//Add a constructor to this class that accepts these two parameters and initializes the instance variables accordingly.

package Practice;



public class Student {
    private String name;
    private int age;
    
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void Detail()
    {
        System.out.println(name+ " "+age);
    }
}
