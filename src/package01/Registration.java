package package01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    static String isimSoyisim ;
    static LocalDateTime kayitani;

    public List<User> register(int kayitadedi) {
        List<User> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int i=0;
        while (i<kayitadedi) {
            System.out.println("İsim Soyisim : ");
            isimSoyisim = scan.nextLine();
            kayitani = LocalDateTime.now();
            userList.add(i, new User(isimSoyisim, kayitani));
            i++;
        }
        return userList;
    }

    public void printHappyUsers(List<User> userList) {
        int second=0;
        for (int i = 0; i < userList.size(); i++) {
            second = userList.get(i).registerDatetime.getSecond();
            if (second <= 10) {
                System.out.println(userList.get(i).name);
                System.out.println(userList.get(i).registerDatetime.getHour() + "" +
                        userList.get(i).registerDatetime.getMinute() + "" +
                        userList.get(i).registerDatetime.getSecond());
            }
        }
    }


}
