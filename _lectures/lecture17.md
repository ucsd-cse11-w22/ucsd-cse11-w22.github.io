---
layout: with-sidebar
index: 17
name: Nested Loops
released-on: "2021-11-01"
videos:
  - title: Nested Loops
    url: https://drive.google.com/file/d/1tV46H_TBDBQkS04_kfQHGJbhRA70n8Gs
  - title: Region Loop
    url: https://drive.google.com/file/d/157v75MQE_k0h-z9S3_tCVvaHIP-nvWFs
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

Stepik 11.1 [https://stepik.org/lesson/609849/step/1?unit=605131](https://stepik.org/lesson/609849/step/1?unit=605131)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}