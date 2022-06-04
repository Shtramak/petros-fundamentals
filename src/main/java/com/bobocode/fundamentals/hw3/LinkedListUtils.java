package com.bobocode.fundamentals.hw3;

public class LinkedListUtils {
    /**
     * Prints a linked list with arrows like this
     * head:5 -> 7 -> 1 -> 4
     *
     * @param head the first element of the list (head element from implementation of the LinkedList)
     */
    public static void printLinkedList(Node<?> head) {
        // todo:
    }

    /**
     * Accepts a linked list head, reverses all elements and returns a new head (the last element).
     * PLEASE NOTE that it should not create new nodes, only change the next references of the existing ones.
     * E.g. you have a like "head:5 -> 7 -> 1 -> 4" should this method will return "head:4 -> 1 -> 7 -> 5"
     *
     * @param head the first element of the list
     * @param <T>  element type
     * @return new head
     */
    public static <T> Node<T> reverseLinkedList(Node<T> head) {
        throw new UnsupportedOperationException();
    }

    /**
     * Prints a list in a reserved order using a recursion technique. Please note that it should not change the list,
     * just print its elements.
     * <p>
     * Imagine you have a list of elements 4,3,9,1 and the current head is 4. Then the outcome should be the following:
     * 1 -> 9 -> 3 -> 4
     *
     * @param head the first node of the list
     * @param <T>  elements type
     */
    public static <T> void printReversedRecursively(Node<T> head) {
        throw new UnsupportedOperationException("This method should be implemented according to the javadoc"); // todo
    }

    /**
     * Prints a list in a reserved order using a {@link java.util.Stack} instance. Please note that it should not change
     * the list, just print its elements.
     * <p>
     * Imagine you have a list of elements 4,3,9,1 and the current head is 4. Then the outcome should be the following:
     * 1 -> 9 -> 3 -> 4
     *
     * @param head the first node of the list
     * @param <T>  elements type
     */
    public static <T> void printReversedUsingStack(Node<T> head) {
        throw new UnsupportedOperationException("This method should be implemented according to the javadoc"); // todo
    }
}
