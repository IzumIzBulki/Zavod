package lesson.OOPsem5.Work2;

public class Dog extends Animal{

    public Dog(String type, String name, String color, String gender, Number age, Number weight, Number health) {
        super(type, name, color, gender, age, weight, health);
    }



    @Override
    public String voice() {return "Гав, Гав";}

    @Override
    public String toString() {
        return "Dog{" +
                "Порода='" + type + '\'' +
                ", Кличка='" + name + '\'' +
                ", Цвет='" + color + '\'' +
                ", Пол='" + gender + '\'' +
                ", Возраст=" + age +
                ", Вес=" + weight +
                ", Здоровье=" + health +
                '}';
    }
}
