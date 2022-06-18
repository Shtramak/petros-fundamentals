package com.bobocode.hw4;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CrazyLambdas {
    /**
     * Returns a {@link Function} that converts a {@link BigDecimal} number into a {@link String} that start with
     * a dollar sign and then gets a value
     *
     * @return function that converts adds dollar sign
     */
    public static Function<BigDecimal, String> toDollarStringFunction() {
        throw new UnsupportedOperationException();
    }

    /**
     * Receives two parameter that represent a range and returns a {@link Predicate<String>} that verifies if string
     * length is in the specified range. E.g. min <= length < max
     *
     * @param min min length
     * @param max max length
     * @return a string predicate
     */
    public static Predicate<String> lengthInRangePredicate(int min, int max) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns an {@link IntUnaryOperator} that receives an int as a bound parameter, and returns a random int
     *
     * @return int operation
     */
    public static IntUnaryOperator boundedRandomIntSupplier() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a {@link LongBinaryOperator} sum operation.
     *
     * @return binary sum operation
     */
    public static LongBinaryOperator longSumOperation() {
        throw new UnsupportedOperationException();
    }

    /**
     * Receives int parameter n, and returns a {@link Supplier} that supplies {@link IntUnaryOperator}
     * that is a function f(x) = n * x
     *
     * @param n a multiplier
     * @return a function supplier
     */
    public static Supplier<IntUnaryOperator> nMultiplyFunctionSupplier(int n) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a {@link UnaryOperator} that accepts str to str function and returns the same function composed with trim
     *
     * @return function that composes functions with trim() function
     */
    public static UnaryOperator<Function<String, String>> composeWithTrimFunction() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a {@link Function} that accepts an instance of {@link Runnable} and returns a {@link Supplier} of a
     * started {@link Thread} that is created from a given {@link Runnable}
     *
     * @return a function that transforms runnable into a thread supplier
     */
    public static Function<Runnable, Supplier<Thread>> runnableToThreadSupplierFunction() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a {@link BiFunction} that has two parameters. First is {@link IntUnaryOperator} which is some integer function.
     * Second is {@link IntPredicate} which is some integer condition. And the third is {@link IntUnaryOperator} which is
     * a new composed function that uses provided predicate (second parameter of binary function) to verify its input
     * parameter. If predicate returns {@code true} it applies a provided integer function
     * (first parameter of binary function) and returns a result value, otherwise it returns an element itself.
     *
     * @return a binary function that receiver predicate and function and compose them to create a new function
     */
    public static BiFunction<IntUnaryOperator, IntPredicate, IntUnaryOperator> functionToConditionalFunction() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a {@link BiFunction} which first parameter is a {@link Map} where key is a function name, and value is some
     * {@link IntUnaryOperator}, and second parameter is a {@link String} which is a function name. If the map contains a
     * function by a given name then it is returned by high order function otherwise an identity() is returned.
     *
     * @return a high-order function that fetches a function from a function map by a given name or returns identity()
     */
    public static BiFunction<Map<String, IntUnaryOperator>, String, IntUnaryOperator> functionLoader() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns {@link Supplier} of {@link Supplier} of {@link Supplier} of {@link String} "WELL DONE!".
     *
     * @return a supplier instance
     */
    public static Supplier<Supplier<Supplier<String>>> trickyWellDoneSupplier() {
        throw new UnsupportedOperationException();
    }
}

