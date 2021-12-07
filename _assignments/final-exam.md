---
layout: with-sidebar
index: 12
name: Final Exam
released-on: "2021-12-4"
---

# Final Exam

### Release: 9am Saturday December 4, 2021

### Due: 9am Tuesday, December 7, 2021

This page details a take-home exam that you will complete over the next few
days. You can’t communicate with anyone about the content of the assignment
until you receive your grade. You can message us privately on Piazza, but the
course staff will not give programming advice or answer most questions about the
problems. If you have technical trouble creating a screencast (detailed below)
feel free to reach out for assistance.

Do not use any online service other than Piazza to ask questions about the
assignment. Do not search for, solicit, or use solutions to the problems that
you find elsewhere for the exam. These are all violations of academic integrity
that students have committed on exams like this in the past.

You can make use of any course notes, online resources about Java and its
libraries, Java tools, and so on to complete the exam, including re-using code
from class notes or your own past PAs.

You can review the grading policy for exams in the [syllabus](/syllabus.html).

The exam is split into three parts. Per the grading policy for the course, you
**only** need to complete the parts for which you didn't receive full credit
during the quarter. For example, if you scored a 2 on the first exam, a 1 on
the second, and a 2 on the third, you should only submit part 2.

Each part has a separate Gradescope assignment to submit to with a partial
autograder. Passing the autograder tests does _not_ mean that the submission
will get a full score on that part; it just means it passes basic tests and
doesn't have any typos in class or method names that cause compile errors, and
works with the format of tests we are using. Check the results when you submit
to make sure the correct files are included.

## Exam 1 Material

Starter code:

