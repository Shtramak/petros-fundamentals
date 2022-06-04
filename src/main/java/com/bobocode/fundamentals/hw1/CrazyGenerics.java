package com.bobocode.fundamentals.hw1;

import com.bobocode.fundamentals.hw1.util.BaseEntity;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CrazyGenerics {
    /**
     * {@link MaxHolder} is a container class that keeps track of the maximum value only. It works with comparable objects
     * and allows you to put new values. Every time you put a value, it is stored only if the new value is greater
     * than the current max.
     *
     * @param <T> – value type
     */
    public static class MaxHolder { // todo: refactor class to make it generic
        private Object max;

        public MaxHolder(Object max) {
            this.max = max;
        }

        /**
         * Puts a new value to the holder. A new value is stored to the max, only if it is greater than current max value.
         *
         * @param val a new value
         */
        public void put(Object val) {
            throw new UnsupportedOperationException(); // todo: update parameter and implement the method
        }

        public Object getMax() {
            return max;
        }
    }


    /**
     * {@link CollectionRepository} defines a contract of a runtime store for entities based on any {@link Collection}.
     * It has methods that allow to save new entity, and get whole collection.
     *
     * @param <T> – a type of the entity that should be a subclass of {@link BaseEntity}
     * @param <C> – a type of any collection
     */
    interface CollectionRepository { // todo: update interface according to the javadoc
        void save(Object entity);

        Collection<Object> getEntityCollection();
    }

    /**
     * {@link ListRepository} extends {@link CollectionRepository} but specifies the underlying collection as
     * {@link List}.
     *
     * @param <T> – a type of the entity that should be a subclass of {@link BaseEntity}
     */
    interface ListRepository { // todo: update interface according to the javadoc
    }

    /**
     * {@link ComparableCollection} is a {@link Collection} that can be compared by size. It extends a {@link Collection}
     * interface and {@link Comparable} interface, and provides a default implementation of a compareTo method that
     * compares collections sizes.
     * <p>
     * Please note that size does not depend on the elements type, so it is allowed to compare collections of different
     * element types.
     *
     * @param <E> a type of collection elements
     */
    interface ComparableCollection { // todo: refactor it to make generic and provide a default impl of compareTo
    }

    /**
     * {@link CollectionUtil} is an util class that provides various generic helper methods.
     */
    static class CollectionUtil {
        static final Comparator<BaseEntity> CREATED_ON_COMPARATOR = Comparator.comparing(BaseEntity::getCreatedOn);

        /**
         * Util method that check if provided collection has new entities. An entity is any object
         * that extends {@link BaseEntity}. A new entity is an entity that does not have an id assigned.
         * (In other word, which id value equals null).
         *
         * @param entities provided collection of entities
         * @return true if at least one of the elements has null id
         */
        public static boolean hasNewEntities(Collection<BaseEntity> entities) {
            throw new UnsupportedOperationException(); // todo: refactor parameter and implement method
        }

        /**
         * Util method that checks if a provided collection of entities is valid. An entity is any subclass of
         * a {@link BaseEntity} A validation criteria can be different for different cases, so it is passed
         * as second parameter.
         *
         * @param entities            provided collection of entities
         * @param validationPredicate criteria for validation
         * @return true if all entities fit validation criteria
         */
        public static boolean isValidCollection() {
            throw new UnsupportedOperationException(); // todo: add method parameters and implement the logic
        }

        /**
         * findMax is a generic util method that accepts an {@link Iterable} and {@link Comparator} and returns an
         * optional object, that has maximum "value" based on the given comparator.
         *
         * @param elements   provided iterable of elements
         * @param comparator an object that will be used to compare elements
         * @param <T>        type of elements
         * @return optional max value
         */
        // todo: create a method and implement its logic manually without using util method from JDK

        /**
         * findMostRecentlyCreatedEntity is a generic util method that accepts a collection of entities and returns the
         * one that is the most recently created. If collection is empty,
         * it throws {@link java.util.NoSuchElementException}.
         * <p>
         * This method reuses findMax method and passes entities along with prepare comparator instance,
         * that is stored as constant CREATED_ON_COMPARATOR.
         *
         * @param entities provided collection of entities
         * @param <T>      entity type
         * @return an entity from the given collection that has the max createdOn value
         */
        // todo: create a method according to JavaDoc and implement it using previous method

    }
}
