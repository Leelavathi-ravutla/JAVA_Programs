import java.util.Scanner;
class prog_12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=2;
        System.out.print(1+" ");
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print(a+" ");
        System.out.println("Factors are "+count);
    }
}