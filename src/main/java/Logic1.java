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


}
