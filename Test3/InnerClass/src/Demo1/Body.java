package Demo1;

public class Body {
    public class Heart {
        public void beat() {
            System.out.println("Heartbeat: bengbengbeng");
            System.out.println("Name: " + name);
        }

        public void setName(String name) {
            Body.this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private String name;

    public void drive(){
        System.out.println("Hey! I'm driving!");
        new Heart().beat();
    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
