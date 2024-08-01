import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        CircusPerformer performer = new CircusPerformer("Ihor", "clown", 10);

        for (Method method : performer.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    try {
                        method.invoke(performer);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}