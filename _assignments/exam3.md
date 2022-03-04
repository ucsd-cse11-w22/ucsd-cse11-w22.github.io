---
layout: with-sidebar
index: 11
name: Exam 3
released-on: "2022-3-4"
---
# Exam 3

### Release: 10am Friday March 4, 2022
### Due: 10pm Saturday March 5, 2022

**Note that this is released after class Friday, and is due the next day in the evening. We will not accept late submissions.**


This page details a take-home exam that you will complete over the next few
days. You can’t communicate with anyone about the content of the assignment
until you receive your grade. You can message us privately on Piazza, but the
course staff will not give programming advice or answer most questions, including clarifications, about the
problems. If you have technical trouble creating a screencast (detailed below)
feel free to reach out for assistance.

Do not use any online service other than Piazza to ask questions about the
assignment. Do not search for, solicit, or use solutions to the problems that
you find elsewhere for the exam. These are all violations of academic integrity
that students have committed on exams like this in the past.

You can make use of any course notes, online resources about Java and its
libraries, Java tools, and so on to complete the exam, including re-using code
from class notes.

You can review the grading policy for exams in the [syllabus](/syllabus.html).
You will complete the programming task below and submit your work to the `Exam3` Gradescope assignment.

Starter code is available here:

[https://github.com/ucsd-cse11-w22/cse11-exam3-starter](https://github.com/ucsd-cse11-w22/cse11-exam3-starter)

Submission checklist (see long descriptions below for full details):

- [ ] `ComparatorQueue.java`
- [ ] `CSVTool.java`
- [ ] `video.*` (`*` means whatever extension you have; we *really* prefer `mp4`, which is what Zoom produces. If you use an extension other than mp4, check that it plays in Gradescope!)

The starter code has been marked with the following annotation:

```java
// Task #.#: [Title]
// Your code here
```
You will only need to add code where you see this annotation.

Make sure to look at your Gradescope submission after submitting to see if all the required files are there.


### **Task 1 will be autograded. Task 2 will be both autograded and manually graded. Task 3 will be manually graded.** 

Make sure that your submission passes autograder for your code to be properly graded. 

If you are having issues with getting the autograder to run successfully, you may find it helpful to consult the [Developing with the Gradescope Autograder in Mind](https://docs.google.com/document/d/1IKSDkG4kHC0gb2FyqdeOWJOAbQr6UCvYZSToIBopfVs/edit?usp=sharing) guide.

If your submission passes the autograder, then you should see output similar to:

<img src="exam2_success.png">

Be aware that the Sanity check does not check for code correctness, but rather that your code compiles. 

Your submission will be graded **after** the deadline. You should test thoroughly yourself to make sure your program works as expected.

## Clarifications

**Can I use a Java feature/library/method that we haven't covered in class?**

Yes, just make sure it doesn't break the autograder. The course staff is not responsible for fixing any submissions that fail the autograder during or after the exam. 

**Can we write more methods than specified?**

Yes, you can write additional helper methods.

**Can I use previous code that I wrote for a PA in my exam?**

Yes.


## Task 1 – Generics and Exceptions
You will be writing your code in `ComparatorQueue.java`. You will creating a new generic class called `Queue` that will take 2 arguments for its constructor. `Queue` will have 2 fields: A generic `List<E>` object called `contents` and a `Comparator<E>` object called `comp`. These two fields will be set by its constructor. All imports have already been done for you.

You may find [Collections.sort()](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List,%20java.util.Comparator)) useful for this Task.

Note: If you do not name these fields exactly, you will fail the autograder.

### Task 1.1
In the `Queue` class, you will use the design recipe to write a method called `add` that returns `void` and takes an argument of type `E` and adds it to the Queue. `Add` should preserve sorted order of elements such that the smallest element (as defined by the comparator) occurs at earlier indices than larger elements.

### Task 1.2
In the `Queue` class, you will use the design recipe to write a method called `contains` that takes and argument of type `E` and returns a `boolean` indicating whether or not that element is contained in `Queue`. You will return `true` if the element is contained in `Queue`, `false` otherwise.

### Task 1.3
In the `Queue` class, you will use the design recipe to write a method called `remove` that returns `boolean` and takes an argument of type `E` and removes one instance of it from `Queue`. If the argument does not exist in `Queue`, then you will throw a `NoSuchElementException` with no message. If the argument does exist, then you will return `true` if the remove was successful and `false` if the remove was unsuccessful. `Remove` should preserve sorted order of elements such that the smallest element (as defined by the comparator) occurs at earlier indices than larger elements.

### Task 1.4
In the `Queue` class, you will use the design recipe to write a method called `poll` that takes no arguments and returns and removes the top element (element at index `0`) of `Queue`. If there are no elements in `Queue` you will return `null`. `Poll` should preserve sorted order of elements such that the smallest element (as defined by the comparator) occurs at earlier indices than larger elements.

Here is an incomplete list of basic tests to get you started that you can use as you like (and to help make sure we agree on how these methods work). These tests have been provided in `Sanity.java` for your convenience.

``` java
import tester.*;
import java.util.ArrayList;
import java.util.Comparator;

class ProvidedQueueTests_Sanity {
    void testAdd(Tester t) {
        Queue<Integer> q = new Queue(new ArrayList(), new IntCompare_Sanity());
        q.add(1);
    }

    void testContains(Tester t) {
        Queue<Integer> q = new Queue(new ArrayList(), new IntCompare_Sanity());
        q.add(1);
        
        t.checkExpect(q.contains(1), true);
    }

    void testRemove(Tester t) {
        Queue<Integer> q = new Queue(new ArrayList(), new IntCompare_Sanity());
        q.add(1);
        
        t.checkExpect(q.remove(1), true);
    }

    void testPoll(Tester t) {
        Queue<Integer> q = new Queue(new ArrayList(), new IntCompare_Sanity());
        q.add(2);
        q.add(1);
        
        t.checkExpect(q.poll(), 1);
        t.checkExpect(q.poll(), 2);
    }
}

class IntCompare_Sanity implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
```

## Task 2 – Command Line and String Parsing

You will be writing your code in a file called `CSVTool.java`. All imports have already been done for you. You should use [Hashmaps](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) this task, but you are not required to. You may additionally import Hashmaps if you use them.

Given a command line in the form of: 

```java
java CSVTool <query file> <data file 1> <data file 2> ... <data file n>
```

You will be printing out the results of CSVTool to the console. CSVTool will always be given at least 2 arguments, the first argument will always be the query file and the arguments that follow will always be CSV files. 

The query file will not contain duplicates. The data files may contain duplicates. 

The query file will be a list of query terms separated by a new line. The data files will consist of `query, value` pairs separated by a new line. We have included some files of each type for you to inspect. 


You will print out the following information:
- The query that produced the greatest value. This value will be the sum of all the values that query corresponds to across all data files.
- The query that appeared the most amount of times
- The data file that matched the most amount of queries

In the event of any ties for the above metrics, you may return any of the ties.

In addition to the above, you will also print out general stats for both queries and data files.

For each query, you will print out the following on one line:

```java
<# of data files that contained the query> <Query> <List of all the data files that contained the query>
```

For each data file, you will print out the following on one line:
```java
<# of queries matched> <Data file name including extension> <List of all queries that matched to the data file>
```

If you implement this correctly, then you should match the output below exactly. Be aware of the order shown. Since order matters, you must be consistent with the order of queries and file names given. 

Notice that in the first example below, mug comes before franchise. This is because mug comes before franchise in queries_1.txt. Additionally notice that data_1.csv comes before data_3.csv in the second example. This is because data_1.csv comes before data_3.csv. You will need to match this order to recieve points on this task.
```java
$ java CSVTool queries_1.txt data_1.csv
Greatest query is franchise with value 79
Most common query is mug and occured 2 time(s)
The file with the most query matches is data_1.csv with 2 matches

Stats:
1 mug [data_1.csv]
1 franchise [data_1.csv]
0 pardon []
0 intention []
0 sip []
0 smile []

2 data_1.csv [mug, franchise]
$ java CSVTool queries_2.txt data_1.csv data_3.csv
Greatest query is estimate with value 36
Most common query is estimate and occured 1 time(s)
The file with the most query matches is data_3.csv with 1 matches

Stats:
0 composer []
1 estimate [data_3.csv]
0 buffet []

0 data_1.csv []
1 data_3.csv [estimate]
```

To assist you with output formatting, we have provided the following (incomplete) code snippet:

```java
System.out.println("Greatest query is " + /* your code here */ + " with value " + /* your code here */ );
System.out.println("Most common query is " + /* your code here */ + " and occured " + /* your code here */ + " time(s)");
System.out.println("The file with the most query matches is " + /* your code here */ + " with " + /* your code here */ + " matches");

System.out.println();
System.out.println("Stats:");
/* For each query */
System.out.println(/* # of data file that contained the query*/ + " " + /* the query */ + " " + /* List of all data files that contained the query */);

System.out.println();

/* For each data file */
System.out.println(/* # of queries matched*/ + " " + /* Data file name including extension */ + " " + /* List of all queries that matched to the data file */)
```

Task 2 will also be manually graded.

## Video Task

You will record a short video of no more than 5 minutes. 

Tip: If you find yourself running out of time, you might be explaining your code too much. If the task does not ask you to directly explain your code, you don't need to explain it. 

Include:

- Show only your face and a picture ID (your student ID is preferred but any
picture ID with your name on it will work) for a few seconds at the beginning.
You don’t have to be on camera the whole time, though it’s fine if you are. Just
a brief confirmation that it’s you creating the video/doing the work attached to
the work itself is what we want. If you do not have a webcam, take a picture of
yourself (and your picture ID) with your phone and display that picture at the
start of your screen share.
- Write a test that causes an `NoSuchElementException` in `remove`. This test must not already be pre-written prior to the video. You may use checkExpect or checkException. 

  Show that the code causes an exception, then scroll to and make a comment at *each line of your code* that was evaluating on the **stack** when the exception was thrown. 
  
  Additionally, type out the *stack trace* at the moment the exception was thrown from the `remove` method. 

  Include only stack frames for methods in your code (not in libraries).

  Show the stack trace in the format below (table). You may prepare the table before the video, but you must fill it in during the video. Ignore the this reference and Tester parameter for tester methods in your trace.

  For objects and references, you can use any reference numbers that are consistent (see that the this parameter and the n local variable are the same below), and don't include the contents of the heap.

```java
class Numbers {
  List<Integer> values;
  Numbers(List<Integer> values) { this.values = values; }
  int addAll() {
    int total = 0;
    for(Integer i: this.values) {
      total += i;
      throw new RuntimeException(); // This line on the stack
    }
    return total;
  }
}
class ExamplesNumbers {
  void testNumbers(Tester t) {
    List<Integer> is = Arrays.asList(1, 2, 3)
    Numbers n = new Numbers(is);
    int total = n.addAll(); // This line on the stack
  }
}
/*
class             method        this reference      other variables
ExamplesNumbers   testNumbers   <ignore>            is = :1; n = :2
Numbers           addAll        :2                  total = 1; i = 1
*/
```
- There is no video task associated with Task 2.
