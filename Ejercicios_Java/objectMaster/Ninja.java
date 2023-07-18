public class Ninja extends Human {

    public Ninja() {
        super(3, 3, 10, 100);
    }

    void steal(Human target){
        target.setHealth(health - stealth);
        System.out.println("Usaste steal y ahora " + target.getClass() + " tiene " + target.getHealth() + " de vida.");
    }

    void runAway(){
        setHealth(health - 10);
        System.out.println("Usaste runAway y perdiste 10 de vida es " + getHealth());
    }
}
