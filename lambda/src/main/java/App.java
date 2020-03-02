import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        testMyConsumer(new StringBuilder("MyConsumer"), (input) -> {
            input.insert(0, '*');
            input.append('*');
            System.out.println(input);
        });

        testConsumer(new StringBuilder("Consumer"), (input) -> {
            input.insert(0, '*');
            input.append('*');
            System.out.println(input);
        });

        System.out.println(testMyFunction(4, (input) -> input * input));

        System.out.println(testFunction(6, (Integer input) -> input * input));
    }

    public static void testMyConsumer(StringBuilder stringBuilder, MyConsumer myConsumer) {
        myConsumer.printString(stringBuilder);
    }

    public static <T> void testConsumer(T input, Consumer<T> consumer) {
        consumer.accept(input);
    }

    public static int testMyFunction(int input, MyFunction myFunction) {
        return myFunction.getSquare(input);
    }

    public static <T, R> R testFunction(T input, Function<T, R> function) {
        return function.apply(input);
    }


}
