public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("Hello world! \n");

        Singleton singleton = Singleton.getInstance("FIRST");
        Singleton anotherSingleton = Singleton.getInstance("SECOND");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}