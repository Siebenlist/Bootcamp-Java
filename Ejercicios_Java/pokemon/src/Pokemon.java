public class Pokemon {
    String name;
    int health;
    String type;
    static Integer count = 0;

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public Integer getHealth(){
        return health;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public static Integer counter(){
        return count;
    }

    void attackPokemon(Pokemon pokemon){
        pokemon.health -=10;
        System.out.println("Atacaste a " + pokemon.name + " y ahora tiene " + pokemon.health + " vida.");
    }
}
