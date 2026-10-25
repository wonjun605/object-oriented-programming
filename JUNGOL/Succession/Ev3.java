class Animal {
    public void crying() {
        System.out.println("animal : crying");
    }
}

class Puppy extends Animal {
    @Override
    public void crying() {
        System.out.println("puppy : bowbow");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("cat : meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal(); //슈퍼클래스
        Puppy pup = new Puppy();
        Cat cat = new Cat();
        ani.crying(); //슈퍼클래스
        pup.crying(); //오버라이딩
        cat.crying(); //오버라이딩
    }
}
