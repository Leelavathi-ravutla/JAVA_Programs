import java.util.Scanner;
class assignment3_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i!=0){
            //System.out.println(i*i);
            if(i*i<n+1){
                i=i+1;
                continue;
            }
            else if(i*i>n+1){
                //System.out.println(n+"is a sunny number");
                break;
            }
            else{
                System.out.println(n+"is a sunny number");
                break;
            }
            //i=i+1;
        }
    }
}