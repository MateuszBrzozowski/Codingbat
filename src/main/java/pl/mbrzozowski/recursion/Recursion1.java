package pl.mbrzozowski.recursion;

public class Recursion1 {

    public int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        return 2 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return sumDigits(n % 10) + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 7) {
            return 1;
        } else if (n < 10) {
            return 0;
        }
        return count7(n % 10) + count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(1));
        }
        return countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));
    }

}