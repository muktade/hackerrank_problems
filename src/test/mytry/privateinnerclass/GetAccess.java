package test.mytry.privateinnerclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetAccess {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<?> innerClass = OuterClass.class.getDeclaredClasses()[0];
//        System.out.println(innerClass.getClass().getCanonicalName()+" ami aita");
//        Class<?> pr = innerClass.getDeclaredClasses()[0];
//        Constructor<?> constructor = pr.getConstructors()[0];
//        constructor.setAccessible(true);
//        OuterClass outerClass = new OuterClass();
//        Object o = constructor.newInstance(outerClass);
//        System.out.println(o.getClass().getCanonicalName());
        Class<?> innerClass = OuterClass.class.getDeclaredClasses()[0].getDeclaredClasses()[0];
        System.out.println(innerClass.getClass().getCanonicalName());
        Constructor<?> constructor = innerClass.getConstructors()[0];
        constructor.setAccessible(true);

        OuterClass.InnerClass out = new OuterClass.InnerClass();
        Object ob = constructor.newInstance(out);
        Method method = innerClass.getDeclaredMethods()[0];
        method.setAccessible(true);
        method.invoke(ob, 8);

    }
}
