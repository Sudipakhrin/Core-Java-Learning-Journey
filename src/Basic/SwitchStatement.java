public class SwitchStatement {
    public static void main(String args[]){

        String day = "Mon";

        switch(day){

            case "Sun":
                System.out.println("It is Sunday");
                break;
            case "Mon":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
