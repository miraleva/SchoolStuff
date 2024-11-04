
import java.util.Scanner;

public class SimpleTextEditor {
    String memory = "";

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is an Simple Text Editor ");

        while (true) {
            String command = scanner.nextLine();
            break; // çıkış için
        }
    }

    public void type(String input) {
        memory += input;
    }

    public void delete() {
        if (memory.length() > 0) {
            memory = memory.substring(0, memory.length() - 1);
        } else {
            System.out.println("Can't delete nothing");
        }
    }

    public void show() {
        System.out.println(memory);
    }
}