package Dragon_ball;

public class SaiyanFighter extends Fighter {
    public SaiyanFighter(String name, long power, String world, String race, String specialAttack) {
        super(name, power, world, race, specialAttack);
    }

    @Override
    public void useSpecialAttack() {
        System.out.println(this.getName() + " usa su ataque especial: " + this.getSpecialAttack());
    }
}
