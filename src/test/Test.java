package test;

import java.io.Serializable;

abstract class Bike implements Test1{
    abstract void run();
    abstract void run1();
}

class Honda4 extends Bike {

    void run(){System.out.println("running safely..");}

    @Override
    void run1() {

    }

    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();

    }

    @Override
    public void ok() {

    }
}
