import java.util.Scanner;

class Info {
    String name;
    String tel;
    String addr;

    public Info(String name, String tel, String addr) {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String tel = sc.next();
        String addr = sc.next();
        
        Info info = new Info(name, tel, addr);
        
        System.out.println("name : " + info.name);
        System.out.println("tel : " + info.tel);
        System.out.println("addr : " + info.addr);
        
        sc.close();
    }
}
