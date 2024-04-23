package WIELOWĄTKOWE_największa_i_najmniejsza_z_podanych;

public class FindMin implements Runnable{
    public int a;

    public int b;

    public int c;

    public FindMin(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void run(){
        int min;
        if(a < b){
            if (a < c){
                min = a;
            }
            else{
                min = c;
            }
        }
        else{
            if (a < c) {
                min = b;
            }
            else {
                min = c;
            }
        }
        System.out.println(min);
    }
}
