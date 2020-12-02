package eu.flrkv.DoubleChainedList;

public class Person {

    // Atributes
    private int age;
    private String name;

    // Construct
    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    // Set methods
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Get methods
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
