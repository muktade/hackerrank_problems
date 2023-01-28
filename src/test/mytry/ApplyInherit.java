package test.mytry;

public class ApplyInherit extends Inherite{
    int a;
    ApplyInherit(){
        a=3;
    }

    @Override
    int printIt() {
        super.printIt();
        System.out.println("------------");
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        ApplyInherit aa = new ApplyInherit();
        aa.printIt();
    }
}
