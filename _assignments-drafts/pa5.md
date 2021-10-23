---
layout: with-sidebar
index: 5
name: PA5
released-on: "2021-10-27"
---

# Programming Assignment 5 – Arrays and Main

In this assignment, you will get practice with writing methods that calculate
values from arrays using loops.

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, including
sharing code. In your submission, give credit to all students and course staff
who helped you with this assignment by noting their name and how you used their
ideas or work. Note that using someone's work without giving credit to them is
a violation of academic integrity.

The starter code is available at:

[https://github.com/ucsd-cse11-f21/cse11-pa5-starter](https://github.com/ucsd-cse11-f21/cse11-pa5-starter)

## FAQ

1. Can we use <some other library> in this PA instead of loops?
    - In general in this course we try to avoid saying you strictly can't use
    something in the programming assignments. That's a bit artificial. Rather, we
    try to design assignments where using the things we learned most recently would
    be the best and most natural choice for the implementation. That said, if you
    know something you want to try, that's fine. Just be warned that it might be
    more work to not use the stuff we just learned – it was definitely the case that
    there were submissions to PA4 that did much more complex things than necessary
    for Fraction and WholeNumber using features we didn't discuss in class.
2. I wrote test methods with the Tester, but `./run` is telling me that no tests
ran.
    - Tester methods have to start with “test” at the beginning! For example,
    `boolean testAdd(Tester t) { …. }`. In `ArrayExamples.java`, all tests
    should be in class `ArrayExamples`, not `Pair`.
5. I am receiving an array index out of bounds error in `Longest.java`. 
    - Unlike some of the previous methods, you can not make the assumption that
    string argument(s) will be given. Hence, args[0] will throw the index out of
    bounds error. What is a possible way to check if any arguments are given?


6. Help! I did the conditional checking and `Longest.java` is still throwing index out of bounds!

    - Consider the following:
    ```
    if (...){
        // inside for loop
    }
    // after for loop
    ```
    Recall that regardless if the if statement runs or not, the code beneath the if statement will run if not wrapped in an else statement. An else statement may be useful in avoiding the index out of bounds error.

## Array Methods

In a file called `ArrayExamples.java`, write the following methods in a class
called `ArrayExamples`. For each, write **three tests** (a test is a use of
`checkExpect`) where each of the three has a different length of array used
in the input.

- Write a method called `joinWith` that takes an array of `String` and a
`String` separator, and returns a new `String` that contains the strings from
the array separated by that separator. For example, for an array containing
`"a"`, `"b"`, and `"c"` with separator `":"`, the result would be `"a:b:c"`
(note that there's no colon at the end, just in between the elements). If the
input array is empty, produces the empty string.

- Write a method called `somethingFalse` that takes an array of `boolean` and
returns `true` if at least one of the elements in the array is `false`. If the
array is empty, produces `false`.

<div class='sidenote'>“Inclusive” is another way of saying to use ≤ instead
of &lt; and ≥ instead of &gt;</div>

- Write a method called `countWithinRange` that takes an array of `double` and
two other `double`s called `low` and `high`, and returns the count of elements
of the array that are between `low` and `high` (inclusive). If the array is
empty, this should produce `0`. You can assume that `low` ≤ `high`

- Write a method called `numsWithinRange` that takes an array of `double` and
two other `double`s called `low` and `high` and returns an array of `double`
that contains all the elements in the array that are between `low` and `high`
(inclusive). If the array is empty, this should produce a new empty array. You
can assume that `low` ≤ `high`. **Hint**: Use `countWithinRange` to help you
construct the new array.

- Write a class called `Pair` with two `int` fields, `a` and `b`, and include a
  default constructor. (Add `Pair` at the top level, outside the
  `ArrayExamples` class). Then write a method (in `ArrayExamples`, not in
  `Pair`) called `maxmin` that takes an array of `int` and returns a `Pair`
  where the `a` field is set to the smallest integer in the array and the `b`
  is set to the largest. Assume the array has at least one element.

<div class='sidenote'>Computer scientists have a fancy name for alphabetical:
<b>lexicographic</b>. You will need the <a href="https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)">compareTo method on Strings</a> here. Try it out on a few examples if you're not sure what it will do!</div>
- Write a method called `earliest` that takes an array of `String`s and
returns the `String` that is the earliest alphabetically. You can assume that
the array has at least one element.

## Using Main and Command-line Arguments

- In a file called `Longest.java`, write a class called `Longest`. It should
have a main method which prints out the _longest_ string in the command line
arguments. If no arguments were given, it should print nothing. Example:

  ```
  $ javac Longest.java
  $ java Longest which argument is the longest
  argument
  $ java Longest one two three four
  three
  $ java Longest
  $
  ```

  If there is a tie, return the _earliest_ string with the longest length.

- In a file called `Stats.java`, write a class called `Stats`. It should have
a main method which has a different effect depending on the first command
line argument. In all cases, it can assume that there will be at least _two_
command-line arguments, and all the arguments after the first are appropriate
arguments to `Double.parseDouble`. If the first argument is ...

<div class="sidenote">When comparing Strings, the <code>==</code> operator can
be unreliable. Instead use <code>.equals</code> or <code>.compareTo</code>,
which are in the Java String documentation.</div>
  - `"--product"`, print the product of the provided numbers
  - `"--mean"`, print the average (mean) of the provided numbers
  - `"--total"`, print the sum of the provided numbers
  - `"--max"`, print the maximum of the provided numbers
  - `"--min"`, print the minimum of the provided numbers
  - any other string, print `"Bad option <arg>"` where you will replace
  `"<arg>"` with the first argument

  Examples:

  ```
  $ javac Stats.java
  $ java Stats --product 2 3 4
  24.0
  $ java Stats --mean 5 9 7
  7.0
  $ java Stats --total 1 9 4
  14.0
  $ java Stats --max 9 1 4 0
  9.0
  $ java Stats --min 9 1 4 0
  0.0
  $ java Stats --mix 3 4 5
  Bad option --mix
  ```

All of your Java files you will upload to Gradescope as usual.