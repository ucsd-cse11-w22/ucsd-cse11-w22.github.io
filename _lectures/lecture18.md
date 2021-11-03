---
layout: with-sidebar
index: 18
name: More Loops Practice
released-on: "2021-11-03"
videos:
  - title: More Array Construction
    url: https://drive.google.com/file/d/11YimqsLqytwGygYh6YVmCSI7lo1iYHo_
  - title: null and Array Construction
    url: https://drive.google.com/file/d/1rptvmC3Kz2N5SLO8pMgCIYHfJwDRWf6O
  - title: Arrays, loops, and memory
    url: https://drive.google.com/file/d/1cb9Vc0xpG1PfjrDa11mGTVobC37YvuLJ
  - title: Range
    url: https://drive.google.com/file/d/1C_rnkqz2YHE6BsBcd2NUnWIYC1Fvts5Z
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

Stepik 11.1 [https://stepik.org/lesson/609849/step/1?unit=605131](https://stepik.org/lesson/609849/step/1?unit=605131)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}
