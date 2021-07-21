# CS 445 Recitation 10: Iterators

## Introduction

In this recitation, you will implement several clients of an Iterable collection
that use iterators. You will first write two simple methods to iterate over a
collection, then you will write a method to find the most common element (mode)
in a a collection. The primary goal is to practice using the traversal behavior
that is provided by the iterator object.

## Exercise

1. Download the provided code by forking and cloning this [Recitation 10
repository](https://github.com/2217-cs445/cs445-rec10). The starting code can be
found in the usual location. Note the following provided Java files:

   - `IterableUtils.java` (in package `cs445.rec10`) contains stubs for the
     methods you will write in this exercise. In each, you will complete a task
     using **only** iterators for a collection.
   - `Demo.java` (in package `cs445.rec10`) contains a client for testing the
     `printAll`, `removeShortStrings`, and `findMode` methods.
   - `ListInterface.java` (in package `cs445.list`) contains the list ADT. Note
     that the techniques you practice in this exercise are useful in any
     `Iterable` collection; we’re using a list simply as an example.
   - `ArrayList.java` (in package `cs445.list`) contains an array-based
     implementation of the ADT list, using a resizable array.

2. In the class `IterableUtils`, within the `cs445.rec10` package, write the
generic method `static <T> void printAll(Iterable<T> collection)`, which prints
the contents of any `Iterable` collection. You should rely entirely on
iterators; do not cast the collection or otherwise try to use the List’s
`.get()` method. Test that your method works properly.

3. Check if your `printAll` method works using `./gradlew run`, which will run
`Demo.java`.

4. In the same class `IterableUtils`, write the method `static void
removeShortStrings(Iterable<String> collection, int limit)`, which removes all
strings shorter than `limit`. Again, rely only on iterators for element access,
and test that your method works. Do not attempt to use the List’s `.get()` or
`.remove(int)` methods.

5. Lastly, write the method `static <T> T findMode(Iterable<T> collection)`,
which finds and returns the mode (most common element) from a collection. You
should use multiple iterators to loop through the collection concurrently, and
you should not use any other data structures to determine the mode.

6. Test that your last 2 methods pass the provided tests using `./gradlew test`
(or `gradlew.bat test` on DOS-based terminals) and debug any errors with these
two methods.

## Conclusion

In this exercise, we have practiced using iterators, which are regarded as an
abstraction that provides us with a simple way to iterate over a given data
structure and access its elements. An iterator is sometimes an efficient object
to use as the user does **not** need to be aware of its internal structure. You
can check the input and output of the iterator’s method here: [more about
Iterators](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Iterator.html)

