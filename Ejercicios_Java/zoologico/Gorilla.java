public class Gorilla extends Mamifero{

    public Gorilla(){
        super(100);
    }
    public Integer throwSomething(){
        super.energy -= 5;
        System.out.println("The gorilla threw something and now has " + energy);
        return super.energy;
    }
    public Integer eatBananas(){
        super.energy +=10;
        System.out.println("El mono come banana que rico y gana 10 de energia " + energy);
        return super.energy;
    }
    public Integer climb(){
        super.energy += 10;
        System.out.println("El mono escala re loquito y pierde 10 de energia " + energy);
        return super.energy;
    }
}
