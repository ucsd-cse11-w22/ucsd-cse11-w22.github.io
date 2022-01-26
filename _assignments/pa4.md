---
layout: with-sidebar
index: 5
name: PA4
released-on: "2022-01-26"
---

# CSE 11 Programming Assignment 4

### Due Date: Tuesday, February 1, 10:00PM Pacific Time

## Learning Goals
- Practice working with interfaces
- Practice with creating objects and classes

## Collaboration
Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, but you must
create your own memory diagrams and descriptions for answers.  In your
submission, give credit to all students and course staff who helped you with
this assignment by noting their name and how you used their ideas or work. Note
that using someone's work without giving credit to them is a violation of
academic integrity.

You can get the starter code at

[https://github.com/ucsd-cse11-w22/cse11-pa4-starter](https://github.com/ucsd-cse11-w22/cse11-pa4-starter)

## Submission Checklist
- [ ] Tweets.java
    - [ ] TextTweet + ReplyTweet class
        - [ ] isReplyTo method
        - [ ] totalLikes method
        - [ ] allAuthors method
        - [ ] textAppearsOnThread method
        - [ ] countPopularTweets method
    - [ ] 2 additional test per method, total 10, using tester library
        - [ ] 1 thread
        - [ ] 3 different authors
        - [ ] 5 different tweets
- [ ] Numbers.java
    - [ ] WholeNumber + Fraction + Decimal
        - [ ] numerator method
        - [ ] denominator method
        - [ ] add method
        - [ ] multiply method
        - [ ] toText method
        - [ ] toDouble method
    - [ ] Exploration task

## Tweets

<div class='sidenote'>A Twitter-specific pattern is writing a <a
href="https://help.twitter.com/en/using-twitter/create-a-thread">“thread”</a> by
replying to one's own Tweets repeatedly. These threads could be interspersed
with replies from other accounts, as well. This is a common pattern on many
social-media sites, where some mechanism for replies and follow-up posts are
allowed.</div>

In a file `Tweets.java`, write an `interface` called `Tweet` with four
methods:

- `public boolean isReplyTo(Tweet other);`
- `public int totalLikes();`
- `public String allAuthors();`
- `public boolean textAppearsOnThread(String text);`
- `public int countPopularTweets(int minNumLikes);`

Then, write three classes:

- `User`, just as in PA2

- `TextTweet`, implements `Tweet` and has three fields:
  - `contents`, a `String`
  - `likes`, an int
  - `author`, a `User`

  This class should implement the methods as follows:
  - `isReplyTo` should return `false` no matter what Tweet it receives
  - `totalLikes` should return the number of likes on this `TextTweet` object
  - `allAuthors` should return the username of the author of this `TextTweet`
  - `textAppearsOnThread` should return `true` when the given text is in the contents
    of this `TextTweet`, `false` otherwise.
  - `countPopularTweets` should return `1` if the number of likes on this tweet is strictly greater than the given int, `0` otherwise.

- `ReplyTweet`, which should implement `Tweet` and has four fields:
  - `contents`, a `String`
  - `likes`, an int
  - `author`, a `User`
  - `replyTo`, a `Tweet`

  This class should implement the methods as follows:
  - `isReplyTo` should return `true` if the `replyTo` of this `ReplyTweet` is
  the given `Tweet`, as compared by `==`.
  - `totalLikes` should return the total number of likes on this `ReplyTweet` object
  **plus** the `totalLikes` of its `replyTo` Tweet. For example, a thread of tweets that is 4 replies long should sum the likes on all 4 of those tweets.
  - `allAuthors` should return the username of the author of this `ReplyTweet`
  followed by a semicolon (`";"`), followed by `allAuthors` of its `replyTo`
  Tweet.
  - `textAppearsOnThread` should return `true` when the given text appears in
  the `contents` of this `ReplyTweet`, or if it appears on the thread of the
  `replyTo` Tweet.
  - `countPopularTweets` should return the number of tweets in the thread that have like counts strictly greater than the given number of likes.

Add constructors as appropriate to initialize the fields on objects of these
classes.

Some tests you can start with are here; you can copy them to your program as you
implement the various methods.

```java
    User greg = new User("gregory_miranda", "Greg Miranda", 9999);
    User sanmi = new User("sanmi_adeleye", "Sanmi Adeleye", 999);
    User sangeetha = new User("sangeetha_viswanathan_sakthivel", "Sangeetha Viswanathan Sakthivel", 1000000);
    Tweet t1 = new TextTweet("Java 17 has a cool feature called records", this.sanmi, 77);
    Tweet t2 = new ReplyTweet("Hmm I wonder if we could use it for CSE11", this.greg, 12, this.t1);
    Tweet t3 = new ReplyTweet("Thought about this more, probably not yet, too new.", this.greg, 73, this.t2);
    Tweet t4 = new ReplyTweet("Yeah, good point. Maybe in 2022.", this.sanmi, 10, this.t3);
    Tweet t5 = new ReplyTweet("Yeah... I don't want to rewrite the book right this minute", this.sangeetha, 1005, this.t2);

    void testIsReplyTo(Tester t) {
        t.checkExpect(this.t1.isReplyTo(this.t2), false);
        t.checkExpect(this.t2.isReplyTo(this.t1), true);
        t.checkExpect(this.t5.isReplyTo(this.t2), true);
        t.checkExpect(this.t2.isReplyTo(this.t2), false);
        t.checkExpect(this.t4.isReplyTo(this.t3), true);
    }

    void testTotalLikes(Tester t) {
        t.checkExpect(this.t5.totalLikes(), 1005 + 12 + 77);
        t.checkExpect(this.t4.totalLikes(), 10 + 73 + 12 + 77);
        t.checkExpect(this.t1.totalLikes(), 77);
    }

    void testAllAuthors(Tester t) {
        t.checkExpect(this.t1.allAuthors(), "sanmi_adeleye");
        t.checkExpect(this.t2.allAuthors(), "gregory_miranda;sanmi_adeleye");
        t.checkExpect(this.t3.allAuthors(), "gregory_miranda;gregory_miranda;sanmi_adeleye");
        t.checkExpect(this.t5.allAuthors(), "sangeetha_viswanathan_sakthivel;gregory_miranda;sanmi_adeleye");
    }

    void testTextAppearsOnThread(Tester t) {
        t.checkExpect(this.t1.textAppearsOnThread("sanmi_adeleye"), false);
        t.checkExpect(this.t1.textAppearsOnThread("2022"), false);
        t.checkExpect(this.t1.textAppearsOnThread("cool"), true);
        t.checkExpect(this.t4.textAppearsOnThread("wonder"), true);
        t.checkExpect(this.t4.textAppearsOnThread("Java"), true);
        t.checkExpect(this.t4.textAppearsOnThread("rewrite"), false);
        t.checkExpect(this.t4.textAppearsOnThread("2022"), true);
    }

    void testCountPopularTweets(Tester t) {
        t.checkExpect(this.t1.countPopularTweets(100), 0);
        t.checkExpect(this.t2.countPopularTweets(10), 2);
        t.checkExpect(this.t3.countPopularTweets(70), 2);
        t.checkExpect(this.t5.countPopularTweets(0), 3);
    }
```

### Additional Testing and Exploration

You must also add your own tests. Construct your own (made-up or real) Tweet
thread with at least 3 different authors and at least 5 different Tweets, and
write at least 2 additional tests for each method – try to think of cases we may
have not thoroughly tested in what's provided.

Put these in an easily-found area of the `ExampleTweets` to help us review your
code; don't add them to the existing methods we provided.

## Numbers

This code will go in the file `Numbers.java`, any tests in a class called
`ExampleNumbers` that you add to that file. 

**Remember that you will not be nesting any interfaces or classes. Doing so will cause the autograder to fail.**

We saw in our reading that representing fractional numbers like 0.6 with
doubles can be fraught. Some languages and libraries do support exact
fractions, and we can implement classes that act like them in Java. We won't
be able to use the built-in `+` and `*` operators, because these are only
defined for numbers and strings, but we can define methods for the operations
we care about. We can represent numbers with an interface:

```
interface Number {
  int numerator();
  int denominator();
  Number add(Number other);
  Number multiply(Number other);
  String toText();
  double toDouble();
}
```

Your task is to create three classes that implement the interface above. One
should be called `WholeNumber` and represent whole integers. The second should be called `Fraction` and represent mixed
numbers. The third should be called `Decimal` and represent decimals

`WholeNumber` should have:
- A field `int n` and a constructor that takes a single `int`
- An implementation of all the methods above.
  - `numerator` should return the value of `n`
  - `denominator` should return `1`
  - `add` should return a new `Number` that represents adding this whole number to the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
  - `multiply` should return a new `Number` that represents multiplying this whole number to the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
  - `toText` should return the value of `n` as a `String`, so if `n` is `500`, it should return `"500"`
  - `toDouble` should return the value of `n` as a `double`

`Fraction` should have:
- A field `int n` representing the numerator
- A field `int d` representing the denominator
- An implementation of all the methods above:
  - `numerator` should return the value of `n`
  - `denominator` should return the value of `d`
  - `add` should return a new `Number` that represents adding this fraction to the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
  - `multiply` should return a new `Number` that represents multiplying this fraction by the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
  - `toText` should return a `String` in the format `"n/d"` where `n` and `d` are the corresponding fields. So if `n` and `d` were `1` and `2`, this should be `"1/2"`
  - `toDouble` should return the value of `n/d` as a `double`. So if `n` is 1 and `d` is 2, this should return `0.5`

  `Decimal` should have:

    You may find it helpful to use [``Integer.parseInt()``](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String)) to convert a string to an integer.

  - A field `int mantissa` representing the mantissa of the decimal when expressed in scientific notation
  - A field `int exponent` representing the exponent of the decimal when expressed in scietific notation
  - An implementation of all the methods above:
    - `numerator` should return the numerator of the decomal when expressed as a fraction
    - `denominator` should return the denominator of the decimal when expressed as a fraction
    - `add` should return a new `Number` that represents adding this decimal to the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
    - `multiply` should return a new `Number` that represents multiplying this decimal to the one provided as an argument. Note that the argument could be either a `WholeNumber`, `Fraction`, or `Decimal`
    - `toText` should return a `String` in the format `#.#`. So if `mantissa` is `314` and `exponent` is `-2`, this should be `"3.14"`. However, if `mantissa` is `12345` and `exponent` is `-3`, then the result should be `"12.345"`. The amount of numbers before and after the decimal point will depend on the original input.
    - `toDouble` should return the value of the number expressed by the mantissa and exponent as a double. So if `mantissa` is `314` and `exponent` is `-2`, this should be `3.14`

