package task;

//  Замерьте время, за которое в ArrayList добавляется 100000 элементов.
//  Замерьте время, за которое в LinkedList добавляется 100000 элементов.
//  Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task00 {
    public static void main(String[] args) {
        Random random = new Random();
        long startTimeArray = System.nanoTime();

        List<Integer> arrayList;
        arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++)
            arrayList.add(random.nextInt());
        long endTimeArray = System.nanoTime();

        long startTimeLinked = System.nanoTime();

        List<Integer> linkedList;
        linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++)
            linkedList.add(random.nextInt());
        long endTimeLinked = System.nanoTime();

        System.out.println("Время заполнения ArrayList  = " + (endTimeArray - startTimeArray));
        System.out.println("Время заполнения LinkedList = " + (endTimeLinked - startTimeLinked));
    }
}

// Время заполнения ArrayList  = 116564600
// Время заполнения LinkedList = 179590800
