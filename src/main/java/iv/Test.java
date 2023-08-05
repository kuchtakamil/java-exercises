package iv;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Calculator{
    int calculate(int i1, int i2){
        return i1+ i2;
    }
    double calculate(byte b1, byte b2){
        return b1 % b2;
    }
}
public class Test {
    public static void main(String[] args) {
//        Employee.main(args);
//        byte b = 100;
//        int i = 20;
//        System.out.println(new Calculator().calculate(b,i));

//        final IntStream intStream = IntStream.rangeClosed(1, 10).mapMulti((i, consumer) -> {
//            for (int j = 1; j < -i; j++) {
////                consumer.accept(j);
//            }
//        });
//        System.out.println(intStream.collect(Collectors.toList()).toString());
    }

    class Employee {
//        public static void main(String[] args) {
//            System.out.println("DRUGI!!! " + args[1]);
//        }
        String name;
        int age;
        Employee(){
            this("Jas" ,33);
        }

        Employee(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
