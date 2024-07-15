// program to read age of 3 siblings and display the age of the youngest sibling
import java.util.Scanner;
class prog_3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt();
        int age2=sc.nextInt();
        int age3=sc.nextInt();
        if(age1<0 || age2<0 || age3<0){
            System.out.println("Invalid age");
        }
        else{
            if(age1<age2 && age1<age3){
                System.out.println(age1);
            }
            else if(age2<age3){
                System.out.println(age2);
            }
            else{
                System.out.println(age3);
            }
        }
    }
}