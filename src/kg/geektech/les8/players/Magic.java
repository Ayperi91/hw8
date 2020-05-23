package kg.geektech.les8.players;

public class Magic extends Hero {
    private int boostAttack;

    public Magic(int health, int damage, int boostAttack) {
        super(health, damage, SuperAbility.BOOST);
        this.boostAttack = boostAttack;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() +this.boostAttack );

        }
    }
}
