package Trek119;

public class Main {
    public static void main(String[] args) {

        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.add("Арбуз");
        arrayListExample.add("Дыня");
        System.out.println("Содержит 'Арбуз': " + arrayListExample.contains("Арбуз"));
        arrayListExample.remove("Арбуз");
        System.out.println("Содержит 'Арбуз': " + arrayListExample.contains("Арбуз"));
        System.out.println("Содержит 'Дыня': " + arrayListExample.contains("Дыня"));


        HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.add("Cat");
        hashSetExample.add("Dog");
        System.out.println("Питомец 'Cat': " + hashSetExample.contains("Cat"));
        hashSetExample.remove("Cat");
        System.out.println("Питомец 'Cat': " + hashSetExample.contains("Cat"));


        HashMapExample hashMapExample = new HashMapExample();
        hashMapExample.add(1, "Красный");
        hashMapExample.add(2, "Синий");
        hashMapExample.add(3, "Желтый");
        System.out.println("Цвет по номером один: " + hashMapExample.get(1));
        System.out.println("Цвет 'Синий': " + hashMapExample.containsValue("Синий"));
        hashMapExample.remove(2);
        System.out.println("Цвет 'Синий': " + hashMapExample.containsValue("Синий"));
        System.out.println("Цвет 'Желтый': " + hashMapExample.containsValue("Желтый"));

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add("One");
        linkedListExample.add("Two");
        System.out.println("Содержит 'One': " + linkedListExample.contains("One"));
        linkedListExample.remove("One");
        System.out.println("Содержит 'One': " + linkedListExample.contains("One"));
    }
}