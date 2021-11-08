---
layout: with-sidebar
index: 20
name: File I/O, Exceptions
released-on: "2021-11-08"
videos:
  - title: Exceptions in Max
    url: https://drive.google.com/file/d/1TSkL7d1F2ooWNaOWEWCRtRnJ9nLVKyC6
  - title: File I/O Exception
    url: https://drive.google.com/file/d/1ZH88H8jrPK_W1CFr_U4WnvqJiRAoM6uT
  - title: File Processing Example
    url: https://drive.google.com/file/d/1obg1ktjlwbZJF3Sc4lfPxeKtmweqdSvF
  - title: Constructor Exceptions
    url: https://drive.google.com/file/d/18cK8aOJ5u2shclhOltpPwUoELer3vHgI
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLSdJKX2SclyoQzic1MAGWar-H0xUZDK2Uvr5lrQ6E9KyAkXWhg/viewform](https://docs.google.com/forms/d/e/1FAIpQLSdJKX2SclyoQzic1MAGWar-H0xUZDK2Uvr5lrQ6E9KyAkXWhg/viewform)

**For this lecture, you can fill out this form with the correct answers and the
section code SKIP and get credit for attending, even if you don't come to
lecture. This is because Joe's 2pm section is canceled, and also because we want
to try it out.**

## Pre-class Tasks

No Stepik chapter.

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}
