---
layout: with-sidebar
index: 8
name: Stack and Heap
released-on: "2021-10-11"
videos:
  - title: Stack and Heap 1
    url: https://drive.google.com/file/d/1leIUYQgyTtZFi9LTIbvH4jdLV7SHcf3W
  - title: Stack and Heap 2
    url: https://drive.google.com/file/d/1tstqc1zGMvfewQE6_morbNAk16nNqnXv
  - title: Stack and Heap 3
    url: https://drive.google.com/file/d/1aV5MbKOibUcLAfMvfKVlPPNQ6Tt_n9Z4
  - title: More on Constructors 1
    url: https://drive.google.com/file/d/1NVFctDr7A-EP9x00UsYgwQZh_8qBUPCv
  - title: More on Constructors 2
    url: https://drive.google.com/file/d/1REq_xRZs37g6-MhL8x1Di4G0VvXnBa8y
  
worksheets:
  - title: 9AM Discussion
    url: https://drive.google.com/file/d/1QVkAQ7igcOVKOiux7CqGGYOCy2UNuHb6
  - title: 10AM Discussion
    url: https://drive.google.com/file/d/190Hv87JuXmtD-1ppdndCs1a6lk0iSLqT
  - title: 11AM Discussion
    url: https://drive.google.com/file/d/17T5Xe59Qb0TMvPJuoncYcMI3xnR1UZSi
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Stepik reading (to complete before class on October 11):
- [Stepik 6](https://stepik.org/lesson/573911/step/1?unit=568501)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

<iframe src="https://drive.google.com/file/d/1RZ1KEs0bTZUxAIg9s4kDDnf7blr1vNBL/preview" width="640" height="480" allow="autoplay"></iframe>

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
[{{ worksheet.title }}]({{ worksheet.url }}){:target="_blank"}

<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
