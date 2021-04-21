public class Bat {
    protected int energyLevel = 300;

    public int displayEnergy() {
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }

    public void bat(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void fly() {
        System.out.println("Flap flap flap");
        energyLevel -= 50;
    }

    public void eatHumans() {
        energyLevel+= 25;
    }

    public void attackTown() {
        System.out.println("AHHHH!");
        energyLevel -= 100;
    }
}
