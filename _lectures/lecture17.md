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
worksheets:
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1fMgQPrwCpVi6mw0HjHF9R9QZ-AeJIEg3
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLScKYdHk6GqKPNpYzoSVN9izC8W0MRK5JWiPAYAWfoN9CHJYKA/viewform](https://docs.google.com/forms/d/e/1FAIpQLScKYdHk6GqKPNpYzoSVN9izC8W0MRK5JWiPAYAWfoN9CHJYKA/viewform)

## Pre-class Tasks

Stepik 11.1 [https://stepik.org/lesson/609849/step/1?unit=605131](https://stepik.org/lesson/609849/step/1?unit=605131)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

Same as Friday (the `main` part)

<iframe src="https://drive.google.com/file/d/13c0nuXCaJgXYGfhdiPNqbf2Iq1vkRR8q/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
