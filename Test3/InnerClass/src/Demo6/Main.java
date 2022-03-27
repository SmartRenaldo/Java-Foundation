package Demo6;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Ashe");
        hero.setType(new SkillImpl());
        hero.attack();
    }
}
