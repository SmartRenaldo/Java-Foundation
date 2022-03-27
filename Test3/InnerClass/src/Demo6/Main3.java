package Demo6;

public class Main3 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Ashe");
        hero.setType(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~pia~biu~pia");
            }
        });
        hero.attack();
    }
}
