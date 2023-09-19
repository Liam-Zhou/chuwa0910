package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elementsasdf
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        assertEquals(1, list.get(0), "First element of list should be 1 ");
        assertEquals(1, list.size(), "Current Size of list should be 1");

        List<Integer> list2 = Arrays.asList(2,3);
        list.addAll(list2);
        assertEquals(3, list.size(), "Current Size of list should be 3");
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.print(list+"\n");
        list.remove(1);
        System.out.print(list+"\n");
        list.remove(Integer.valueOf(1));
        System.out.print(list+"\n");
        list.subList(0, 2).clear();
        System.out.print(list+"\n");
        list.clear();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.set(0, 7);
        System.out.print(list+"\n");
        list.replaceAll(integer -> integer+2);
        System.out.print(list+"\n");

        System.out.print(list.contains(2)+"\n");
        System.out.print(list.contains(9)+"\n");
        System.out.print(list.indexOf(6)+"\n");
        System.out.print(list.lastIndexOf(6)+"\n");
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element<3) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
