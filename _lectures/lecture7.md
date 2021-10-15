---
layout: with-sidebar
index: 7
name: Memory and Tracing
released-on: "2021-10-6"
videos:
  - title: Creating Objects and Classes (22:00 - 38:00)
    url: https://drive.google.com/file/d/1Kn6rVGCTQf2OkZ5-maVpA-MXFd0LHxZ2
  - title: Line Class
    url: https://drive.google.com/file/d/1bFzLGW75Y68hAEVe3ERDvdQf7jHJ0Kin
  - title: Calc-Y
    url: https://drive.google.com/file/d/1WSf8sB8OZOz8Y4O8x7l4qKLP4McYIqo7

worksheets:
  - title: 2PM Lecture
    url: https://drive.google.com/file/d/1DESznSU2GNfEIAy-FZ-9jtbERRk67Zsl
  - title: 3PM and 4PM Discussion
    url: https://drive.google.com/file/d/1fr0KryJuYfRiNLfbcwb_vSZb-meLq_Qo
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1J4RBkE5G-kj1N9m4LRNQxWmdYE-dkzKE

---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation link: [https://tinyurl.com/cse11-10-08](https://tinyurl.com/cse11-10-08)

No Stepik readings for Friday.

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

<iframe src="https://drive.google.com/file/d/1EfdpBsNc3Yq_CvgAVfQLPSndKXolXTBD/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
