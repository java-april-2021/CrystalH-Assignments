public class Human {
    private String name;
    private int strength;
    private int health;
    private int stealth;
    private int intelligence;


    public Human(String name) {
        this.name = name;
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public String getName(){
        return this.name;
    }


    public void attack(Human target, String powerMove) {
        int damage;
        if(powerMove.equals("attack")){
            damage = 3;
        } else if(powerMove.equals("slash")){
            damage = 4;
        } else if(powerMove.equals("punch")){
            damage = 5;
        } else {
            System.out.println("Move not recognized.");
            return;
        }

        int effectiveDamage = this.strength * damage;

        int targetsHealth = target.getHealth();

        targetsHealth -= effectiveDamage;
        

        target.setHealth(targetsHealth);

        System.out.printf("%s attacks %s for %d health points", this.name, target.name, effectiveDamage, target.intelligence, target.stealth);

        System.out.println(target.name + " health is now " + target.health);
    }

}