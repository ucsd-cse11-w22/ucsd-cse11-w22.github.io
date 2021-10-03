---
layout: with-sidebar
index: 1
name: PA2
released-on: "2021-10-6"
---

# CSE 11 Programming Assignment 2

**Due Date: Tuesay, October 12, 10:00PM Pacific Time**

## Learning Goals

- Write and use classes to represent real world data, and relations between them
- Write methods that make decisions

## Collaboration

Different assignments in this course have different collaboration policies. On this assignment, you can collaborate with anyone in the course, including sharing code. In your submission, give credit to all students and course staff who helped you with this assignment by noting their name and how you used their ideas or work. Note that using someone's work without giving credit to them is a violation of academic integrity.

You can download the starter code for this assignment here:

[https://github.com/ucsd-cse11-f21/pa2](https://github.com/ucsd-cse11-f21/pa2)


You will write all your code and comments in `ExampleTweets.java`.

You will submit a single file called `ExampleTweets.java` to Gradescope for the
PA2 assignment. This file will contain all three classes that you write,
including `Tweet`, `User`, and `ExamplesTweets`.

You can come to remote help hours for a pre-grading check-off.

## Problem 1

In this programming assignment, you will be using tweets as data and
representing them using objects (though the choices we make will be similar to
those in many social media posting platforms). You will be making two classes
for implementation and one example class for testing your implementation.
Altogether, you will create 3 classes in one file, and a dozen or more objects.

### `User`

The class `User` represents users, the authors of Tweets.

- **Data**: A `User` should contain the username of the account, the
display name of the account, and the number of followers (there is more
information we could store, but this is enough for some interesting work)
- **Methods**:
  - `String toText()`
    
    Takes no arguments and returns a string which contains the fullname followed
    by the username of the user, with a space between them and an `"@"` before
    the username, for example: `“UC San Diego @UCSanDiego”`

Note: To get information about the user (when creating user
objects) you will have to go to their profile and see how many followers they
have and then instantiate a new object with that value.

### `Tweet`

The class `Tweet` represents a single tweet.

- **Data**: A `Tweet` should contain the text content of the Tweet, a reference
to the `User` who authored the tweet, the count of likes the tweet has, and a
unique id for the Tweet.
- **Methods**:
  - `boolean longerThan(Tweet other)`
  
    Takes a `Tweet`, and returns true if the content of `this` one is
    longer (has more characters) than the content of `other`.
  - `boolean moreLikes(Tweet other)`

    Takes a `Tweet`, and returns true if the number of likes of `this` is more
    than the likes of `other`.

  - `String toText()`

    Returns a String that represents the Tweet object with all the User
    information as text, and also displays the tweet content and likes.
    The returned string should have the `toText` of the user followed by the
    content, followed by the number of likes, as in this example:
    `"Julia Evans @b0rk : when debugging, your attitude matters : 468 Likes"`

  - `String toLink()`

    This method returns a string representing the URL for the Tweet object
    Example output: `"https://twitter.com/username/status/tweetID"`

### `ExampleTweets`

The `ExampleTweets` class is for testing your own implementation.

In order to test your classes and methods, find four real tweets from
twitter.com with the following properties:

- Two of them are from the same user
- The other two are from two different users

You may find these accounts useful and relevant for finding fun Tweets:

- [https://twitter.com/UCSDJacobs](https://twitter.com/UCSDJacobs)
- [https://twitter.com/acmucsd](https://twitter.com/acmucsd)
- [https://twitter.com/cassidoo](https://twitter.com/cassidoo)
- 

(If you can’t go to Twitter for some reason, let us know via Piazza or email and
we’ll help you out – you may be able to complete the assignment with another
social media example).

In your test class `ExampleTweets`, you will construct User objects and Tweet
objects corresponding to these four tweets you found.  In your test file
`ExamplesTweets.java`, you will call each method you write at least twice using
the objects you constructed to build these examples. Since there are 5 methods,
you should have at least 10 method calls total to test your work, and every
method should be called at least twice.  For each tweet you found, write a
comment before the line where you construct it with:

- A link to the Tweet
- An answer to this question: "Were there any parts of the Tweet that you couldn’t
represent with the class design we chose?"
