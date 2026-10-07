public abstract class Food {
    private final String name;
    private final String type;

    // Constructor
    public Food(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Abstract Methods
    public abstract void prepare();
    public abstract void process();

    // Concrete Method สำหรับแสดงข้อมูลพื้นฐาน
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
    }
}