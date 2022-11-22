package boundedstack;

import mfxcore.utils.Repeater;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BoundedStack {
    private static final int MAX_CAPACITY = 50;
    private static final String DISPLAY_FORMAT = "%02d) %-10.12f%n";
    private final ArrayDeque<Double> stack = new ArrayDeque<>(MAX_CAPACITY);
    private boolean isInputComplete = false;

    public BoundedStack() {
    }

    public void push(double element) {
        if (isFull()) {
            double last = stack.removeLast();
            stack.add(element);
            System.out.printf("*** DROPPED %f ==>> ADDED %f ***", last, element);
            System.out.println();
            return;
        }
        stack.push(element);
    }

    private void getNextSpell(String input) {
        double spell;
        try {
            spell = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            if (isFull()) isInputComplete = true;
            return;
        }
        push(spell);
    }

    public void load(Scanner input) {
        if (input == null) return;
        String msg = "Enter a decimal number: ";
        do {
            String fullMsg = isFull() ? "[MAX %d/%d] " : "[%d/%d] ";
            System.out.printf(fullMsg + msg, stack.size(), MAX_CAPACITY);
            String spellInput = input.nextLine();
            getNextSpell(spellInput);
        } while (!isInputComplete);
    }

    //    Remove and display most recently added item from stack, i.e. the first element.
    public void pop() {
        int index = (MAX_CAPACITY - stack.size()) + 1;
        Double element = stack.poll();
        System.out.printf(DISPLAY_FORMAT, index, element);
    }

    public void unload() {
        System.out.println();
        System.out.println("***\tSPELL STACK\t***");
        System.out.println(Repeater.repeat('_', 16));
        while (!stack.isEmpty()) {
            pop();
        }
    }

    public boolean isFull() {
        return stack.size() >= MAX_CAPACITY;
    }
}
