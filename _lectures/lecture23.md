---
layout: with-sidebar
index: 23
name: More Generics
released-on: "2021-11-15"
videos:
    - title: "Generic Definitions (Pair)"
      url: https://drive.google.com/file/d/1kvdNWRXNwe0oldTiPZa6IvUL56XPUo0X
    - title: "Wrapper Classes (Integer/Double/Boolean)"
      url: https://drive.google.com/file/d/1fxNkBh_BBr9uLfRtpU8X2B2FT9dq9Lne
worksheets:
    - title: 9AM & 10AM Discussion
      url: https://drive.google.com/file/d/1Q74iCMfaf2wIyzm7V2Zk8KiwWeV7pmB-
    - title: 4PM Lecture
      url: https://drive.google.com/file/d/12O64iONNM3c36EIVHXAPvl5Yv64syxKQ
---
## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation: [https://docs.google.com/forms/d/e/1FAIpQLScyuNDjWGHOdA9nbYRcdYC3KnvaZNQp2vPrWygFkkVsdhjpRg/viewform](https://docs.google.com/forms/d/e/1FAIpQLScyuNDjWGHOdA9nbYRcdYC3KnvaZNQp2vPrWygFkkVsdhjpRg/viewform)

## Pre-class Tasks

No new reading.

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout
<iframe src="https://drive.google.com/file/d/1br0-2GkZQU-P80gE-pRXx5hItMQt9Nvj/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
