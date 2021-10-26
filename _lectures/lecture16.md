---
layout: with-sidebar
index: 16
name: Loops and Objects
released-on: "2021-10-29"
videos:
  - title: Factorial, Twice
    url: https://drive.google.com/file/d/1knoFKHlFXGgDHrkJzYfdxtX6mJLcivPY
  - title: Factorial, Compared
    url: https://drive.google.com/file/d/16opUdYNITHGgW9X6F_KGoBmALhCWwZZx
  - title: Arrays of References
    url: https://drive.google.com/file/d/12ZjQNBxnWpthOJt1tZ8YMonLzXQ7XzCT
  - title: Methods on Arrays of References
    url: https://drive.google.com/file/d/1TdAj2ypxk43s1LWmJ2HEtBb_vGTokFuR
  - title: More Methods on Arrays of References
    url: https://drive.google.com/file/d/1wx4xHmkzH8G6L2NoMZU6Gff8gtqA9xGY
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

No new Stepik reading.

Mid-quarter feedback form (worth 1 extra attendance credit!): [https://docs.google.com/forms/d/e/1FAIpQLSdjiKD3MgsTwiOM365y6H7tG6XWCwqYwGmouP6xn-H807cIBg/viewform](https://docs.google.com/forms/d/e/1FAIpQLSdjiKD3MgsTwiOM365y6H7tG6XWCwqYwGmouP6xn-H807cIBg/viewform)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1zG19vwtCVmdTLJNzRc3YzwFh6-LPfPgg/preview" width="640" height="480" allow="autoplay"></iframe>

