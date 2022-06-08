public class HomeWork4 {
    public static void main(String[] args) {
    Dog dog1 = new Dog("Rona", "white", 14, 35);
     dog1.print();
        System.out.println("\n");

    Dog dog2 = new Dog("Axel", "black");
    dog2.print();
        System.out.println("\n");

    Dog dog3 = new Dog();
        System.out.println("\n");

    /////////геттеры проверка////////
        System.out.println(dog1.getAge());
        System.out.println(dog2.getColor());

    }
}