A reminder about arithmetic and fractions:

$$
n = \frac{n}{1}
$$

$$
\frac{n}{d_1} + \frac{m}{d_2} = \frac{d_1m + d_2n}{d_1d_2}
$$

$$
\frac{n}{d_1} \cdot \frac{m}{d_2} = \frac{nm}{d_1d_2}
$$

Some example tests that you can use are below. You can copy-paste these into
your solution as you implement the various methods. All of these tests must pass
on your implementation.

```java
    Number n1 = new WholeNumber(5);
    Number n2 = new WholeNumber(7);
    Number n3 = new Fraction(7, 2);
    Number n4 = new Fraction(1, 2);
    Number n5 = new Decimal("3.25");
    Number n6 = new Decimal("5.5");

    void testAdd(Tester t) {
        t.checkExpect(this.n1.add(this.n2).toDouble(), 12.0);
        t.checkExpect(this.n1.add(this.n3).toDouble(), 5 + 7.0/2.0);
        t.checkExpect(this.n3.add(this.n3).toDouble(), 7.0);
        t.checkExpect(this.n5.add(this.n4).toDouble(), 3.75);
    }

    void testMultiply(Tester t) {
        t.checkExpect(this.n1.multiply(this.n4).toDouble(), 2.5);
        t.checkExpect(this.n3.multiply(this.n4).toDouble(), 7.0/4.0);
        t.checkExpect(this.n6.multiply(this.n1).toDouble(), 27.5);
    }

    void testNumDem(Tester t) {
        t.checkExpect(this.n3.numerator(), 7);
        t.checkExpect(this.n1.numerator(), 5);
        t.checkExpect(this.n5.numerator(), 325);
        t.checkExpect(this.n4.denominator(), 2);
        t.checkExpect(this.n2.denominator(), 1);
        t.checkExpect(this.n6.denominator(), 10);
    }

    void testToString(Tester t) {
        t.checkExpect(this.n4.toText(), "1/2");
        t.checkExpect(this.n3.toText(), "7/2");
        t.checkExpect(this.n2.toText(), "7");
        t.checkExpect(this.n5.toText(), "3.25");
    }
```


### Exploration

At the end of the `ExamplesNumbers` class in a place marked clearly with a
comment that says `// Exploration`, write code to perform four calculations:

1. The result of `0.1 + 0.2 + 0.3` using built-in `double` arithmetic in Java
2. The result of `0.1 + (0.2 + 0.3)` using built-in `double` arithmetic in Java
3. The result of (1) using your exact fractions, showing the result of `add()` via `toText()`
4. The result of (2) using your exact fractions, showing the result of `add()` via `toText()`



## Submission

Then you will submit _all_ of your files to the `PA4` assignment on Gradescope:

- `Numbers.java`
- `Tweets.java`

Tests and exploration sections will be graded manually.  In addition, we may
give you feedback on any part of the code, including automatically graded parts,
that we want you to respond to after grading.
