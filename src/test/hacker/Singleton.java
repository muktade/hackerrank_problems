package test.hacker;

public class Singleton {
    private static Singleton sg=null;

    public static Singleton getSg() {
        return sg;
    }

    public static void setSg(Singleton sg) {
        Singleton.sg = sg;
    }

    public static Singleton getInstance(){
        if(sg!=null){
            sg= new Singleton();
        }
        return sg;
    }
}
