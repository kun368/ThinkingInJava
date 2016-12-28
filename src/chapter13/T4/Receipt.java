package chapter13.T4;

import java.text.MessageFormat;
import java.util.Formatter;

public class Receipt {

    private static final int L = 20, M = 5, R = 10;

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(MessageFormat.format("%-{0}s %{1}s %{2}s\n", L, M, R), "Item", "Qty", "Price");
        f.format(MessageFormat.format("%-{0}s %{1}s %{2}s\n", L, M, R), "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(MessageFormat.format("%-{0}.{0}s %{1}d %{2}.2f\n", L, M, R), name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(MessageFormat.format("%-{0}s %{1}s %{2}.2f\n", L, M, R), "Tax", "", total * 0.06);
        f.format(MessageFormat.format("%-{0}s %{1}s %{2}s\n", L, M, R), "", "", "-----");
        f.format(MessageFormat.format("%-{0}s %{1}s %{2}.2f\n", L, M, R), "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}