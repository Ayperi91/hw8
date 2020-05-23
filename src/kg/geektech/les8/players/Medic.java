package kg.geektech.les8.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    protected void criticizes(boolean b) {

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i]!= this && heroes[i].getHealth()>0  && !boss.isStunned)
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);


        }

    }
}
