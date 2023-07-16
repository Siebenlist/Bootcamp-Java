public class Murcielago extends Mamifero{
    
    public Murcielago(){
        super(300);
    }

    public int fly(){
        System.out.println("*Sonido de volar* " + super.energy);
        return (super.energy -= 50);
    }
    public int eatHumans(){
        System.out.println("bueno, no importa " + super.energy);
        return (super.energy += 25);
    }
    public int attackTown(){
        System.out.println("*Sonido de ciudad en llamas* " + super.energy);
        return (super.energy -= 100);
    }
    
}
