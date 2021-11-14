---
layout: with-sidebar
index: 24
name: (Array)Lists
released-on: "2021-11-17"
videos:
    - title: "ArrayList"
      url: https://drive.google.com/file/d/1pdWAmNbX__aKAWBlZ6xyRujHeSJNPDgB
    - title: "LongStrings"
      url: https://drive.google.com/file/d/1_l1tZYs27wzgopZjnOv9txXGJOaug4JH
    - title: "ArrayLists – Overloading"
      url: https://drive.google.com/file/d/1hOvnt1rBitXqE91kS7xSrTrSZVNaX9dZ
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

Reading coming soon!

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}