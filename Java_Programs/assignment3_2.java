import java.util.Scanner;
class assignment3_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%10;
        if(n%7==0 || r==7){
            System.out.println(n+"Buzz number");
        }
    }
}