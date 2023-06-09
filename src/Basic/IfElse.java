public class IfElse {
    public static void main(String args[]) {
        int n = 12;
        //Simple If , it does not have else condition
//        if(n>5){
//            System.out.println("Yes it is");
//        }

        // True Block
        if (n > 5) {
            System.out.println("Yes it is ");
        } else {
            System.out.println("No it is not");
        }
        //ladder if
        int m = 70;

        if (m > 90) {
            System.out.println("Grade A");
        } else if (m >= 80 && m <= 90) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }
        //nested If
        int num =142;
        if (num>100)
        {
            System.out.println("IT is greater than 100");
            if (num%2==0)
            {
                System.out.println("It is odd");
            }
        }
    }
}