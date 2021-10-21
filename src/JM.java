/*
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * Java Core. Практическая задача 4.1.8
 */

public class JM {

    public static void main(String[] args) {

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
    if (stackTraceElements.length == 2) {
        return null;
    }
    return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
}
}

