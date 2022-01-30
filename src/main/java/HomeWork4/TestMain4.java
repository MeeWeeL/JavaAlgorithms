package HomeWork4;

import HomeWork4.deque.MyLinkedListForDeque;
import HomeWork4.deque.MyLinkedListForDequeImpl;
import HomeWork4.lesson.SimpleLinkedListImpl;
import HomeWork4.lesson.TwoSideLinkedList;
import HomeWork4.lesson.TwoSideLinkedListImpl;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestMain4 {

    public static void main(String[] args) {
        testLinkedList();
//        testHomeWork();
//        testIterator();
    }

    private static void testLinkedList() {

        MyLinkedListForDeque<Integer> linkedList = new MyLinkedListForDequeImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(11);

        linkedList.display();
//
        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));
////
        System.out.println("remove first: " + linkedList.removeFirst());
        System.out.println("remove last: " + linkedList.removeLast());
        System.out.println("remove 1: " + linkedList.remove(1));
        System.out.println("remove 2: " + linkedList.remove(2));
        System.out.println("remove 4: " + linkedList.remove(4));
        System.out.println("remove 11: " + linkedList.remove(11));
        System.out.println("remove 111: " + linkedList.remove(111));
//        linkedList.remove(11);
//
        linkedList.display();
        linkedList.displayBack();

    }

    private static void testHomeWork() {
        //ДОЛЖНО РАБОТАТЬ!

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();

        for (Integer value : linkedList) {
            System.out.println("value: " + value);
        }
    }


    private static void testIterator() {
        List<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = linkedList.iterator();
        //     first: reset
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }

    }
}
