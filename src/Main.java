import Dragon_ball.Characters;
import Dragon_ball.NamakianFighter;
import Dragon_ball.SaiyanFighter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Characters characters1 = new Characters("Goku", 100000000, "Vegita", "Saiyajin");
        Characters characters2 = new Characters("Vegeta", 1000000, "Vegita", "Saiyajin");
        Characters characters3 = new Characters("Piccolo", 500000, "Namek", "Namekiano");
        Characters characters4 = new Characters("Gohan", 50000000, "Vegita", "Saiyajin");
        Characters characters5 = new Characters("Trunks", 75000000, "Vegita", "Saiyajin");

        System.out.println(characters1.ingrese());
        System.out.println(characters2.ingrese());
        System.out.println(characters3.ingrese());
        System.out.println(characters4.ingrese());
        System.out.println(characters5.ingrese());

        SaiyanFighter goku = new SaiyanFighter("Goku", 100000000, "Vegita", "Saiyajin", "Kamehameha");
        SaiyanFighter vegeta = new SaiyanFighter("Vegeta", 1000000, "Vegita", "Saiyajin", "Big Bang Attack");
        NamakianFighter piccolo = new NamakianFighter("Piccolo", 500000, "Namek", "Namekiano", "Makankosappo");

        goku.useSpecialAttack();
        vegeta.useSpecialAttack();
        piccolo.useSpecialAttack();
    }
}