import java.util.Scanner;

class Info implements Comparable<Info> {
    String name;
    String tel;
    String addr;

    public Info(String name, String tel, String addr) {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    @Override
    public int compareTo(Info other) {
        return this.name.compareTo(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] infos = new Info[3];
        
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            String tel = sc.next();
            String addr = sc.next();
            infos[i] = new Info(name, tel, addr);
        }
        
        Info minInfo = infos[0];
        for (int i = 1; i < 3; i++) {
            if (infos[i].compareTo(minInfo) < 0) {
                minInfo = infos[i];
            }
        }
        
        System.out.println("name : " + minInfo.name);
        System.out.println("tel : " + minInfo.tel);
        System.out.println("addr : " + minInfo.addr);
        
        sc.close();
    }
}
