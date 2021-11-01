---
layout: with-sidebar
index: 16
name: Loops and Objects
released-on: "2021-10-29"
videos:
  - title: Factorial, Twice
    url: https://drive.google.com/file/d/1knoFKHlFXGgDHrkJzYfdxtX6mJLcivPY
  - title: Factorial, Compared
    url: https://drive.google.com/file/d/16opUdYNITHGgW9X6F_KGoBmALhCWwZZx
  - title: Arrays of References
    url: https://drive.google.com/file/d/12ZjQNBxnWpthOJt1tZ8YMonLzXQ7XzCT
  - title: Methods on Arrays of References
    url: https://drive.google.com/file/d/1TdAj2ypxk43s1LWmJ2HEtBb_vGTokFuR
  - title: More Methods on Arrays of References
    url: https://drive.google.com/file/d/1wx4xHmkzH8G6L2NoMZU6Gff8gtqA9xGY
worksheets:
  - title: 3PM Discussion
    url: https://drive.google.com/file/d/1WPXYjuk2-PP3iDAL99qVj4tyfOgTEHfq
  - title: 4PM Discussion
    url: https://drive.google.com/file/d/10QAYXVuDc28_y8dcodXeq2GCQe6n_ZV2
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1cX1jStunypK7ezI7UlUe_5E1EfZeC5uV
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form for Monday, Nov 1: [https://docs.google.com/forms/d/e/1FAIpQLScKYdHk6GqKPNpYzoSVN9izC8W0MRK5JWiPAYAWfoN9CHJYKA/viewform](https://docs.google.com/forms/d/e/1FAIpQLScKYdHk6GqKPNpYzoSVN9izC8W0MRK5JWiPAYAWfoN9CHJYKA/viewform)

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLSeu0F8qWJteQk4kGqX71CHYmJbDcsumxo--iCOhvYXDQMkIxw/viewform](https://docs.google.com/forms/d/e/1FAIpQLSeu0F8qWJteQk4kGqX71CHYmJbDcsumxo--iCOhvYXDQMkIxw/viewform)
## Pre-class Tasks

No new Stepik reading.

Mid-quarter feedback form (worth 1 extra attendance credit!): [https://docs.google.com/forms/d/e/1FAIpQLSdjiKD3MgsTwiOM365y6H7tG6XWCwqYwGmouP6xn-H807cIBg/viewform](https://docs.google.com/forms/d/e/1FAIpQLSdjiKD3MgsTwiOM365y6H7tG6XWCwqYwGmouP6xn-H807cIBg/viewform)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}


<iframe src="https://drive.google.com/file/d/13c0nuXCaJgXYGfhdiPNqbf2Iq1vkRR8q/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}