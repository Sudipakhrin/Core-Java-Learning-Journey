package OOP;

 class Student {
     // data: data members, Instance Varable
    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("Creating object : non-p");
    }

    public Student(int st){
        System.out.println("Parameterized Constructor");

    }

    //Behaviour: member methods :(Functions)
     public void study(){
         System.out.println(studentName+"is studying");
     }
     public void showFullDetails(){
         System.out.println("My name is " +" "+ studentName);
         System.out.println("My id is" + " "+studentId);
         System.out.println("i am from" +" "+ studentCity);
     }
}
