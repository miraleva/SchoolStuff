package TextEditor;

public class Stacks {
    private String[][] memory;
    private int pointer = -1;

    public Stacks(int size) {
        memory = new String[size][2];

    }

    public void insert(String komut, String ikincikomut) {
        pointer += 1;
        String[] memorypiece = { komut, ikincikomut };
        memory[pointer] = memorypiece;
    }

    public String[] pop() {
        if (pointer > -1) {
            return memory[pointer--];
        } else {
            return null;
        }

    }
}
