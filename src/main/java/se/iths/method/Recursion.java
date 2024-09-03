package se.iths.method;

//-Xss88k
public class Recursion {
    public static int counter = 0;

    public static void main(String[] args) {
        //recursion();

        tail(10);
        head(10);
    }

    public static void recursion() {
        System.out.println(++counter);
        recursion();
    }

    public static void tail(int n){
        if( n == 1 )
            return;
        else
            System.out.println(n);
        tail(n-1);
    }

    public static void head(int n){
        if( n == 0)
            return;
        else
            head(n-1);
        System.out.println(n);
    }
}
