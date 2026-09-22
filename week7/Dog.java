package week7;

public class Dog extends Animal{ 
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("say : woof woof ");
    }
    public void run(){
        System.out.println(name+ " : is running");
    }
}

