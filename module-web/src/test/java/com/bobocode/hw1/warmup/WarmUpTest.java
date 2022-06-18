package com.bobocode.hw1.warmup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static com.bobocode.hw1.warmup.WarmUp.sumOfPositiveSequenceFrom;
import static com.bobocode.hw1.warmup.WarmUp.sumOfPrimes;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WarmUpTest {
    @ParameterizedTest
    @CsvSource(value = {"0,1,1", "0,3,6", "1,2,5", "501, 20, 73052"})
    void testSumOfPrimes(Integer skip, Integer numOfElements, Integer result) {
        assertThat(sumOfPrimes(skip, numOfElements)).isEqualTo(result);
    }

    @Test
    void testSumOfPositiveSequence() {
        assertThat(sumOfPositiveSequenceFrom(List.of(1, 0, -1, 1, 2, 3))).isEqualTo(1);
        assertThat(sumOfPositiveSequenceFrom(List.of(-4, -29, 5, 2, 3, -9, 12))).isEqualTo(10);
    }
}