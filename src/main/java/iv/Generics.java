package iv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animal {}
class Vertebrate extends Animal {
    private boolean isLand;
    public Vertebrate(boolean isLand) {
        this.isLand = isLand;
    }
    public Vertebrate() {}
}
class Mammal extends Vertebrate {
    private int weight;
    public Mammal(int weight) {
        this.weight = weight;
    }
    public Mammal() {}
}

class Canidae extends Mammal {
    public Canidae() {}
}

class Dog extends Canidae {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Generics {
    public static void main(String[] args) {
        System.out.println("INIT");
        List<Mammal> mammals = Stream.of(
                new Mammal(10),
                new Mammal(20),
                new Mammal(30),
                new Mammal(40)
        ).collect(Collectors.toList());

        Mammal newMammal = new Mammal(50);
        Mammal newMammal2 = new Mammal(60);
        Vertebrate vertebrate = new Vertebrate(false);
        mammals.add(newMammal);

        List<? extends Mammal> extMammals = mammals;
//        extMammals.add(newMammal2);
        List<? super Mammal> supMammals = mammals;
//        supMammals.add(vertebrate);
        supMammals.add(newMammal2);

        Mammal can = new Canidae();
        Canidae can2 = new Canidae();
        Mammal dog = new Dog("pawel");
        Animal animal = new Animal();

//        mammals.add(can);
//        mammals.add(can2);
//        mammals.add(dog);
//        mammals.add(animal);

        System.out.println(mammals);


//        List<Number> intList = new ArrayList<Integer>();
//        intList.add(Integer.valueOf(42));
//        intList.add(new Double(42.4));

        List<Number> intList = new ArrayList<Number>();
        intList.add(Integer.valueOf(42));
        intList.add(Double.valueOf(42.4));
        intList.add(Double.valueOf(43.4));
        intList.add(Double.valueOf(44.4));
        intList.add(Double.valueOf(45.4));

        List<? extends Number> intList2 = new ArrayList<Integer>();
//        intList2.add(Integer.valueOf(3));

        List<? super Integer> intList3 = new ArrayList<Integer>();
        intList3.add(Integer.valueOf(3));
//        intList3.add(Double.valueOf(3.0));

        List<Dog> dogs = Stream.of(
                        new Dog("reksio"),
                        new Dog("fi"),
                        new Dog("fai"),
                        new Dog("foo"),
                        new Dog("fuu"))
                .collect(Collectors.toList());

        List<Vertebrate> vertebrates =
                Stream.of(new Vertebrate(false),
                        new Vertebrate(false),
                        new Vertebrate(false),
                        new Vertebrate(false),
                        new Vertebrate(false)).collect(Collectors.toList());
//        Collections.copy(mammals, dogs);
//        Collections.copy(dogs, mammals);
//        Collections.copy(vertebrates, mammals);
//        Collections.copy(mammals, vertebrates);

        System.out.println("before copy " + mammals);
        copy(dogs, mammals);
        System.out.println("COPIED " + mammals);
    }

    static <T> void copy(List<T> src, List<? super T> target) {
        for (T element: src) {
            target.add(element);
            List<? super T> target2 = src;
            target2.add(element);
        }


    }
}
