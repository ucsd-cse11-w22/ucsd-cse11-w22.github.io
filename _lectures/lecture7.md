---
layout: with-sidebar
index: 7
name: Memory and Tracing
released-on: "2022-1-19"
videos:
  - title: Creating Objects and Classes (22:00 - 38:00)
    url: https://drive.google.com/file/d/1Kn6rVGCTQf2OkZ5-maVpA-MXFd0LHxZ2
  - title: Line Class
    url: https://drive.google.com/file/d/1bFzLGW75Y68hAEVe3ERDvdQf7jHJ0Kin
  - title: Calc-Y
    url: https://drive.google.com/file/d/1WSf8sB8OZOz8Y4O8x7l4qKLP4McYIqo7

worksheets:
  - title: Lecture
    url: https://drive.google.com/file/d/1mmYban4u1mbR5q_mBoTUELQNCCBlXuI4
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

No Stepik readings for Wednesday.

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout:

<iframe src="https://drive.google.com/file/d/1logfnUobeyKbuN5wHqP2tpAv1awzbwXr/preview" width="640" height="480" allow="autoplay"></iframe>

## Zoom Recording

[Lecture 7 - Recording](https://drive.google.com/file/d/1nJhXso4oFwNOUx9kOQ05-lGVHWrfZYoL){:target="_blank"}

<iframe src="https://drive.google.com/file/d/1nJhXso4oFwNOUx9kOQ05-lGVHWrfZYoL/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}