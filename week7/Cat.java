package week7;

public class Cat extends Animal{
    

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name+"Say meow meow");
    }

    public void scratch(){
        System.out.println(name+ " is scratching");
    }
}

