//Program to get Greatest number from the existing two numbers
import java.util.Scanner;
class prog_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("the greatest number is n1");
        }
        else{
            System.out.println("the greatest number is n2");
        }
    }
}