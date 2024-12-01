package Dragon_ball;


public abstract class Fighter extends Characters {
    private String specialAttack;

    public Fighter(String name, long power, String world, String race, String specialAttack) {
        super(name, power, world, race);
        this.specialAttack = specialAttack;
    }

    public abstract void useSpecialAttack();

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}

