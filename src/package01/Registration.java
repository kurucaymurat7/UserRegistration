package package01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    String isimSoyisim;
    LocalDateTime kayitani;

    public List<User> register() {
        List<User> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet kayit girilecek : ");
        int kayitAdedi = scan.nextInt();
        scan.nextLine();

        int i = 0;
        while (i < kayitAdedi) {
            System.out.println(i + 1 + " . kayit: ");
            System.out.print("İsim Soyisim : ");
            isimSoyisim = scan.nextLine();
            kayitani = LocalDateTime.now();
            userList.add(i, new User(isimSoyisim, kayitani));
            i++;
        }
        return userList;
    }

    public void printHappyUsers(List<User> userList) {
        List<User> happyUserList = new ArrayList<>();
        int second = 0;
        int sayac = 0;
        for (int i = 0; i < userList.size(); i++) {
            second = userList.get(i).registerDatetime.getSecond();
            if (second <= 10) {
                happyUserList.add(userList.get(i));
            }
        }
        if (happyUserList.size() == 0) {
            System.out.println("Ilk 10 sn'de kayıt olan happy user olmadi. ");
        } else {
            System.out.println("Ilk 10 sn'de kayit olan happ users: ");
            for (int j = 0; j < happyUserList.size(); j++) {
                System.out.println(happyUserList.get(j).name + " " + happyUserList.get(j).registerDatetime.getHour() + ":"
                        + happyUserList.get(j).registerDatetime.getMinute() + " " + happyUserList.get(j).registerDatetime.getSecond());
            }

        }
    }
}
