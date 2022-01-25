---
layout: with-sidebar
index: 8
name: Stack and Heap
released-on: "2022-1-21"
videos:
  - title: Stack and Heap 1
    url: https://drive.google.com/file/d/1leIUYQgyTtZFi9LTIbvH4jdLV7SHcf3W
  - title: Stack and Heap 2
    url: https://drive.google.com/file/d/1tstqc1zGMvfewQE6_morbNAk16nNqnXv
  - title: Stack and Heap 3
    url: https://drive.google.com/file/d/1aV5MbKOibUcLAfMvfKVlPPNQ6Tt_n9Z4
  - title: More on Constructors 1
    url: https://drive.google.com/file/d/1NVFctDr7A-EP9x00UsYgwQZh_8qBUPCv
  - title: More on Constructors 2
    url: https://drive.google.com/file/d/1REq_xRZs37g6-MhL8x1Di4G0VvXnBa8y
  
worksheets:
  - title: Lecture
    url: https://drive.google.com/file/d/1o9omUgYH97dw18KL7KThmiary7XHb3b9
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Stepik reading (to complete before class):
- [Stepik 6](https://stepik.org/lesson/573911/step/1?unit=568501)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout:

<iframe src="https://drive.google.com/file/d/1lrRVn_B-A8tZmveqmcqBGn6YMfQcl3qQ/preview" width="640" height="480" allow="autoplay"></iframe>

## Zoom Recording

[Lecture 8 - Recording](https://drive.google.com/file/d/1r1TORE_EWIJEjblTUQ-_Dx972cwBCb8L){:target="_blank"}

<iframe src="https://drive.google.com/file/d/1r1TORE_EWIJEjblTUQ-_Dx972cwBCb8L/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}