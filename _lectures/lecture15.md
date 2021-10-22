---
layout: with-sidebar
index: 15
name: Loops and Arrays
released-on: "2021-10-27"
videos:
  - title: Average
    url: https://drive.google.com/file/d/1Ra7H6erHYrM_5CWSNLU2-K3IhDPk3_wq
  - title: Counted Loops
    url: https://drive.google.com/file/d/1aQmFagaqtaWpkoCSGe4PjsLfnUUqDKzV
  - title: Loop Experiments
    url: https://drive.google.com/file/d/1NWlAw9YPLo7EOViN4SGocXNFJY6ZuGnY
  - title: Every Other
    url: https://drive.google.com/file/d/17km0_TziemzWLyyunFDwRUYfntRZZVN6
  - title: Loop Tables
    url: https://drive.google.com/file/d/1PHAkE99a1uC-nBEF7NILHAD2Xq8e1Rvn
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-Reading and Videos

Stepik reading (same as Monday):
- [Stepik 10](https://stepik.org/lesson/579629/step/1?unit=574279)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}
