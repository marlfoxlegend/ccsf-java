package boundedstack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoundedStack boundedStack = new BoundedStack();
        Scanner scanner = new Scanner(System.in);
        boundedStack.load(scanner);
        boundedStack.unload();
    }
}
