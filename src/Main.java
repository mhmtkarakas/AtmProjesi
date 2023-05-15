import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            int right = 3;
            int bakiye = 1500;
            int select;
            while(right>0){
                System.out.print("Kullanici adiniz: ");
                userName = input.nextLine();
                System.out.print("Parolaniz: ");
                password = input.nextLine();
                if(userName.equals("Mehmet")&&password.equals("123456")){
                    System.out.print("Merhaba, Abankasina Hosgeldiniz ");
                    do{
                        System.out.println("1-Para Yatirma\n"+"2-Para Cekme\n"+"3-Bakiye Sorgula\n"+"4-Cikis yap");
                        System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
                        select = input.nextInt();
                        switch(select){
                            case 1:
                            System.out.println("Para Miktari: ");
                            int price = input.nextInt();
                            bakiye += price;
                            break;
                            case 2:
                                System.out.print("Para Miktari: "+bakiye);
                                price = input.nextInt();
                                if(price>bakiye){
                                    System.out.println("Bakiye Yetersiz ");
                                }else{
                                    bakiye -= price;
                                }
                                break;
                            case 3:
                                System.out.println("Bakiyeniz: "+ bakiye);
                                break;
                            case 4:
                                System.out.println("Tekrar gorusmek uzere: ");
                                break;
                            default:
                                System.out.println("Gecersiz islem secildi: ");
                                break;
                        }
                    }while(select !=4);
                    break;
                }else{
                    right--;
                    System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz: ");
                    if(right==0){
                        System.out.println("Hesabiniz bloke olmustur lutfen bankaniz ile gorusunuz ");
                    }else{
                        System.out.println("Kalan hakkiniz "+right);
                    }
                }

            }
    }
}