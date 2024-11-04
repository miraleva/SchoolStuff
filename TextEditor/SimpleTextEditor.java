package TextEditor;

import java.util.Scanner;

public class SimpleTextEditor {
    String memory = "";

    Stacks undoStack = new Stacks(100);
    Stacks redoStack = new Stacks(100);

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is an Simple Text Editor ");

        while (true) {
            String command = scanner.nextLine();
            String input;
            if (-1 == command.indexOf(" ")) {
                input = "";
            } else {
                String[] parts = command.split(" ", 2);
                command = parts[0];
                input = parts[1];
            }
            handleCommand(command, input);

        }
    }

    public void handleCommand(String command, String input) {
        switch (command.toLowerCase()) {
            case "show":
                show();
                break;
            case "type":
                type(input);
                break;
            case "undo":
                undo();
                break;
            case "redo":
                redo();
                break;
            case "delete":
                delete();
                break;
            default:
                System.out.println("Bilinmeyen komut");
                break;

        }
    }

    public void type(String input) {
        memory += input;
        undoStack.insert("Type", input);
    }

    public void delete() {
        if (memory.length() > 0) {
            undoStack.insert("Delete", memory.substring(memory.length() - 1, memory.length()));
            memory = memory.substring(0, memory.length() - 1);
        } else {
            System.out.println("Can't delete nothing");
        }

    }

    public void show() {
        System.out.println(memory);
    }

    public void undo() {
        String[] last = undoStack.pop();
        if (last == null) {
            System.out.println("Nothing to undo");
            return;
        }
        redoStack.insert(last[0], last[1]);
        if (last[0] == "Delete") {
            memory = memory + last[1];
        } else if (last[0] == "Type") {
            memory = memory.substring(0, memory.length() - 1);
        }
    }

    public void redo() {
        String[] last = redoStack.pop();
        if (last == null) {
            System.out.println("Nothing to redo");
            return;
        }
        undoStack.insert(last[0], last[1]);
        if (last[0] == "Type") {
            memory = memory + last[1];
        } else if (last[0] == "Delete") {
            memory = memory.substring(0, memory.length() - 1);
        }
    }

}