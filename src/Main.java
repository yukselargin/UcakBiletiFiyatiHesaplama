import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int km, age,type;
        double unit =0.10, subTotal,total=0, per50=0.5,per10=0.9,per20=0.8,per30=0.7,gidisDonus=2;
        boolean isError = false;
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        subTotal= km*unit;
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=>Tek yön 2=>Gidiş Dönüş): ");
        type = input.nextInt();
        if(km>0){
            if(age>0){
                if(age<12){
                    switch(type) {
                        case 1:
                            total = subTotal*per50;
                            break;
                        case 2:
                            total= subTotal*per50*per20*gidisDonus;
                            break;
                        default:
                            isError= true;
                            break;
                    }
                } else if(age>=12 && age<=24){
                    switch(type){
                        case 1:
                            total = subTotal*per10;
                            break;
                        case 2:
                            total= subTotal*per10*per20*gidisDonus;
                            break;
                        default:
                            isError= true;
                            break;
                    }
                } else if(age>24 && age<=65) {
                    switch (type) {
                        case 1:
                            total=subTotal;
                            break;
                        case 2:
                            total=subTotal*per20*gidisDonus;
                            break;
                        default:
                            isError= true;
                            break;
                    }
                }else if(age>65){
                    switch (type) {
                        case 1:
                            total= subTotal*per30;
                            break;
                        case 2:
                            total= subTotal*per30*per20*gidisDonus;
                            break;
                        default:
                            isError= true;
                            break;
                    }
                }
            }else{
                isError = true;
            }

        }else{
            isError = true;
        }

        if(isError==true){
            System.out.print("Hatalı giriş yaptınız");
        }else{
            System.out.print("Toplam tutar: "+total);
        }
    }
}
