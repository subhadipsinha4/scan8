public class FebonacciNumbers {
    public static void main(String[] args) {
        int length=25;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=0;i<length-1;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
