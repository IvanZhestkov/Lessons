package Informatics;

/**
 * Created by User on 25.02.2017.
 */

// Рекомендуется применять в тех случаях, когда необходимо создать объект, являющийся копией самого себя.

public class Prototype {
    public static void main(String[] args) {
        Human original = new Human(18, "Ivan");
        System.out.println(original.toString());

        Human copy = (Human) original.copy();
        System.out.println(copy.toString());

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1.toString());

        factory.setPrototype(new Human(18, "Name"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }
}

interface Copyable {
    Object copy();
}

class Human implements Copyable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}

class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy() {
        return (Human) human.copy();
    }
}
