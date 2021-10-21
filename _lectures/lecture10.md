---
layout: with-sidebar
index: 10
name: Interfaces
released-on: "2021-10-15"
videos:
  - title: Interfaces (watch through 30:00)
    url: https://drive.google.com/file/d/1FsiNPr6N5yiFymHtwCdDHYHt03mWNw_Q
worksheets:
  - title: 2PM Lecture
    url: https://drive.google.com/file/d/19Iex0aeEROYU9KwaXFX15p1_yHrZcvE0
  - title: 3PM & 4PM Discussions
    url: https://drive.google.com/file/d/1oQ8it6LNGz6NRtypigtDDl3ebUNrv_3a
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1KWiLyDSR33nWGIGbUYs67sMnF3Y2TZgw
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form for Monday, October 18:
[https://tinyurl.com/cse11-10-18](https://tinyurl.com/cse11-10-18)

Participation form: [https://tinyurl.com/cse11-10-15](https://tinyurl.com/cse11-10-15)

## Pre-Reading and Videos

Stepik reading:
- [Stepik 8.1-8.3](https://stepik.org/lesson/574307/step/1?unit=568892)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1Ov-vdxB-4jBja1_D7A8J2ytxeArRGb6o/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
