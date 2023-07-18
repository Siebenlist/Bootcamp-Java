public class Wizard extends Human{

    public Wizard() {
        super(3, 10, 3, 50);
    }

    public void heal(Human target){
        target.setHealth(getHealth() + getIntelligence());
        System.out.println("Curaste al " + target.getClass() + " por " + getIntelligence() + " vida y ahora tiene " + target.getHealth() + " de vida.");
    }

    public void fireball(Human target){
        int firedmg = (getIntelligence() * 3);
        target.setHealth(target.getHealth() - firedmg);
        System.out.println("Atacaste al " + target.getClass() + " y le hiciste " + firedmg + " daño, ahora tiene " + target.getHealth() + " de vida.");
    }
}
