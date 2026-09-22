/**
 *  Java program to store unique numbers.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a set of numbers.
        Set<Integer> mySet = new HashSet<>();

        // Add.
        mySet.add(3);
        mySet.add(6);
        mySet.add(2);
        mySet.add(9);
        mySet.add(6);
        mySet.add(2);
        mySet.add(9);
        mySet.add(5);

        // Printing size of mySet.
        System.out.println(mySet.size()); // Output: 5

        // Printing elements of mySet to console.
        System.out.println(mySet); // Output: [2, 3, 5, 6, 9]

    }
}