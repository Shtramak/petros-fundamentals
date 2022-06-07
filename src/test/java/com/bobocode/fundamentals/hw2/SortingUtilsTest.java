package com.bobocode.fundamentals.hw2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class SortingUtilsTest {
    @Test
    void ifOneElementThenSortedInsertionSort() {
        var generatedValue = ThreadLocalRandom.current().nextInt();
        int[] array = {generatedValue};
        SortingUtils.insertionSort(array);
        assertThat(array).isEqualTo(new int[]{generatedValue});
    }

    @Test
    void ifOneElementThenSortedBubbleSort() {
        var generatedValue = ThreadLocalRandom.current().nextInt();
        int[] array = {generatedValue};
        SortingUtils.bubbleSort(array);
        assertThat(array).isEqualTo(new int[]{generatedValue});
    }

    @Test
    void ifOneElementThenSortedMergeSort() {
        var generatedValue = ThreadLocalRandom.current().nextInt();
        int[] array = {generatedValue};
        SortingUtils.mergeSort(array);
        assertThat(array).isEqualTo(new int[]{generatedValue});
    }

    @Test
    void ifOneElementThenSortedForkJoinMergeSort() {
        var generatedValue = ThreadLocalRandom.current().nextInt();
        int[] array = {generatedValue};
        SortingUtils.forkJoinMergeSort(array);
        assertThat(array).isEqualTo(new int[]{generatedValue});
    }

    @Test
    void ifRandomElementsThenSortedInsertionSort() {
        int[] array = IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(100).toArray();
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.insertionSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifRandomElementsThenSortedBubbleSort() {
        int[] array = IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(100).toArray();
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.bubbleSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifRandomElementsThenSortedMergeSort() {
        int[] array = IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(100).toArray();
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.mergeSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifRandomElementsThenSortedForkJoinMergeSort() {
        int[] array = IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(100).toArray();
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.forkJoinMergeSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifReverseSortedThenSortedInsertionSort() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.insertionSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifReverseSortedThenSortedBubbleSort() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.bubbleSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifReverseSortedThenSortedMergeSort() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.mergeSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

    @Test
    void ifReverseSortedThenSortedForkJoinMergeSort() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();
        SortingUtils.forkJoinMergeSort(array);
        assertThat(array).isEqualTo(sortedArray);
    }

}