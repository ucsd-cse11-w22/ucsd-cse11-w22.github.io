---
layout: with-sidebar
index: 11
name: Exam 3
released-on: "2021-11-29"
---

### Release: 5pm Monday November 29, 2021

### Due: 9am Wednesday December 1, 2021

**Note that this is released after class Monday, and is due before class, not
due in the evening.**

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
You will complete the programming task below and submit your work to the `Exam3`
Gradescope assignment.

Starter code is available here:

[https://github.com/ucsd-cse11-f21/Exam3-Starter](https://github.com/ucsd-cse11-f21/Exam3-Starter)

Submission checklist:

- `ComparatorLookup.java` containing a class called `ComparatorLookupTable`
- `WordSearch.java` contaning a class called `WordSearch`
- `video.*` containing your video (`*` means whatever extension you have; we
*really* prefer `mp4`, which is what Zoom produces. If you use an extension
other than mp4, check that it plays in Gradescope!)

Check the results when you submit to `Exam3` to make sure you've spelled the
names of your classes correctly and the basic tests pass. Passing the tests on
Gradescope does _not_ mean that your submission is complete and correct, but
should make sure you don't have any typos, code that has the wrong method
header, etc. Please check this output and fix any files that were uploaded with
erroneous names; we will not have time to fix or resubmit submissions with
issues in the short turnaround time for grading.
## Task 1 – ComparatorLookupTable

Write a class called `ComparatorLookupTable`. It should have two type variables,
`K` and `V`, and implement the following instance methods:

- `boolean contains(K key)` – returns `true` if the key was in the initial list
  of keys or has been added, `false` otherwise.
- `void add(K key, V value)` – adds the given pair of key and value to the
  table. If `key` is already in the table, throw an `IllegalArgumentException`
- `V find(K key)` – returns the value corresponding to the given key, or throws
  a `NoSuchElementException` if it isn't defined
- `void update(K key, V value)` – changes the value stored in `key` to `value`,
or throws a `NoSuchElementException` if it isn't defined.

It should have a constructor that takes **three** arguments, a `List<K>`,
`List<V>`, and a `Comparator<K>`.

In all of the methods, the class should use the given `Comparator` to decide
when keys are equal.

It must have at least two fields, called `keys` and `values`, as shown in the
test above, that store lists and add elements in the order specified. You may
also find it useful to store a field that contains the comparator.

**NOTE: We fixed this section, in particular about the third argument
and comparators, at around 7pm on Monday. The tests were accurate and the
description of the constructor was inconsistent with the tests.**

It must use the zero-argument constructors for the exceptions; there is no
specific message to include.

Assume for this implementation:

- Lists of keys given to the constructor will have no duplicates
- Lists of keys and values given to the constructor will be the same length and not contain `null`
- The arguments to the given methods will not be `null`

Here are some sample (not comprehensive) tests:

```
class StringComparator implements Comparator<String> {
  public int compare(String s1, String s2) {
    return s1.compareTo(s2);
  }
}
class ComparatorLookupTableExamples {
  void testUpdate(Tester t) {
    List<String> strs = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
    ComparatorLookupTable<String, Integer> ctl = new ComparatorLookupTable<>(strs, nums, new StringComparator());
    t.checkExpect(ctl.contains("a"), true);
    ctl.update("a", 9);
    t.checkExpect(ctl.find("a"), 9);
    ctl.add("z", 10);
    t.checkExpect(ctl.keys, Arrays.asList("a", "b", "c", "z"));
    t.checkExpect(ctl.values, Arrays.asList(9, 2, 3, 10));

    t.checkException(new IllegalArgumentException(), ctl, "add", "z", 5);
    t.checkException(new NoSuchElementException(), ctl, "find", "y");
  }
}
```

## Task 2 – WordSearch

Write a class called `WordSearch` with the following command-line behavior,
given the listed files:

queries.txt:
```
java
generics
collections
groundhog
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
$ java WordSearch queries.txt doc1.txt doc2.txt doc3.txt doc4.txt
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

In general, `WordSearch` takes two or more files as command-line arguments. It
expects that the first file contains words to search for, and that the other
files contain documents which we will search for those words.

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
the one that appears earlier in the file (for query terms) or earlier on the
command line (for document names).

If no term matches any document, print the message `No matches found.` and no
other information.

You can assume:

- The query file will have single words separated by newlines, and there won't
  be duplicate words or spaces on the lines
- All matches are case-sensitive, matching exactly as typed
- Files provided as command line arguments will exist and won't be empty
- At least a query file and one document file will be provided
- All the files will be in the same folder/directory as the program

## Task 3 – Video

You will record a short video of no more than 5 minutes. Include:

- Show only your face and a picture ID (your student ID is preferred but any
picture ID with your name on it will work) for a few seconds at the beginning.
You don’t have to be on camera the whole time, though it’s fine if you are. Just
a brief confirmation that it’s you creating the video/doing the work attached to
the work itself is what we want. If you do not have a webcam, take a picture of
yourself (and your picture ID) with your phone and display that picture at the
start of your screen share.
- Write a test that causes an `NoSuchElementException` in `find`.  Show the
exception running, then scroll to and make a comment at each _line in your code_
that was evaluating on the stack when the exception was thrown, and then type
out the _stack trace_ at the moment the exception was thrown. Include only stack
frames for methods in your code (not in libraries). Show the stack trace in the
format below. Ignore the `this` reference and `Tester` parameter for tester
methods in your trace. For objects and references, you can use any reference
numbers that are consistent (see that the `this` parameter and the `n` local
variable are the same below), and _don't_ include the contents of the heap.

    ```
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
- There is no video task associated with `WordFilter`.

## Study

We are conducting a study related to remote exams. The details are embedded
below; if you choose not to opt out your exam submission may be used as part of
a research project.

<iframe src="https://drive.google.com/file/d/1U6naucU4rT5tmes2saYRsmghToH7VgGD/preview" width="640" height="480" allow="autoplay"></iframe>


