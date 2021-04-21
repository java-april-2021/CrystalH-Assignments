public class HumanTest {
    public static void main(String[] args) {
        Human nancy = new Human("Nancy");
        Human britney = new Human("Britney");

        nancy.attack(britney, "attack");
        britney.attack(nancy, "slash");
    }
}
