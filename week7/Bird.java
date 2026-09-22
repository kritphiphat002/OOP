package week7;

public class Bird extends Animal implements Flyable{
    
    public Bird(String name){
        super(name);
    }


    @Override
    public void makeSound(){
        System.out.println(name+"jeeb jeeb");
    }

    @Override
    public void fly(){
        System.out.println(name + "is flying");
    }
}

