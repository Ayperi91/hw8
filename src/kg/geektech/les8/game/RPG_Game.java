package kg.geektech.les8.game;

import kg.geektech.les8.players.*;

public class RPG_Game {

    public static void start() {
        Boss boss = new Boss(800, 50);
        Medic youngMedic = new Medic(280, 30, 5);
        Warrior warrior = new Warrior(250, 25, 20);
        Magic magic = new Magic(240, 20, 10);
        Hunter hunter = new Hunter(260, 30, 25);
        Medic medic = new Medic(220, 10, 15);

        Hero[] heroes = {youngMedic, warrior, magic, hunter, medic};

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }

    }

    private static void round(Boss boss, Hero[] heroes) {
        if (!boss.isStunned()) {
            bossHit(boss, heroes);
        }

        heroesHit(boss, heroes);
        heroesApplySuperAbilities(boss, heroes);
        printStatistics(boss, heroes);
    }


    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() < 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDied = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDied = false;
                break;
            }
        }
        if (allHeroesDied) {
            System.out.println("Boss won!!!");

        }
        return allHeroesDied;
    }

    private static void bossHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                if (heroes[i].getHealth() - boss.getDamage() < 0) {
                    heroes[i].setHealth(0);
                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
                }
            }
        }

    }

    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }


    private static void heroesApplySuperAbilities(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperAbility(boss, heroes);
            }
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("________________________");
        System.out.println("Boss health: " + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHealth());
        }
        System.out.println("________________________");
    }


}
