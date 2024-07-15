import java.util.Scanner;
class prog_7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        int e1=0,e2=0,e3=0;
        if(a%2==0){
            count=count+1;
            e1=a;
        }
        if(b%2==0){
            count=count+1;
            e2=b;
        }
        if(c%2==0){
            count=count+1;
            e3=c;
        }
        switch(count)
        {
            case 1:
                System.out.println(e1+e2+e3);
                /*if(a%2==0){
                    System.out.println(a);
                }*/
                break;
            case 2:
                System.out.println(e1+e2+e3);
                break;
            case 3:
                System.out.println(e1*e2*e3);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}



