---
layout: with-sidebar
index: 4
name: PA3
released-on: "2021-01-19"
---

# CSE 11 Programming Assignment 3

### Due Date: Tuesday, January 25, 10:00PM Pacific Time

## Learning Goals
- Draw memory diagrams
- Practice with creating objects and classes

## Collaboration

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, but you must
create your own memory diagrams and descriptions for answers.  In your
submission, give credit to all students and course staff who helped you with
this assignment by noting their name and how you used their ideas or work. Note
that using someone's work without giving credit to them is a violation of
academic integrity.


## Submission Checklist

You can download the starter code for this assignment here:

[https://github.com/ucsd-cse11-w22/cse11-pa3-starter](https://github.com/ucsd-cse11-w22/cse11-pa3-starter)

You should submit:

- [ ] `Task1.java`
- [ ] `task1-diagram.png` (or another image extension like `.jpg`)
- [ ] `ExamplesR.java`
- [ ] `task3-diagram.png` (or another image extension like `.jpg`)

## Task 1

### Task 1 Code

In the file `Task1.java`, add the following class definitions
(you can copy/paste them from here):

```java
class C1 {
  C2 other;
  C1(C2 other) {
    this.other = other;
  }
}

class C2 {
  int x;
  C2(int x) {
    this.x = x;
  }
}
```

Then add a class definition called `Task1` with the following fields:

- A field named `first` of type `C2` with its `x` field equal to 10
- A field named `second` of type `C1`. It's value should be a reference to a
  `C1` object with its `other` field set to any `C2` object _other than the
  one stored in_ `first` (you can create another `C2` object for this).
- A field named `third` of type `C1`. Its value should be a reference to a
  `C1` object. That `C1` object should have its `other` field hold a reference
  to _the same C2 object_ as the one stored in `first`.

### Task 1 Memory Diagram

Then, create a _memory diagram_ of the objects you created. Focus on the objects
as they appear in the output and as created at the end of the program (there are
no meaningful stack frames to draw). Submit the memory diagram in
`task1-diagram.png` (or another similar image file type). Submit the code in
`Task1.java1`.

Your memory diagram should include:

- _All_ of the objects created, with accurate field values and class names
- A unique reference for each object
- Accurate uses of references between objects

You can draw it on paper and take a picture, draw it digitally, or use a tool
like [Google Drawing](https://drawings.new) to create it.

## Task 2

Create a class named `R` that has two fields: one of type `String` and one of
type `R`. Give it the usual constructor that initializes both fields. Put the
class in a file called `ExamplesR.java`. Add an `ExamplesR` class to this file,
and answer the following question with code and comments in that file:

Construct an example `R` object. Were you able to? Copy the output of running
your program into a comment in `ExamplesR.java` if you were able to, and explain
why you think it's not possible if you weren't.

Submit the `ExamplesR.java` file for this task.

## Task 3

In [Lecture 9](https://ucsd-cse11-w22.github.io/lectures/lecture9.html) we
discussed drawing traces and memory diagrams for the `RectRegion` class. Draw a
trace of the method call to `contains` in the following example:

```
RectRegion pa3Rect = new RectRegion(new Point(10, 20), new Point(30, 40));
Point p = new Point(50, 60);
boolean result = this.pa3Rect.contains(this.p);
```

Make sure to include:

- The relevant objects with unique references and accurate field values
  - The `RectRegion` object and its fields
  - All three relevant `Point` objects and their fields
- A method body for each method call with either values substituted or a stack
frame showing accurate values for parameters (including `this`)
- The value resulting from each method call

Submit the memory diagram as `task3-diagram.png` (or another image filetype).
