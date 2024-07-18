import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
        // sıfırlamayacağını sorun
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin
        // unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
        // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka
        // şifre giriniz." sorun yoksa "Şifre oluşturuldu"
        // yazan programı yazınız.

        String username, password, choice1, newpassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı Giriniz : ");
        username = inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else if (username.equals("patika") && !password.equals("java123")) {
            System.out.print("Şifreniz Yanlış Sıfırlamak İstermisiniz Y/N ? ");
            choice1 = inp.nextLine();
            if (choice1.equals("Y")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newpassword = inp.nextLine();
                if (newpassword.equals("java123")){
                    System.out.println("şifre Oluşturulmadı. Lütfen Başka Şifre Giriniz!");
                }else{System.out.println("Şifre Başarıyla Oluşturuldu. Tebrikler!");}


            }

        }


    }
}