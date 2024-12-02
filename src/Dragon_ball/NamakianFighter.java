package Dragon_ball;

import Interface.Transformation;

public class NamakianFighter extends Fighter implements Transformation {
    public NamakianFighter(String name, long power, String world, String race, String specialAttack) {
        super(name, power, world, race, specialAttack);
    }

    @Override
    public void useSpecialAttack() {
        System.out.println(this.getName() + " usa su ataque especial: " + this.getSpecialAttack());
    }

    @Override
    public void transform() {
        System.out.println(this.getName() + " se transforma en un Namekiano de élite.");
    }
}