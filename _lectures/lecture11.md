---
layout: with-sidebar
index: 11
name: Interfaces and Recursion
released-on: "2021-10-18"
videos:
  - title: Interfaces (watch 30:00 to the end)
    url: https://drive.google.com/file/d/1FsiNPr6N5yiFymHtwCdDHYHt03mWNw_Q
worksheets:
  - title: 9AM Discussion
    url: https://drive.google.com/file/d/10nnVxSdzYYXqk-y-1mflInKadrCJWitw
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1PyqhcdK78Wo_viHVG6oDZHxzNW67WKaY
  - title: 10AM Discussion
    url: https://drive.google.com/file/d/1TIwzDz8iMuuQXPxwWTav4FP9I-PIdJqZ
  - title: 11AM Discussion
    url: https://drive.google.com/file/d/13Dfu_2T7qiF4GC-dg4sRwagqDuqdX7X6
  - title: 2PM Lecture
    url: https://drive.google.com/file/d/1Oh2LduLAtM-Eax4aXfCLY1gWDqD2GcCV
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1LPQvEiS-D9JFNYKMeHOJK0VuUsL5CDb8
  - title: 6PM Discussion
    url: https://drive.google.com/file/d/1cEzkq5J9qaIVxVXT7AWteNTUVS3QnzGH
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://tinyurl.com/cse11-10-18](https://tinyurl.com/cse11-10-18)

## Pre-Reading and Videos

Stepik reading:
- [Stepik 8.4-8.5](https://stepik.org/lesson/574433/step/1?unit=569019)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

(Yes, same as Friday 🙂)

<iframe src="https://drive.google.com/file/d/1Ov-vdxB-4jBja1_D7A8J2ytxeArRGb6o/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}

