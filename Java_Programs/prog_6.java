import java.util.Scanner;
class prog_6{
    public static void main(String[] args){
        double temp_c,temp_f;
        Scanner sc=new Scanner(System.in);
        temp_c=sc.nextDouble();
        temp_f=(temp_c*(9.0/5))+32;
        if(temp_f>=70 && temp_f<=80){
            System.out.println(temp_f);
            System.out.println("Temperature is within the range");
        }
        else{
            System.out.println(temp_f);
        }

    }
}