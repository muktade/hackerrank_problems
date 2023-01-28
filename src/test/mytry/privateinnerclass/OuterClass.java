package test.mytry.privateinnerclass;

public class OuterClass {
    public static class InnerClass{
        private class pr{
            public pr(){

                System.out.println("Access create..");
            }
            public void print(int a){
                System.out.println("ami print method.. "+a);
            }
        }
    }
}
