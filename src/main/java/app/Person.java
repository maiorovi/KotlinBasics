package app;

public class Person {
    private String name;
    private int age;
    private Person partner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || "".equals(name)) throw new IllegalArgumentException("name is wrong");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
