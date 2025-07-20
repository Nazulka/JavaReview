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









}
