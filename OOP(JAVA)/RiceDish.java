public class RiceDish extends Food {

    // Constructor ที่มีการใช้ super()
    public RiceDish(String name) {
        super(name, "Rice Dish");
    }

    @Override
    public void prepare() {
        System.out.println("Action : " + getName() + " is being prepared.");
    }

    @Override
    public void process() {
        System.out.println("Action : " + getName() + " is ready to serve.");
    }
}