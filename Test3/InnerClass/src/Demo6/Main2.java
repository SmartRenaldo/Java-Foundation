package Demo6;

public class Main2 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("piu~piu~");
            }
        };
        hero.setType(skill);
        hero.attack();
    }
}
