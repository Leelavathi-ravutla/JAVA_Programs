// Reverse a number
import java.util.Scanner;
class prog_15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,d;
        for(int i=n;i!=0;i=i/10){
            d=i%10;
            r=r*10+d;
        }
        System.out.println(r);
        // check for palindrome
        if(n==r){
            System.out.println("palindrome");
        }
    }
}