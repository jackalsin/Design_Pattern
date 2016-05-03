package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Java Reflection makes it possible to inspect classes, interfaces,
 * fields and methods at runtime,
 * without knowing the names of the classes, methods etc.
 * at compile time. It is also possible to instantiate new objects,
 * invoke methods and get/set field values using reflection
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class ReflectionTest {

    /**
     * Main function
     * @param args sys args.
     */
    public static void main(String[] args) {
        Class reflectClass = UFOEnemyShip.class;

        String className = reflectClass.getName();

        System.out.println(className + "\n");

        int classModifier = reflectClass.getModifiers();

        // isAbstract, isFinal, isInterface, isPrivate, isProtected, isStatic
        System.out.println(Modifier.isPublic(classModifier) + "\n");

        Class[] interfaces = reflectClass.getInterfaces();
        System.out.println("interfaces " + Arrays.toString(interfaces));

        Class classSuper = reflectClass.getSuperclass();
        System.out.println(reflectClass.getName() + "'s Super class is" + classSuper);


        Method[] methods = reflectClass.getMethods();
        System.out.println("Methods " );
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------------------------------------");

        System.out.println("return type:" + methods[0].getReturnType());

        Class[] parameterTypes = methods[0].getParameterTypes();

        System.out.println("Parameter types = " + Arrays.toString(parameterTypes));


        Constructor constructor = null;
        Constructor constructor2 = null;

        try {
//            constructor = reflectClass.getConstructor(new Class[] {String.class});
            constructor2 = reflectClass.getConstructor(int.class, String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            UFOEnemyShip enemyShipFactory = (UFOEnemyShip) constructor2.newInstance(12, "t");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        Field privateStringName = null;

        UFOEnemyShip enemyShipPrivate = new UFOEnemyShip();

        try {
            privateStringName = UFOEnemyShip.class.getDeclaredField("idcode");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
