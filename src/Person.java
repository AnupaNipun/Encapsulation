public class Person {
    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(22);
        System.out.println(p.getAge());
    }
}