package pl.mbrzozowski.logic;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else {
            return !isWeekend && cigars >= 40 && cigars <= 60;
        }
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        } else {
            return isSummer && temp >= 60 && temp <= 100;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if ((n % 3 == 0) && (n % 5 != 0)) {
            return true;
        } else {
            return (n % 3 != 0) && (n % 5 == 0);
        }
    }

    public boolean less20(int n) {
        return (n % 20 == 19) || (n % 20 == 18);
    }

    public boolean nearTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9;
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMorning && isMom) {
            return true;
        } else {
            return !isMorning;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && b < c) {
            return true;
        }
        return a < b && b < c;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk && a <= b && b <= c) {
            return true;
        }
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die2 == 6) {
                die2 = 1;
            } else {
                die2++;
            }
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && a == b && a == c) {
            return 10;
        } else if (a == b && a == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        } else if (a + b == a + c + 10 || a + b == b + c + 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
    }

    public int sumLimit(int a, int b) {
        if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
            return a;
        }
        return a + b;
    }

}
