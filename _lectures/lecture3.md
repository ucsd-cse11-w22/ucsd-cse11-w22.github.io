---
layout: with-sidebar
index: 3
name: Methods
released-on: "2021-09-29"
videos:


worksheets:

---

## Problem Session 3 – Vocabulary and Methods

_{{ page.released-on }}_

Readings (to be completed by 9am on September 29, **before** problem session).
- [Stepik 3.1-3.4](https://stepik.org/lesson/559662/step/1?unit=553722){:target="_blank"}

Videos (to watch **before** your problem session on September 29):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout (used during the session), [direct link](https://drive.google.com/file/d/15g4Qipsc8mronHQUY539JEpLQRC5YlXC/preview)

<iframe src="https://drive.google.com/file/d/15g4Qipsc8mronHQUY539JEpLQRC5YlXC/preview" width="640" height="800" allow="autoplay"></iframe>
<iframe src="https://drive.google.com/file/d/1c2Jf_Mtvo2onnhF3TEpLZeYyzeH1DxoP/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
