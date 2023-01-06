package pl.mbrzozowski.logic;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if ((big * 5 + small) < goal) {
            return false;
        } else {
            return goal % 5 <= small;
        }
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != b && c != a) {
            sum += c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return sum;
        }
        sum += a;
        if (b == 13) {
            return sum;
        }
        sum += b;
        if (c == 13) {
            return sum;
        }
        return sum + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if ((n >= 13 && n < 15) || (n > 16 && n <= 19)) {
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            return num - (num % 10) + 10;
        }
        return num - (num % 10);
    }

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(a - b) <= 1 && Math.abs(a - c) > 1 && Math.abs(b - c) > 1)
                || (Math.abs(a - c) <= 1 && Math.abs(a - b) > 1 && Math.abs(b - c) > 1);
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if (21 - b < 21 - a) {
            return b;
        }
        return a;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int buffer;
        if (b < a) {
            buffer = b;
            b = a;
            a = buffer;
        }
        if (c < b) {
            buffer = c;
            c = b;
            b = buffer;
        }
        if (b < a) {
            buffer = b;
            b = a;
            a = buffer;
        }
        return b - a == c - b;
    }

    public int makeChocolate(int small, int big, int goal) {
        if (goal > (big * 5) + small) {
            return -1;
        }
        int temp;
        if (goal >= 5 * big) {
            temp = goal - (5 * big);
        } else {
            temp = goal % 5;
        }
        if (temp <= small) {
            return temp;
        } else {
            return -1;
        }
    }


}
