---
layout: with-sidebar
index: 9
name: Nested Data
released-on: "2022-1-24"
worksheets:
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Stepik reading (to complete before class on January 24):
- [Stepik 7](https://stepik.org/lesson/584041/step/10?unit=578810)

No pre-watch videos for January 24 (take the time to review some others!).

If you want to watch ahead, the next topic will be from here, but we won't
discuss interfaces until the next class:

<iframe src="https://drive.google.com/file/d/1FsiNPr6N5yiFymHtwCdDHYHt03mWNw_Q/preview" width="640" height="480" allow="autoplay"></iframe>

Handout:

<iframe src="https://drive.google.com/file/d/1n7L9htMXqHneP0HFahuxucobzNIgR-kd/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}