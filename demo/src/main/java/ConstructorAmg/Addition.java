package ConstructorAmg;

/**
 * Created by Subodh on 05/01/2022.
 */
public class Addition {
   private int a;
    private int b;
    public Addition(double a, double b){
        System.out.println("from double");
        this.a=(int)a;
        this.b=(int)b;
    }
    public Addition(int a, int b){
        System.out.println("From integer");
        this.a=a;
        this.b=b;

    }



    public Addition(String a,String b){
        System.out.println("String");
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
    }

    public  void doSum(){
        System.out.println("sum="+(this.a+this.b));
    }
}
