package kg.geektech.les8.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility superAbility;

    public Hero(int health, int damage, SuperAbility superAbility) {
        super(health, damage);
        this.superAbility = superAbility;
    }

    public Hero(int i, int health, int damage) {
        super(health, damage);
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    protected abstract void criticizes(boolean b);
}
