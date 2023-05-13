import java.util.ArrayList;
import java.util.List;

public class ErrorA {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mike");

        try {
            for (int i = 0; i <= names.size(); i++) {
                String name = names.get(i);
                System.out.println("Name: " + name);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Seu index não está de acordo com a realidade.");
        }
    }
}
