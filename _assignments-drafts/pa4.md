---
layout: with-sidebar
index: 3
name: PA4
released-on: "2021-10-22"
---

# CSE 11 Programming Assignment 4

### Due Date: Tuesday, October 26, 10:00PM Pacific Time

## Learning Goals
- Practice working with interfaces
- Practice with creating objects and classes

You can come to lab hours, in-person **or** remote, to get a pre-grading
check-off for this assignment.

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, but you must
create your own memory diagrams and descriptions for answers.  In your
submission, give credit to all students and course staff who helped you with
this assignment by noting their name and how you used their ideas or work. Note
that using someone's work without giving credit to them is a violation of
academic integrity.

## FAQ

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
- `public boolean authorAppearsOnThread(String username);`

Then, write three classes:

- `User`, just as in PA2

- `TextTweet`, implements `Tweet` and has three fields:
  - `contents`, a `String`
  - `likes`, an int
  - `author`, a `User`

  This class should implement the methods as follows:
  same as the username of the `author` of this `TextTweet`, `false` otherwise.
  - `isReplyTo` should return `false`
  - `totalLikes` should return the number of likes on this `TextTweet` object
  - `allAuthors` should return the username of the author of this `TextTweet`
  - `authorIsOnThread` should return `true` when the given username is the
  username of the `author` of this `TextTweet`
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
  - `authorIsOnThread` should return `true` when the given username is the
  username of the `author` of this `ReplyTweet`, or if it's the username is an
  author on the thread of this `ReplyTweet`'s `replyTo`.

Add constructors as appropriate to initialize the fields on objects of these
classes.

For each of the four methods, write at least _three_ tests for it in a class
called `Tweets` using the `Tester` library; note that we say “four,” not
“eight,” methods, because we want you to make sure you test a mix of
`ReplyTweet` and `TextTweet` objects together. A “test” is a use of
`checkExpect` that checks the results of the method call against an expected
value.

Make sure to create at least the following example objects to use in your tests:

- A thread of at least 3 `Tweets` that is all by one author
- A thread of at least 4 `Tweets` with at least three different authors
- A thread that is a single TextTweet

You can make up data for these (finding specific, real-world instances on
Twitter for these is interesting, but not necessary, to test out this program).

## Numbers

This code will go in the file `ExamplesNumber.java`, any tests in a class called
`ExamplesNumber` that you add to that file.

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

Your task is to create two classes that implement the interface above. One
should be called `WholeNumber` and represent whole integers (including
negative integers). The other should be called `Fraction` and represent mixed
numbers (including negative mixed numbers).

`WholeNumber` should have:
- A field `int n` and a constructor that takes a single `int`
- An implementation of all the methods above.
  - `numerator` should return the value of `n`
  - `denominator` should return `1`
  - `add` should return a new `Number` that represents adding this whole number to the one provided as an argument. Note that the argument could be either a `Fraction` or a `WholeNumber`
  - `multiply` should return a new `Number` that represents multiplying this whole number to the one provided as an argument. Note that the argument could be either a `Fraction` or a `WholeNumber`
  - `toText` should return the value of `n` as a `String`, so if `n` is `500`, it should return `"500"`
  - `toDouble` should return the value of `n` as a `double`

`Fraction` should have:
- A field `int n` representing the numerator
- A field `int d` representing the denominator
- An implementation of all the methods above:
  - `numerator` should return the value of `n`
  - `denominator` should return the value of `d`
  - `add` should return a new `Number` that represents adding this fraction to the one provided as an argument. Note that the argument could be either a `Fraction` or a `WholeNumber`
  - `multiply` should return a new `Number` that represents multiplying this fraction by the one provided as an argument. Note that the argument could be either a `Fraction` or a `WholeNumber`
  - `toText` should return a `String` in the format `"n/d"` where `n` and `d` are the corresponding fields. So if `n` and `d` were `1` and `2`, this should be `"1/2"`
  - `toDouble` should return the value of `n/d` as a `double`. So if `n` is 1 and `d` is 2, this should return `0.5`

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



### Exploration

At the end of the `ExamplesNumber` class in a place marked clearly with a
comment that says `// Exploration`, write code to perform four calculations:

1. The result of `0.1 + 0.2 + 0.3` using built-in `double` arithmetic in Java
2. The result of `0.1 + (0.2 + 0.3)` using built-in `double` arithmetic in Java
3. The result of (1) using your exact fractions, showing the result via `toText()`
4. The result of (2) using your exact fractions, showing the result via `toText()`



## Submission

Then you will submit _all_ of your files to the `pa4` assignment on Gradescope:

- `ExamplesNumber.java`
- `number-transcript.txt`
- `ExamplesTweets.java`
- `tweet-transcript.txt` 

We will automatically grade the correctness of the methods and classes you
write. Tests and exploration sections will be graded manually.  In addition, we
may give you feedback on any part of the code, including automatically graded
parts, that we want you to respond to after grading.

## Extra Challenges (not for credit)

**Challenge** (not required for credit): Many fractions, like $$2/4$$ or
$$27/6$$, are not in their simplest form. Make it so that the constructor for
`Fraction` always creates a fraction object with numerator and denominator in
their most reduced form.

**Challenge** (not required for credit): Create a `ReplyTweet` that is a reply
to itself. Do you think this is possible on Twitter?

**Challenge** (not required for credit): Add a method `Tweet mostPopularInThread()`
for `Tweet` that returns the `Tweet` in the thread with the most likes.