import java.util.Scanner;
class prog_18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0,r,v=0;
        for(int i=n;i!=0;i=i/10){
            p++; 
        }
        //System.out.println(2^p);
        int k=1;
        while(n!=0){
            int j=p;
            r=n%10;
            while(j>0){
                k=k*r;
                j--;
            }
            v=v+r;
            n=n/10;

        }
        System.out.println(v);

    }
}