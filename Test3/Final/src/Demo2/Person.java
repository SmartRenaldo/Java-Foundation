package Demo2;

public class Person {
    private final String name = "Jack";

    public Person() {
    }

/*
    public Person(String name) {        //wrong
        this.name = name;
    }
*/

    public String getName() {
        return name;
    }

/*
    public void setName(String name) {
        this.name = name;
    }
*/
}
