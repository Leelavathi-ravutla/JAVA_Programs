import java.util.Scanner;
class day2_2{
    public static void main(String[] args){
        int steps;
        Scanner sc=new Scanner(System.in);
        steps=sc.nextInt();
        if(steps<1000){
            System.out.println("sedevator");
        }
        else if(steps>=1000 && steps<=1199){
            System.out.println("Active");
        }
        else if(steps>=1200 && steps<=1999){
            System.out.println("activeee");
        }
        else if(steps>=2000 && steps<=4999){
            System.out.println("gggg");
        }
        else if(steps>5000){
            System.out.println("fgdgh");
        }
        else{
            System.out.println("Invalid");
        }
    }
}