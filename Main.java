
public class Main{

    public static void calc(int wrk, int wks, int devs){
        double time = 1590;
        double fin = (time/devs)/(wrk*wks)*100;
        System.out.printf("After %d devs of working a %d week sprint and %d hrs/wk it would be at %.0f%% of capacity.%n",devs,wks,wrk,fin);
    }

    public static void main(String[] args){
        calc(8,30,3);
        calc(8,35,3);
        calc(8,40,3);
        calc(9,30,3);
        calc(9,35,3);
        calc(9,40,3);
        calc(10,30,3);
        calc(10,35,3);
        calc(10,40,3);
        calc(11,30,3);
        calc(11,35,3);
        calc(11,40,3);
        calc(8,30,4);
        calc(8,35,4);
        calc(8,40,4);
        calc(8,30,5);
        calc(8,35,5);
        calc(8,40,5);
        calc(8,30,6);
        calc(8,35,6);
        calc(8,40,6);
    }
}
