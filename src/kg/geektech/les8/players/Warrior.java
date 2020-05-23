package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {
    private int criticizes;

    public Warrior(int health, int damage, int criticizes) {
        super(health, damage, criticizes);
        this.criticizes = criticizes;
    }

    @Override
    protected void criticizes(boolean b) {

    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int randomNumber = r.nextInt(4);
        if (randomNumber == 2) {
            if (randomNumber == 4) {
                this.criticizes(true);
            }


        }

    }
}
