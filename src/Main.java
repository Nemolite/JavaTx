// Итерфейсы

interface MyInter{
    void myfanc();

    default void print(){

        System.out.println("default method");
    }
}

class MyClass implements MyInter{
    public void myfanc(){
        System.out.println("MyClass->MyInter");
    }
}

class MyClass2 implements  MyInter{
    public void myfanc(){
        System.out.println("MyClass2->MyInter");
    }
}

////////////////////////////////

interface Inter {
    double method(double a,double b);
}

class Simple1 implements  Inter{
    public double method(double a,double b){
        return a * b;
    }
}

class Simple2 implements  Inter{
    public double method(double a,double b){
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        // --
        // MyInter mi = new MyInter();

       MyClass mc = new MyClass();
       mc.myfanc();

        MyClass2 mc2 = new MyClass2();
        mc2.print();

        ///////
        Inter in;
        in = new Simple1();
        System.out.println(in.method(4,2));
        in = new Simple2();
        System.out.println(in.method(4,2));

    }
}