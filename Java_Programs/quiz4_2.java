import java.util.Scanner;
class quiz4_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double d;
        if(a>500){
            d=(10.0*a)/100;
            System.out.println(a-d); 
        }
        else if(a>250 && a<=500){
            d=(5.0*a)/100;
            System.out.println(a-d);
        }
        else{
            System.out.println(a);
        }
    }
}