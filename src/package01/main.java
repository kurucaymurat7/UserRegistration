package package01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
     /* Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
     2- Registration isminde bir class oluşturun ve register isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration classı na aynı zamanda kendine verilen
     ArrayListteki userlardan her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers isminde bir metod daha ekleyiniz.

     İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.

     public static void main(String[] args) {
     Registration userReg = new Registration();
     ArrayList<User> register = userReg.register();
      userReg.printHappyUsers(register);
     }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<User> userList = new ArrayList<>();

        System.out.println("Kac adet kayit girilecek : ");
        int kayitAdedi = scan.nextInt();

        Registration userReg = new Registration();
        userList = userReg.register(kayitAdedi);

        System.out.print("Her dakikanın ilk 10 sn.sinde kayıt olanlar: ");
        userReg.printHappyUsers(userList);
    }

}
