import java.util.Scanner;
import static java.lang.Math.*;
class day2_1{
    public static void main(String[] args){
        double s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
        double v1,v2,v3;
        v1=pow(s1,2);
        v2=pow(s2,2);
        v3=pow(s3,2);
        if(v1+v2==v3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}