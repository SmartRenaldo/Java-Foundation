package Demo5;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Napoleon");
        hero.setAge(18);

        Weapon weapon = new Weapon();
        weapon.setCode("the sword of Damocles");
        hero.setWeapon(weapon);

        hero.show();
    }
}
