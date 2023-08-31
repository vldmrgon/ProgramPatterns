package pro.patterns.creation.prototype;


public class Person extends Man implements Cloneable {
    private String firstName;
    private String lastName;

    public Person(int live, int power, int id, int age, String name, String firstName, String lastName) {
        super(live, power, id, age, name);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
