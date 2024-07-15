import java.util.Scanner;
class prog_5{
    public static void main(String[] args){
        int time;
        Scanner sc=new Scanner(System.in);
        time=sc.nextInt();
        if(time>=5 && time<=11){
            System.out.println("Good Morning");
        }
        else if(time>=12 && time<=16){
            System.out.println("Good Afternoon");
        }
        else if(time>=17 && time<=20){
            System.out.println("Good Evening");
        }
        else if(time>=21 && time<24 || time>=0 && time<=4){
            System.out.println("Good Night");
        }
        else{
            System.out.println("Invalid time");
        }
    }
}