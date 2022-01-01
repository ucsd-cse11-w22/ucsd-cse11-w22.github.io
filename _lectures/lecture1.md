---
layout: with-sidebar
index: 1
name: Introduction
released-on: "2022-01-03"
---
## Problem Session 1 – Introduction

_{{ page.released-on }}_


Welcome to the page for the first problem session! Each problem session will
come with a page like this that summarizes the videos you should watch and
readings you should complete **beforehand**, along with any handouts for the day
and code examples, notes, and recordings from the problem solving session.

Session plan:
- 2-3 min: Introduce instructors/staff
- 2-3 min: Say hi to the people around you
- 15 min: Handout + discussion
- 20 min: syllabus
    - Problem Solving Sessions, videos
    - Stepik
    - Programming
    - Exams
    - Getting Help
    - Schedule
    - Lecture 1 and 2 pages
- 5 min: q/a

Before the first lecture, there are no videos to watch. You should familiarize
yourself with the [syllabus](../syllabus.html).

The handout for the first day has a few questions for us to use as icebreakers
and to start talking about programming. You can access [the PDF
directly](https://drive.google.com/file/d/19JrgyrjWEqPoFX7tgIdk02Y6kngAH6D7/preview)
on Google Drive to download it.

<iframe src="https://drive.google.com/file/d/19JrgyrjWEqPoFX7tgIdk02Y6kngAH6D7/preview" width="640" height="480" allow="autoplay"></iframe>

<iframe src="https://drive.google.com/file/d/1bysF6y1E9cZ4Q8xlUpTl3j50TvJ3Xajy/view" width="640" height="480" allow="autoplay"></iframe>

## From Class

{% for video in page.podcasts %}
[{{ video.title }}]({{ video.direct_url }}){:target="_blank"}
{% endfor %}


## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
