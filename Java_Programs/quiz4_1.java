import java.util.Scanner;
class quiz4_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        if(n1<0 || n2<0 || n3<0 || n4<0){
            int a=0,b=0,c=0,d=0;
            if(n1<0){
                a=-(n1);
            }
            if(n2<0){
                b=-(n2);
            }
            if(n3<0){
                c=-(n3);
            }
            if(n4<0){
                d=-(n4);
            }
            if(a>b && a>c && a>d){
                System.out.println(n1);
            }
            else if(b>c && b>d){
                System.out.println(n2);
            }
            else if(c>d){
                System.out.println(n3);
            }
            else{
                System.out.println(n4);
            }
        }
        else if(n1<n2 && n1<n3 && n1<n4){
            System.out.println(n1);
        }
        else if(n2<n3 && n2<n4){
            System.out.println(n2);
        }
        else if(n3<n4){
            System.out.println(n3);
        }
        else{
            System.out.println(n4);
        }
    }
}