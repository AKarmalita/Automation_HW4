public class Dog {
    private String name, color;
    private int age, height;

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public Dog(String name, String color, int age, int height) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.height=height;
    }

    public Dog (String name, String color){
        this.name = name;
        this.color = color;
        this.age = 1;
        this.height = 20;
    }

    public Dog() {
        System.out.println("Creating object of the class Dog");
    }

    public void print(){
        System.out.println("Name "+this.name);
        System.out.println("Color "+this.color);
        System.out.println("Age "+this.age);
        System.out.println("Height "+this.height);

    }

}
