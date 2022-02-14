---
layout: with-sidebar
index: 8
name: PA6
released-on: "2022-02-09"
---

# Programming Assignment 6 – Arrays and Main


**Due Tuesday February 22 10:00pm Pacific Time**

In this assignment, you will get practice with writing methods that calculate
values from arrays using loops.

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, including
sharing code. In your submission, give credit to all students and course staff
who helped you with this assignment by noting their name and how you used their
ideas or work. Note that using someone's work without giving credit to them is
a violation of academic integrity.

The starter code is available at:

[https://github.com/ucsd-cse11-w22/cse11-pa6-starter](https://github.com/ucsd-cse11-w22/cse11-pa6-starter)

## Submission

Submit the following files to Gradescope in the PA6 assignment:

- [ ] `ArrayExamples.java`
- [ ] `CmdTool.java`
- [ ] `CmdTool-transcript.txt`

## FAQ
1. I wrote test methods with the Tester, but `./run` is telling me that no tests
ran.
    - Tester methods have to start with “test” at the beginning! For example,
    `boolean testAdd(Tester t) { …. }`. In `ArrayExamples.java`, all tests
    should be in class `ArrayExamples`, not `Pair`.

## Array Methods

In a file called `ArrayExamples.java`, write the following methods in a class
called `ArrayExamples`. For each, write **three tests** (a test is a use of
`checkExpect`) where **each of the three has a different length of array used in
the input, one of which tests an empty array (if it is allowed as an input)**. All
of these methods should be `static`.

- Write a `static` method called `joinWith` that takes an array of `String` and a
`String` separator, and returns a new `String` that contains the strings from
the array separated by that separator. For example, for an array containing
`"a"`, `"b"`, and `"c"` with separator `":"`, the result would be `"a:b:c"`
(note that there's no colon at the end, just in between the elements). If the
input array is empty, produces the empty string.

- Write a `static` method called `somethingFalse` that takes an array of `boolean` and
returns `true` if at least one of the elements in the array is `false`. If the
array is empty, produces `false`.

<div class='sidenote'>“Inclusive” is another way of saying to use ≤ instead
of &lt; and ≥ instead of &gt;</div>

- Write a `static` method called `countWithinRange` that takes an array of `double` and
two other `double`s called `low` and `high`, and returns the count of elements
of the array that are between `low` and `high` (both inclusive). If the array is
empty, this should produce `0`. You can assume that `low` ≤ `high`

- Write a `static` method called `numsWithinRange` that takes an array of `double` and
two other `double`s called `low` and `high` and returns an array of `double`
that contains all the elements in the array that are between `low` and `high`
(inclusive). If the array is empty, this should produce a new empty array. You
can assume that `low` ≤ `high`. **Hint**: Use `countWithinRange` to help you
construct the new array.

- Write a class called `Pair` with two `int` fields, `a` and `b`, and include the usual initializing constructor. (Add `Pair` at the top level, outside the
  `ArrayExamples` class). Then write a `static` method (in `ArrayExamples`, not in
  `Pair`) called `maxmin` that takes an array of `int` and returns a `Pair`
  where the `a` field is set to the smallest integer in the array and the `b`
  is set to the largest. Assume the array has at least one element.

<div class='sidenote'>Computer scientists have a fancy name for alphabetical:
<b>lexicographic</b>. You will need the <a href="https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)">compareTo method on Strings</a> here. Try it out on a few examples if you're not sure what it will do!</div>

- Write a `static` method called `earliest` that takes an array of `String`s and
returns the `String` that is the earliest alphabetically. You can assume that
the array has at least one element, and that if there is a tie you should return the one at the earliest index.

Below are a few tests to get you started. We designed these to work on their own
in a separate class. You must include them all in your final submission (it
helps us check that basic things work when reviewing your code). But these tests
don't cover all cases, which is why you must write your own as well.

```
import tester.*;
class ProvidedArrayExamples {
  void testJoinWith(Tester t){
    String[] example1 = {"a", "b","c"};
    t.checkExpect(ArrayExamples.joinWith(example1, ":"), "a:b:c");
  }

  void testSomethingFalse(Tester t){
    boolean[] example1 = {true, false};
    t.checkExpect(ArrayExamples.somethingFalse(example1), true);
  }

  void testCountWithinRange(Tester t){
    double[] example = {0.1, 1.3, 2.6};
    t.checkExpect(ArrayExamples.countWithinRange(example, 1.1, 2.2), 1);
  }

  void testNumsWithinRange(Tester t){
    double[] example = {0.0, 3.0, 1.4, 1.5, 2.7, 9.1, 2.1};
    double[] expected = {1.4, 1.5, 2.1};
    t.checkExpect(ArrayExamples.numsWithinRange(example, 1.1, 2.2), expected);
  }

  void testMaxmin(Tester t){
    int[] example = {4, 5, 2, 3, 1};
    t.checkExpect(ArrayExamples.maxmin(example), new Pair(1, 5));
  }

  void testEarliest(Tester t){
    String[] example = {"aa", "aab", "abcd", "a"};
    t.checkExpect(ArrayExamples.earliest(example), "a");
  }
}
```

## Using Main and Command-line Arguments

- In a file called `CmdTool.java`, write a class called `CmdTool`. It should have a main method which will allow CmdTool to do different types of operations depending on the command line arguments given. It will print its output to the terminal in a single line. 

    In all cases, it can assume that there will be at least _two_ command-line arguments (the name of an operation and at least one number expressed as 0, a positive integer, or negative integer). 

<div class="sidenote">When comparing Strings, the <code>==</code> operator can
be unreliable. Instead use <code>.equals</code> or <code>.compareTo</code>,
which are in the Java String documentation.</div>

You will be responsible for implementing the following 12 command options:
  - `"sum"`, computes the sum of an array of numbers. If there are no numbers, then returns a `String[]` containing 0
  - `"product"`, computes the product of an array of integers. If there are no integers, then returns a `String[]` containing 1.
  - `"mean"`, computes the mean of an array of integers. The mean itself may be a double. If there are no integers, then returns a `String[]` containing 0
  - `"max"`, computes the maximum of an array of integers. If there are no integers, then returns an empty array
  - `"min"`, computes the minimum of an array of integers. If there are no integers, then returns an empty array
  - `"positive"`, filters the given array to include only strictly positive integers. Zero is not included. If there are no integers that are strictly positive, then returns an empty array. 
  - `"negative"`, filters the given array to include only strictly negative integers. Zero is not included. If there are no integers that are strictly negative, then returns an empty array
  - `"count"`, computes the size of an array of integers.
  - `"greater #"`, filters the given array to include integers that are strictly greater than `#`. If there are no integers that are strictly greater than `#`, then returns an empty array.  
  - `"lesser #"`, filters the given array to include integers that are strictly lesser than `#`. If there are no integers that are strictly lesser than `#`, then returns an empty array
  - `"equal #"`, filters the given array to include integers that are equal to `#`. If there are no integers that are equal to `#`, then returns an empty array
  - `"-l c1 c2 ... cn"` and `"-list c1 c2 ... cn"`, given one or more command options, returns the array that is the result of executing command `c1`, then `c2`, until command `cn`. One command line will only have one or `-l` or `-list` and this option will always be the first option if it is used. 

  As this portion of PA6 will be significantly longer than the prior PAs, it is recommended that you decompose this problem and work step by step. The PA writeup will guide you through the recommended process to approach this task. 

  To assist you in completing this task, we introduce the `Command` interface:

  ```java
  interface Command {
      // Takes a String[] that contains the initial data
      // and returns a String[] that contains the 
      // data that results from executing a command
      String[] execute(String[] data);
  }
  ```

  It is required that you create several small classes, each corresponding to a single command option, that implement the `Command` interface. You are free to implement these classes however you want, including adding fields and/or helper methods. These small classes and their corresponding `execute` method will be tested separate from the functionality of `CmdTool`.

  These classes will be:
  - `class Sum { ... }` which corresponds to the `sum` command option
  - `class Product { ... }` which corresponds to the `product` command option
  - `class Mean { ... }` which corresponds to the `mean` command option
  - `class Max { ... }` which corresponds to the `max` command option
  - `class Min { ... }` which corresponds to the `min` command option
  - `class Count { ... }` which corresponds to the `count` command option
  - `class Positive { ... }` which corresponds to the `positive` command option
  - `class Negative { ... }` which corresponds to the `negative` command option
  - `class Greater { ... }` which corresponds to the `greater` command option. You will use the String representation of `#` for the constructor.
  - `class Lesser { ... }` which corresponds to the `lesser` command option. You will use the String representation of `#` for the constructor.
  - `class Equal { ... }` which corresponds to the `equal` command option. You will use the String representation of `#` for the constructor.
  - `class CmdList { ... }` which corresponds to the `-l` and `-list` command options. You will use a `Command[]` for the constructor
  

  Here is a list of recommended progress milestones that may help you while implementing `CmdTool`. It is not required that you follow these milestones. Be aware that as you progress through the different milestones, you should not be losing any functionality. 

  ### Milestone 1
  Your program should take in one command option between `sum`, `product`, `mean`, `max`, `min`, `positive`, `negative`, and `count` and a list of integers on the command line and print out the result.

  ```
  $ javac CmdTool.java
  
  $ java CmdTool sum 1 2 3
  6
  
  $ java CmdTool product 1 2 3
  6
  
  $ java CmdTool mean 1 2 3
  2.0
  
  $ java CmdTool max 1 2 3
  3
  
  $ java CmdTool min 1 2 3
  1
  
  $ java CmdTool positive -1 0 1 2 3
  1 2 3
  
  $ java CmdTool negative -1 0 1 2 3
  -1
  
  $java CmdTool count 1 -1 0
  3
  ```

  ### Milestone 2
  Your program should take in one command option between `greater`, `lesser`, and `equal` and a list of integers on the command line and print out the result

  ```
  $ javac CmdTool.java

  $ java CmdTool greater 1 1 2 3
  2 3

  $ java CmdTool lesser 2 1 2 3
  1

  $ java CmdTool equal 3 3 1 2 3
  3 3
  ```

  ### Milestone 3
  Your program should take in the `-l` or `-list` option and one of any command option and a list of integers on the command line and print out the result.

  ```
  $ javac CmdTool.java

  $ java CmdTool -l greater -2 0 1 2 3
  0 1 2 3

  $ java CmdTool -l sum 1 2 -2 -1
  0

  $ java CmdTool -list positive -3 -2 -1 0

  $ java CmdTool -list mean 1 2 3 4
  2.5
  ```

  ### Milestone 4
  Your program should take in the `-l` or `-list` option and any number of any of the command options in any order and a list of integers on the command line and print out the result.

  ```
  $ javac CmdTool.java

  $ java CmdTool -l sum greater -1 -1 0 1 2
  2

  $ java CmdTool -l sum sum sum sum sum sum 1 2 3
  6

  $ java CmdTool -list greater 0 negative -1 0 1

  $ java CmdTool -list positive mean -1 -2 -3 9 8 7
  8.0
  ```
  
  Here are some helper methods that you may find helpful:
  ```java
  // Prints the contents of a String[] on one line
  void printArray(String[] data);

  // Returns the number of command options on the command line
  int countCmds(String[] args);

  // Returns a String[] containing only the integer data
  String[] processCmdData(String[] args);

  // Returns a Command object corresponding to a command option
  Command processCmd(String[] args);

  // Returns a Command[] containing Command objects corresponding
  // to all the command options on the command line
  Command[] processCmdList(String[] args);

  ```

  ## Testing
  In a file you create called `CmdTool-transcript.txt`, include at least 2 of your own tests (different from the provided tests for Milestones 1 - 4) of your `CmdTool` implementation running each of the following situations. You will include both the command line and the output:

  1. One command option between `sum`, `product`, `mean`, `max`, `min`, `positive`, `negative`, or `count` and a list of at least 3 integers
  2. One command option between `greater`, `lesser`, or `equal` and a list of at least 3 integers
  3. The `-l` or `-list` option followed by one of any command option and a list of at least 3 integers
  4. The `-l` or `-list` option followed by at least 2 command options and a list of at least 3 integers. Your 2 tests for this situation should not have the same amount of command options after `-l`

  Example of CmdTool-transcript.txt:
  ```
  java CmdTool sum 1 2 3
  6

  java CmdTool max 1 2 3
  3

  java CmdTool greater 1 1 2 3
  2 3

  java CmdTool equal 3 3 1 2 3
  3 3

  java CmdTool -l sum greater -1 -1 0 1 2
  2

  java CmdTool -l sum sum sum sum sum sum 1 2 3
  6

  ```
