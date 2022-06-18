package com.bobocode.hw5;

public class ComparatorUtils {
/*  1
    Implement  a custom method createComparatorComparing
    Declare a generic method that accepts an extraction function and returns a comparator
    Specify method type parameters to make sure that extraction function accepts a target type as input param and returns a comparable type
    Inside the method implement a comparing logic based on values that were computed using extraction function
    Return comparator instance
 */

/*  2
    Implement  a custom method composeComparatorThenComparing
    A method should accept two parameters:
        Comparator
        Extraction function
    And return a new comparator instance that is using a given comparator, and in case comparing values are equals it compares values that are computed based on the extraction function
*/

    public static void main(String[] args) {
/*
        var accountWithMaxBalance = Accounts.generateAccountList(10)
                .stream()
                .max(createComparatorComparing(Account::getBalance))
                .orElseThrow();

        var accountsSortedByBalanceAndBirthday = Accounts.generateAccountList(10)
                .stream()
                .sorted(composeComparatorThenComparing(createComparatorComparing(Account::getBalance),Account::getBirthday))
                .toList();
*/
    }
}
