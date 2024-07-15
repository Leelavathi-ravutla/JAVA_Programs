import java.util.Scanner;
class prog_10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double price=sc.nextInt();
        System.out.println((int)price);
        double d_price=price,dd_price;
        if(age>=13 && age<=19){
            d_price=price-(5.0*price)/100;
            if(d_price>5000){
                dd_price=d_price-(5.0*d_price)/100;
                d_price=dd_price;
            }
            System.out.println((int)d_price);
            System.out.println((int)(price-d_price));
        }
        else if(age>=20 && age<=29){
            d_price=price-(6.0*price)/100;
            if(d_price>4000){
                dd_price=d_price-(6.0*d_price)/100;
                d_price=dd_price;
            }
            System.out.println((int)d_price);
            System.out.println((int)(price-d_price));
        }
        else if(age>29){
            d_price=price-(15.0*price)/100;
            System.out.println((int)d_price);
            System.out.println((int)(price-d_price));
        }
        else{
            System.out.println((int)price);
        }
    }
}