---
layout: with-sidebar
index: 13
name: public static void main
released-on: "2021-10-22"
videos:
  - title: main
    url: https://drive.google.com/file/d/18RKvuJa1oYTdiloR7zH7AGBI9ucYCBQp
  - title: args
    url: https://drive.google.com/file/d/14Vtg9aJoa_E_34yIR1CLKDXn1KHIC-0e
worksheets:
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1mOHZCxgEUSIec-4ZHLHQ2YlDZAoWKsR5
  - title: 3PM & 4PM Discussion
    url: https://drive.google.com/file/d/1AWz6bi75xrZjg3914immDVTwZ378W89O
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1MfMmTf4AV82goJdoYyspTT-dBxg6jbsN
  - title: 1PM Discussion
    url: https://drive.google.com/file/d/1QPRCguZhavN3WfZWIvgg6j4ST2yIVZ8I
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLSfOhTLRmu8xojQgLosaphX9ZNpNIbuhCueRrK1kF1SmIYu1Zg/viewform](https://docs.google.com/forms/d/e/1FAIpQLSfOhTLRmu8xojQgLosaphX9ZNpNIbuhCueRrK1kF1SmIYu1Zg/viewform)

## Pre-Reading and Videos

Stepik reading (same as previous reading, so no new reading):
- [Stepik 9](https://stepik.org/lesson/579631/step/1?unit=574281)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1BxZHf1UgGQ-1gSg0_rVUpI2REvK5jSWB/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
