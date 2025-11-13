import java.util.*;
public class Electricitybill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-----Electricity Bill Generator Based On Slab Rate-----");
        System.out.println("Enter how many units consumed:");
        int units=sc.nextInt();
        int Billamount=0;
        if(units<=100){
            Billamount=units*10;
        }
        else if(units<=200){
            Billamount=(100*10)+(units-100)*15;
        }
        else{
            Billamount=(100*10)+(100*15)+(units-200)*20;
        }
        System.out.println("Total Bill Amount:"+Billamount);
    }
}