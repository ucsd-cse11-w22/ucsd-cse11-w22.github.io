---
layout: with-sidebar
index: 2
name: PA2
released-on: "2021-01-12"
---

# CSE 11 Programming Assignment 2

### Due Date: Tuesday, January 18, 10:00PM Pacific Time

## Learning Goals

- Write and use classes to represent real world data, and relations between them
- Write methods that make decisions
- Create a video screencast of your program running

## Collaboration

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, including
sharing code. In your submission, give credit to all students and course staff
who helped you with this assignment by noting their name and how you used their
ideas or work. Note that using someone's work without giving credit to them is a
violation of academic integrity.

You can download the starter code for this assignment here:

[https://github.com/ucsd-cse11-w22/cse11-pa2-starter](https://github.com/ucsd-cse11-w22/cse11-pa2-starter)

You will write all your code and comments in `ExampleTweets.java`.

## Submission Checklist

- [ ] ExampleTweets.java
    - [ ] User class
        - [ ] toText method
    - [ ] Tweet class
        - [ ] longerThan method
        - [ ] moreLikes method
        - [ ] toText method
        - [ ] toLink method
    - [ ] ExampleTweets class
        - [ ] 4 real tweets
            - [ ] 2 from the same user
                - [ ] Link to the tweets (2 total)
                - [ ] Answer to the question: "Were there any parts of the Tweet that you couldn’t represent with the class design we chose?" (2 total)
            - [ ] 1 from different user
                - [ ] Link to the tweet (1 total)
                - Answer to the question: "Were there any parts of the Tweet that you couldn’t represent with the class design we chose?" (1 total)
            - [ ] 1 from different user separate from previous users
                - [ ] Link to the tweet (1 total)
                - Answer to the question: "Were there any parts of the Tweet that you couldn’t represent with the class design we chose?" (1 total)
        - [ ] Testing
            - [ ] 2 tests for User toText method
            - [ ] 2 tests for Tweet longerThan method
            - [ ] 2 tests for Tweet moreLikes method
            - [ ] 2 tests for Tweet toText method
            - [ ] 2 tests for Tweet toLink method
- [ ] Video
    - [ ] Face + ID (part of the video, not just a photo)
    - [ ] Your voice
    - [ ] Runs code in terminal using the `run` command

You will submit two files to the PA2 assignment:

- A single Java file called `ExampleTweets.java` to Gradescope for the PA2
assignment. This file will contain all three classes that you write, including
`Tweet`, `User`, and `ExamplesTweets`.
- Your video [(description at the end)](#practice-screencast) 

## Problem 1

In this programming assignment, you will be using tweets as data and
representing them using objects. The choices we make will be similar to those
in many social media posting platforms. You will be making two classes for
implementation and one example class for testing your implementation.
Altogether, you will create 3 classes in one file, and around a dozen objects.

### `User`

The class `User` represents users, the authors of Tweets.

- **Data**: A `User` should contain the username of the account, the
display name (also called full name) of the account, and the number of followers
(there is more information we could store, but this is enough for some
interesting work)
- **Constructor**: A standard constructor that takes a value for each field and
initializes it
- **Methods**:
  - `String toText()`
    
    Takes no arguments and returns a string which contains the fullname followed
    by the username of the user, with a space between them and an `"@"` before
    the username, for example: `“UC San Diego @UCSanDiego”`

Note: To get information about the user (when creating user
objects) you will have to go to their profile and see how many followers they
have and then instantiate a new object with that value.

![An example user](/user.png)

### `Tweet`

The class `Tweet` represents a single tweet.

- **Data**: A `Tweet` should contain the text content of the Tweet, a reference
to the `User` who authored the tweet, the count of likes the tweet has, and a
unique id for the Tweet represented as a String.
- **Constructor**: A standard constructor that takes a value for each field and
initializes it
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
    Example output: `"https://twitter.com/UCSanDiego/status/1445470129362407433"`

![An example Tweet](/tweet.png)

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
- [https://twitter.com/kprather88](https://twitter.com/kprather88)

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

For checking off your work, you should have:

- 2 classes, each with fields as described above
- 5 total methods (one in `User` and four in `Tweet`)
- 2 examples for each method (10 total examples)
- Four `Tweet` objects with the link and question above answered
- Three `User` objects (to use to construct the Tweets)

A submission checklist can be found [here](#submission-checklist)

## Practice Screencast

For the take-home exams, you'll be recording a screencast that demonstrates
your programs. The last part of this PA has you practice with this.

You will record a short video of no more than 2 minutes (a hard constraint!).
Include the following (these are also what we will check for in grading,
including length):

- Your face and your student ID (or other photo ID) for a few seconds at the
beginning. Don't just use a photo of you and your ID. You don't have to be on camera the whole time, though it's fine if
you are. Just a brief confirmation that it's you creating the video and doing
the work attached to the video.
- A capture of your screen running your program including your example outputs.
Make sure the code of your program AND your terminal output are shown in the
video
- Your voice! 

We've made a short tutorial demonstrating how to make a screencast with Zoom:

[Screencast Tutorial](https://drive.google.com/open?id=1KROMAQuTCk40zwrEFotlYSJJQdcG_GUU)

The associated video that was created is here:

[Example Result](https://drive.google.com/open?id=1MxJN6CQcXqIbOekDYMxjh7mTt1TyRVMl)

You don't have to make your screencast with Zoom, but Zoom is UCSD-licensed
software that you have access to, so we offer the tutorials with that in
mind.

Please do reach out if you run into issues with this, and try something out
early so you know if it will work or not for you – you'll need it for the
exam!

## Grading

There are multiple oppurtunities to get feedback for PA2. By submitting before the deadline, you will receive feedback after it is graded shortly after the dealine. You may also submit to the Late/Resubmit for PA2 up to 3 times after the deadline to earn additional feedback.

For more information about the grading policy, visit the [course syllabus](https://ucsd-cse11-w22.github.io/syllabus.html).


