package package01;

import java.time.LocalDateTime;

public class User {

    public String name;
    public LocalDateTime registerDatetime;

    public User(String isimSoyisim, LocalDateTime kayitani) {
        this.name = isimSoyisim;
        this.registerDatetime = kayitani;
    }
}
