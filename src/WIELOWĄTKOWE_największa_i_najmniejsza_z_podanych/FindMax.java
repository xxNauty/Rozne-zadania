package WIELOWĄTKOWE_największa_i_najmniejsza_z_podanych;

public class FindMax implements Runnable{
    public int a;

    public int b;

    public int c;

    public FindMax(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void run(){
        int max;
        if(a > b){
            if (a > c){
                max = a;
            }
            else{
                max = c;
            }
        }
        else{
            if (a > c) {
                max = b;
            }
            else {
                max = c;
            }
        }
        System.out.println(max);
    }
}