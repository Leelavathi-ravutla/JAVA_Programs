import java.util.Scanner;
class prog_8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String day=sc.next().toLowerCase();
        switch (day){
            case "monday":
            case "wednesday":
                System.out.println("Basket Ball");
                break;
            case "tuesday":
            case "friday":
                System.out.println("Tennis");
                break;
            case "thursday":
                System.out.println("Cricket");
                break;
            case "saturday":
                System.out.println("Exercise");
                break;
            case "sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}