---
layout: with-sidebar
index: 27
name: Modifiers, Invariants
released-on: "2021-11-24"
videos:
    - title: "Access Modifiers"
      url: https://drive.google.com/file/d/1j8xtQfJtdHfBDp_4eINFE7xYg2IUEs7g
    - title: "Default Package"
      url: https://drive.google.com/file/d/1jIgflYWbjJdfdRz5Kh0LTLBSP54nnlbM
    - title: "Protected"
      url: https://drive.google.com/file/d/1-2lleGWYeeXkiTaRmWbTtOeM3lZ7uHSP
worksheets:
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1e6lsd8WTjURzn5rpKge7FaXEHhiOqgVF
  - title: 2PM Lecture
    url: https://drive.google.com/file/d/1M45Sp9ygwwly78qt9Zl3tZSX8DoAdp0M
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/18YdeG3DmYjgYGP2XtWl_Igl1ZT1UzhGZ
  - title: 4PM Discussion
    url: https://drive.google.com/file/d/1Xw8GKBbkek0Du_3t3oR9cK_LL4xILs6A
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation: [https://docs.google.com/forms/d/e/1FAIpQLSd4uQaq42bIXGxVE7ag9a0kZ_58Gbr_-OQWMP1Ws-dmJWFGjQ/viewform](https://docs.google.com/forms/d/e/1FAIpQLSd4uQaq42bIXGxVE7ag9a0kZ_58Gbr_-OQWMP1Ws-dmJWFGjQ/viewform)

## Pre-class Tasks

[Stepik 13](https://stepik.org/lesson/575460/step/1?unit=570041) (Abstract Classes)

No new readings on modifiers, though there will be reading on this to wrap up this content in
week 10!

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1Q78W5hpxWI6bD7FJW-or9aRa3YmWKgd1/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
