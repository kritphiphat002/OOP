import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Somchai");
        names.add("Somsri");
        names.add("Anan");
        names.add("PJar");

        System.out.println(names);
        System.out.println("คนแรก: " + names.get(0));
        System.out.println("จำนวน: " + names.size());

        names.set(1, "Manee");
        names.remove(2);

        //
        int i =0;
        for(i=0; i<names.size(); i++){
            System.out.println(names.get(i));

        }

        System.out.println(names);
    }
}