import java.util.Scanner;

public class fascinating_number{

    // Function to check if a number is fascinating
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Multiply the number by 2 and 3
        int n1=sc.nextInt();
        int n2 = n1 * 2;
        int n3 = n1 * 3;
        int nn1=n1,l=0;
        while(nn1!=0){
            nn1/=10;
            l++;
        }
        int l1=l;
        int n=0;
        //System.out.println(l);
        while(l>0){
            n1=n1*10;
            l--;
        }
        //System.out.println(n1);
        n1=n1+n2;
        //System.out.println(n1);
        while(l1>0){
            n1=n1*10;
            l1--;
        }
        //System.out.println(n1);
        n1=n1+n3;
        //System.out.println(n1);
        int i;
        for(i=n1;i!=0;i=i/10){
            int r=n1%10;
            if(r==1 || r==2 || r==3 || r==4 ||r==5||r==6||r==7||r==8||r==9){
                continue;
            }
            else{
                break;
            }
            //n1=n1/10;
        }
        if(i==0){
            System.out.println("Fascinating number"); 
        }
        else{
            System.out.println("Not Fasinating number");
        }
        
        
    }
}