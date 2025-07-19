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




}
