package Introduction;

public class GarbageCollection {
    public static void main(String[] args) {
        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random person");
        }
    }
}
    class A{
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destructed");
        }
    }
