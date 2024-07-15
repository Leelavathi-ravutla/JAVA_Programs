import java.util.Scanner;
class quiz3_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextInt();
        double h=sc.nextInt();
        double f=sc.nextInt();
        double bmi=w/(h*h);
        double fee;
        if(bmi<18.5){
            fee=(15.0*f)/100;
            System.out.print("Underweight ");
            System.out.print(bmi);
            System.out.print(fee);
        }
        else if(bmi<=18.5 && bmi <= 24.9) {
            fee=(10.0*f)/100;
            System.out.print("Normal weight ");
            System.out.print(bmi);
            System.out.print(fee);
        }
        else if (bmi>=25 && bmi<=29.9){
            fee=(5.0f)/100;
            System.out.print("Overweight");
            System.out.print(bmi);
            System.out.print(fee);
        }
        else if(bmi>=30) {
            System.out.println("No discount");
        }
        else{
            System.out.println("Invalid");
        }
    }
}