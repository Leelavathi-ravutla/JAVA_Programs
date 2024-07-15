// Program to get Smallest character from the existing two characters
import java.util.Scanner;
class prog_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two characters");
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        if(a<b){
            System.out.println("the smallest character is "+a);
        }
        else{
            System.out.println("the smallest character is "+b);
        }
    }
}