[https://github.com/ucsd-cse11-f21/Final-Part-1-starter](https://github.com/ucsd-cse11-f21/Final-Part-1-starter)

### Exam 1, Task 1

In the class `Exam1Task1Examples` in `Exam1Task1.java`, write a method called
`rectanglePerimeter` that takes two `int` arguments representing the width and
height of a rectangle, and returns an `int` representing the _perimeter_ of the
rectangle. For example, a rectangle with width `4` and height `10` has a
perimeter of `28`.

### Exam 1, Task 2

In the file `Exam1Task2.java`, create three classes at the top level:

- One called `Student` with:
  - Two `String` fields, `displayName` and `email`
  - A standard constructor that initializes these fields to arguments (in the
    order `displayName` then `email`)
- One called `PiazzaPost`, with:
  - Three fields – a `Student` field called `author`, an `int` field called
    `views`, and a `String` field called `content`
  - A standard constructor that initializes these fields to arguments (in the
    order `author`, `views`, `content`)
  - An instance method `sameDisplayName`, that takes another `PiazzaPost` as a
    parameter and returns `true` if their authors have the same display name,
    and `false` otherwise
- `Exam1Task2Examples`, with three examples for `sameDisplayName`: one that returns
  `true` because the `author` fields refer to the same student object, and one
  that returns `true` where the `author` fields are different students with the
  same display name, and one that returns `false`. (Create as many objects as
  you need to do this). Do this as fields on the examples class, not as tester
  methods.

### Video Task

Create a video of no more than 3 minutes. In it:

- Show your ID
- Run your program for `Exam1Task2` and show the output. Highlight in the
  _output_ the the `Student` object that is shared across two different
  `PiazzaPost` instances, then put a comment next to the definition of that
  object in your code with the reference number.
- There is no video task associated with Task 1

### Submission

Upload to `Final-Part-1` on Gradescope:

- `Exam1Task1.java`
- `Exam1Task2.java`
- Your video

## Exam 2 Material

Starter code:

[https://github.com/ucsd-cse11-f21/Final-Part-2-starter](https://github.com/ucsd-cse11-f21/Final-Part-2-starter)

### Exam 2, Task 1

In the file `Exam2Task1.java`, in class `Exam2Task1Examples`, write a method
called `averageBeforeValue` that takes an array of doubles and another double
called `stopAt`. It should return the average (mean) of the numbers in the
array that appear at indices _before_ the first index where `stopAt` appears in
the array. If `stopAt` doesn't appear in the array, the entire array should be
averaged. If the array is empty or `stopAt` is the first element, the method
should return `0`.

### Exam 2, Task 2

Write a class called `WordQuery` in `WordQuery.java` with a `main` method. It
should take any number of command line arguments. The first argument should be
either `"greater"` or `"less"`. The remaining arguments should be in the format
accepted by `Double.parseDouble`. If the first argument is `"greater"`, the
program should print all the numberic arguments that are _strictly larger_ than
the first numeric argument. If it's `"less"`, it should print all the numbers
that are _strictly smaller_ than the first numeric argument. If only `"less"`
or `"greater"` is provided, or only a single number, or no numbers match, the
program should print nothing. If the first argument isn't `"less"` or
`"greater"`, or no arguments are provided, the program should print `Use "less"
or "greater" as the first argument.` and nothing else.

Example:

```
$ javac WordQuery.java
$ java WordQuery greater 1.0 5.6 3.2 0.5
5.6
3.2
$ java WordQuery greater
$ java WordQuery equals 1.0 3.0
Use "less" or "greater" as the first argument.
$ java WordQuery
Use "less" or "greater" as the first argument.
```

### Exam 2, Task 3

In `ToText.java`, you can find the `Region` classes we've used in lecture.

Add a method `toText` to the interface and each class that takes no arguments
and returns a `String`. It should have the following behavior:

- For a `CircleRegion`, it returns `"Circle"`
- For a `RectRegion`, it returns `"Rectangle"`
- For a `UnionRegion`, it returns `"Union(<region1>, <region2>)"`, where `<region1>`
  is the `toText` of the first region in the union, and `<region2>` is the
  `toText()` of the second.
- For an `IntersectRegion`, it returns `"Intersect(<region1>, <region2>)"`, where
  `<region1>` is the `toText` of the first region in the intersection, and
  `<region2>` is the `toText` of the second.

### Video Task

Make a video of no longer than 5 minutes. In it:

- Show your ID as usual
- Run an example of `averageBeforeValue` with an array of at length `5` that
  contains the `stopAt` value at index `3`. Show the output, then write a loop
  table of a loop in the body of `averageBeforeValue`, showing each variable's value before
  and after each the loop iteration. Put it in a comment, using the same format
  demonstrated for `averageWithoutLowest` in [exam 2](./exam2.html)
- There is no video task associated with Task 2 and 3.

### Submission

Submit to `Final-Part-2` on Gradscope:

- `ToText.java`
- `Exam2Task1.java`
- `WordQuery.java`
- Your video

## Exam 3 Material

Starter code:

[https://github.com/ucsd-cse11-f21/Final-Part-3-starter](https://github.com/ucsd-cse11-f21/Final-Part-3-starter)

### Task 1

Consider this interface:

```
interface Query<T> { boolean matches(T t); }
```

In the class `CountExamples` in the file `Counts.java`, write a static generic
method `counts`. It should have a single type variable `T` and take two
arguments: `List<Query<T>>` called `queries` and a `List<T>` called `values`.
It should return a `List<Integer>` of the same size as the list `queries`. Each
index in the returned list corresponds to the _count_ of values for which
`matches` returned `true` for the query at that index in `queries`.

For example:

```
class LongerStringQuery implements Query<String> {
  int length;
  LongerStringQuery(int length) { this.length = length; } 
  public boolean matches(String s) { return s.length() > this.length; }
}
class EqualStringQuery implements Query<String> {
  String s;
  EqualStringQuery(String s) { this.s = s; } 
  public boolean matches(String other) { return s.equals(other); }
}
class CountExamples {
  /* your definition of counts here */ 

  void testCounts(Tester t) {
    Query<String> q1 = new LongerStringQuery(2);
    Query<String> q2 = new EqualStringQuery("banana");
    Query<String> q3 = new LongerStringQuery(3);
    List<Query<String>> qs = Arrays.asList(q1, q2, q3);
    List<String> docs = Arrays.asList("banana", "pea", "apple", "tomato", "pear");
    // All 5 values are longer than 2
    // 1 value is equal to "banana"
    // 4 values are longer than 3
    t.checkExpect(counts(qs, docs), Arrays.asList(5, 1, 4);
  }
}
```


### Task 2

Write a class called `FileSearch` in a file called `FileSearch.java`. It should
have a `main` method that expects several command line arguments. The first
should be the name of a file that has, on each line, the name of another file.
The rest of the command-line arguments are words to search for in those files.

The program should print a message with the word that appeared in the most
files, and the document that matched the most words


files.txt:
```
doc1.txt
doc2.txt
doc3.txt
doc4.txt
```

doc1.txt:
```
This is a document about java generics
```

doc2.txt:
```
java is really a kind of coffee
```

doc3.txt:
```
collections of generics are common in many languages, such as java
```

doc4.txt:
```
this doesn't contain any search queries at all
```

```
$ java FileSearch files.txt java generics collections groundhog
Most relevant search term: java
Most relevant document: doc3.txt

java: 3 [doc1.txt, doc2.txt, doc3.txt]
generics: 2 [doc1.txt, doc3.txt]
collections: 1 [doc3.txt]
groundhog: 0 []

doc1.txt: 2 [java, generics]
doc2.txt: 1 [java]
doc3.txt: 3 [java, generics, collections]
doc4.txt: 0 []
```

In general, `FileSearch` takes a file and one or more query terms as
command-line arguments. It expects that the first file contains names of files
to search, and that the other arguments contain search terms to look for in
those files.

The program prints out the search term that matched the most documents, and the
document that had the most search terms match. Then it prints out the detailed
information about matches of the terms and documents:

- For each term it prints a count of how many documents it was found in, with a
list of the matches in brackets
- For each document it prints how many terms were found in the document, with a
list of the matches in brackets

A search term matches a document if it appears in it somewhere. It still counts
as a match if it's a substring of some other word – “bat” would match a document
containing “bath,” for instance. A term can only match each document once; don't
count multiple matches of the same word within one document.

If there is a *tie* for the most relevant term or most relevant document, report
the one that appears earlier in the file (for document names) or earlier on the
command line (for query terms).

If no term matches any document, print the message `No matches found.` and no
other information.

You can assume:

- The query file will have single words separated by newlines, and there won't
  be duplicate words or spaces on the lines
- All matches are case-sensitive, matching exactly as typed
- Files provided as command line arguments will exist and won't be empty
- At least a query file and one document file will be provided
- All the files will be in the same folder/directory as the program

Recall that PA7 has some useful provided code that is good for reading files
across different platforms.

### Video Task

Create a video of no more than 5 minutes:

- Show your ID as usual
- For `counts`, write an example other than the given one where the `values`
  list is of `Integer` and you write your own class for `Query<Integer>` (you
  should do this anyway to make sure your method works!). Draw a stack trace of
  all the active method calls _just before_ the `return` statement the first time
  a `matches` method is called when running this example. Follow the same
  guidelines as in [exam 3](./exam3.html) for drawing the stack trace.
- There is no video task related to `FileSearch`.

### Submission

Submit to Final-Part-3:

- `Counts.java`
- `FileSearch.java`
- Your video


## Study

We are conducting a study related to remote exams. The details are embedded
below; if you choose not to opt out your exam submission may be used as part of
a research project.

<iframe src="https://drive.google.com/file/d/1U6naucU4rT5tmes2saYRsmghToH7VgGD/preview" width="640" height="480" allow="autoplay"></iframe>
