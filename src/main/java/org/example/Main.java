package org.example;

public class Main {

    public static boolean hasAlternatingBits(int n) {
        if (n <= 2)
            return true;

        int setBitPos = 0;
        int temp = n;
        int counter = 0;
        while (temp != 0) {
            if ((temp & 1) == 1) {
                setBitPos = counter;
            }

            temp = temp >> 1;
            counter += 1;
        }

        int currentBit = n & 1;
        n = n >> 1;
        setBitPos--;
        while (setBitPos >= 0) {
            if (currentBit == (n & 1)) {
                return false;
            }

            currentBit = n & 1;
            n = n >> 1;
            setBitPos--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}
