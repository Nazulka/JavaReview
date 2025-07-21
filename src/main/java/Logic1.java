public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars>=40 && cigars <=60 && !isWeekend) ||
                (isWeekend && cigars>=40);
    }

    public int dateFashion(int you, int date) {
        //If either person is very bad (≤2), you definitely get 0 — this rule comes first.
        if (you<=2 || date <=2) return 0;
        else if (you>=8 || date>=8) return 2;
        else return 1;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;  // Increase the speed limit by 5
        }
        if (speed <= 60) return 0;
        else if (speed <= 80) return 1;
        else return 2;
    }

    public int sortaSum(int a, int b) {
        int sum=a+b;
        if (sum>=10 && sum<=19) return 20;
        else return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) && vacation) return "off";
        if ((day >= 1 && day <= 5) && vacation) return "10:00";
        if ((day >= 1 && day <= 5) && !vacation) return "7:00";
        return "10:00"; // weekend and not vacation
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6) || (a + b == 6) || Math.abs(a - b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return (!outsideMode && (n>=1 && n<=10)) ||
                (outsideMode && (n<=1 || n>=10));
    }

    public boolean specialEleven(int n) {
        return (n%11==0) ||(n%11==1);
    }

    public boolean more20(int n) {
        return (n%20==1) || (n%20==2);
    }

    public boolean old35(int n) {
        return ((n%3==0) || (n%5==0)) && !((n%3==0) && (n%5==0));
    }

    public boolean less20(int n) {
        return (n%20==19) || (n%20==18);
    }

    public boolean nearTen(int num) {
        return (num%10==8) || (num%10==2) ||(num%10==9) || (num%10==1) || (num%10==0);
    }

    public int teenSum(int a, int b) {
        int sum = a+b;
        if ((a >=13) && (a <=19) || (b >=13) && (b <=19)) {
            return 19;
        } return sum;
    }

    public boolean answerCell(boolean isMorning, boolean isMom,
                              boolean isAsleep) {
        if (isAsleep) return false;
        return !isMorning || isMom;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a+b==c)|| (a+c==b) || (c+b==a);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return ((bOk && (c>b)) || (b>a) && (c>b));
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return ((a<b && b<c) ||
                (equalOk && a <= b && b <= c));
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a%10==b%10) || (a%10==c%10)
                || (c%10==b%10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b)>=10) || (Math.abs(a-c)>=10) || (Math.abs(b-c)>=10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = (die1 == 6) ? 1 : die1 + 1;
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a==b) return 0;
        if (a%5==b%5) return Math.min(a, b);
        else return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if ((a==2 ) && (b==2) && (c==2)) return 10;
        else if ((a==b) && (b==c)) return 5;
        else if ((a!=c) && (a!=b)) return 1;
        else return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if ((a!=b) && (b!=c) && (a!=c)) return 0;
        else if ((a==b) && (b==c)) return 20;
        else return 10;
    }

    public int blueTicket(int a, int b, int c) {
        if ((a+b==10) || (b+c==10) || (a+c==10)) return 10;
        else if ((a+b==10+b+c) || (a+b==10+a+c)) return 5;
        else return 0;
    }

    public boolean shareDigit(int a, int b) {
        int aTens = a / 10;
        int aOnes = a % 10;
        int bTens = b / 10;
        int bOnes = b % 10;
        return (aTens == bTens || aTens == bOnes ||
                aOnes == bTens || aOnes == bOnes);
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length()){
            return sum;
        } else {
            return a;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0; // Bad party
        if (tea >= 2 * candy || candy >= 2 * tea) return 2; // Great party
        return 1; // Good party
    }

    public String fizzString(String str) {
        if ((str.startsWith("f")) && (str.endsWith("b"))) return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";
        else return str;
    }

    public String fizzString2(int n) {
        if ((n%3==0) && (n%5==0)) return "FizzBuzz!";
        if ((n%3==0) && (n%5!=0)) return "Fizz!";
        if (n%5==0) return "Buzz!";
        else return String.valueOf(n)+"!";
    }













}
