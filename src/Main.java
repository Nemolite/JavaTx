// Итерфейсы

interface MyInter{
    void myfanc();
}

class MyClass implements MyInter{
    public void myfanc(){
        System.out.println("MyClass->MyInter");
    }
}

public class Main {
    public static void main(String[] args) {
        // --
        // MyInter mi = new MyInter();

       MyClass mc = new MyClass();
       mc.myfanc();

    }
}