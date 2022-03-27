package Demo6;

public class Hero {
    private String name;
    private Skill type;

    public Hero() {
    }

    public Hero(String name, Skill type) {
        this.name = name;
        this.type = type;
    }

    public void attack() {
        System.out.printf("My name is %s\n", name);
        System.out.println("Release skill:");
        type.use();
        System.out.println("Release complete");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getType() {
        return type;
    }

    public void setType(Skill type) {
        this.type = type;
    }
}
