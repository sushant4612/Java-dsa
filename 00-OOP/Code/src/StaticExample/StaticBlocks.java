package StaticExample;

public class StaticBlocks {
    static int a = 4;
    static int b;

    //will run only once when the first object is created i.e when class is load for first time
    static {
        System.out.println("I am a static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlocks obj = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        StaticBlocks.b += 5;

        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        StaticBlocks obj1 = new StaticBlocks();

        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);
    }
}
