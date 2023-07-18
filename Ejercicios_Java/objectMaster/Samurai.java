public class Samurai extends Human{
    public Samurai(){
        super(3, 10, 3, 200);
    }

    void deathBlow(Human target){
        target.health = 0;
        super.setHealth(super.health / 2);
        System.out.println("Usaste deathBlow y el " + target + " murio, pero tu vida ahora es " + super.health);
    }

    Integer meditate(){
        super.health += super.health / 2;
        return super.health;
    }
}
