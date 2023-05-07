public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test1 {
    public static void main(String[] args) {
        Animal n = new Animal();
        n . setName("Citty...");
        System.out.println(n.getName());
    }
}