package kg.geektech.les8.players;

public class Boss extends GameEntity {
    private boolean isStunned = false;

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }


}



