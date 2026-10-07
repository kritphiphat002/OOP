public class NoodleDish extends Food {

    // Constructor ที่มีการใช้ super()
    public NoodleDish(String name) {
        super(name, "Noodle Dish");
    }

    @Override
    public void prepare() {
        System.out.println("Action : " + getName() + " is being prepared.");
    }

    @Override
    public void process() {
        System.out.println("Action : " + getName() + " is being cooked with noodles.");
    }
}