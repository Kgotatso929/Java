class Animal { float age;}
class Lion extends Animal { int claws;}
class Jungle{
    public static void main(String args []){
        Animal animal = new Lion();
        if(animal instanceof Lion);
        System.out.println(1);
    }
}