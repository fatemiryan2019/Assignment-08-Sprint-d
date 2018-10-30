public class Main {

    public static double workEffort;

    public static void main(String[] args) {
        workEffort = 0;

        addWork(20);
        addWork(40);
        addWork(40);
        addWork(50);
        addWork(80);
        addWork(100);
        addWork(160);
        addWork(240);
        addWork(360);
        addWork(500);

        calcCapacity(8,3,30);
        calcCapacity(8,4,30);
        calcCapacity(8,5,30);
        calcCapacity(8,6,30);
        calcCapacity(9,3,30);
        calcCapacity(10,3,30);
        calcCapacity(11,3,30);

        calcCapacity(8,3,35);
        calcCapacity(8,4,35);
        calcCapacity(8,5,35);
        calcCapacity(8,6,35);
        calcCapacity(9,3,35);
        calcCapacity(10,3,35);
        calcCapacity(11,3,35);

        calcCapacity(8,3,40);
        calcCapacity(8,4,40);
        calcCapacity(8,5,40);
        calcCapacity(8,6,40);
        calcCapacity(9,3,40);
        calcCapacity(10,3,40);
        calcCapacity(11,3,40);


    }

    public static void addWork(double time) {
        workEffort += time;
    }

    public static void calcCapacity(int eng, int wks, int hpw) {
        double capacity = workEffort / (eng * wks * hpw);
        System.out.printf("\nAfter %d devs for a %d week sprint, for %d hours/week, the total would be at %d%% of capacity.\n\n",eng,wks,hpw,(int)(capacity*100));
    }
}



