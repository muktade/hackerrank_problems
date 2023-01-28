package test.mytry.trybitoperator;

public class AndBitOparator {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(10&12);
        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(4)+" 4bi");
        System.out.println("ok"+(16&16-1));
        System.out.println((8&8-1)==0?2:1);
    }
}
