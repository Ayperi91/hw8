package kg.geektech.les8.players;

public class Hunter extends Hero {
    private int partOfBossDamage;

    public Hunter(int health, int damage, int partOfBossDamage) {

        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public Hunter(int i, int health, int damage, int partOfBossDamage) {
        super(i, health, damage);
        this.partOfBossDamage = partOfBossDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - this.partOfBossDamage);
            }

    }
}



    }
