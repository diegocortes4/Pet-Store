public class Pet {
    public String name;
    public String sound;

    public Pet(){

    }
    public Pet(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    
    public String toString(){
        return (name + ", "+sound + "!");
    }
}