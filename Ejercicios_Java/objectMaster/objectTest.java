public class objectTest{
    public static void main(String[] args){
        Human h = new Human();
        Wizard w = new Wizard();
        Ninja n = new Ninja();
        Samurai s = new Samurai();
        w.heal(h);
        w.fireball(h);
        n.steal(h);
        n.runAway();
        s.deathBlow(h);
        s.meditate();
        System.out.print(s.getHealth());
    }
}