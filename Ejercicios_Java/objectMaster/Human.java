public class Human {
    
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;
    protected int health = 100;

    public Human(int strength, int intelligence, int stealth, int health){
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }

    public Human() {
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Human target){
        int dmg = this.strength;
        target.setHealth(getHealth() - dmg);
        System.out.println("Hiciste " + dmg + " daño al enemigo y ahora tiene " + getHealth() + " de vida");
    }
}
