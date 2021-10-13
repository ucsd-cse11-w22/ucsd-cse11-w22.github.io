---
layout: with-sidebar
index: 10
name: Interfaces
released-on: "2021-10-13"
videos:
  - title: Interfaces (watch through 30:00)
    url: https://drive.google.com/file/d/1FsiNPr6N5yiFymHtwCdDHYHt03mWNw_Q
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://tinyurl.com/cse11-10-13](https://tinyurl.com/cse11-10-13)

## Pre-Reading and Videos

Stepik reading:
- [Stepik 8.1-8.3](https://stepik.org/lesson/574307/step/1?unit=568892)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}
