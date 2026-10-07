import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== FOOD INFORMATION ==========");

        // สร้าง List ของ Food เพื่อแสดง Polymorphism
        ArrayList<Food> menu = new ArrayList<>();
        menu.add(new RiceDish("Fried Rice"));
        menu.add(new NoodleDish("Pad Thai"));
        menu.add(new Beverage("Iced Tea"));

        // แสดงผลการทำงานของอาหารแต่ละชนิด
        for (Food food : menu) {
            food.displayInfo();
            food.prepare();
            food.process();
            System.out.println();
        }

        System.out.println("========== COLD FOOD / BEVERAGE ==========");
        
        // เช็ค Interface ServableCold
        for (Food food : menu) {
            if (food instanceof ServableCold coldFood) {
                coldFood.serveCold();
            }
        }
    }
}