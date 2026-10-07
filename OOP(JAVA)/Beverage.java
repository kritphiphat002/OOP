public class Beverage extends Food implements ServableCold {

    // Constructor ที่มีการใช้ super()
    public Beverage(String name) {
        super(name, "Beverage");
    }

    @Override
    public void prepare() {
        System.out.println("Action : " + getName() + " is being prepared.");
    }

    @Override
    public void process() {
        System.out.println("Action : " + getName() + " is served cold.");
    }

    @Override
    public void serveCold() {
        System.out.println(getName() + " can be served cold.");
    }
}