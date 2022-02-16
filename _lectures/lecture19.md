---
layout: with-sidebar
index: 19
name: Connect 4!
released-on: "2022-2-16"
videos:
worksheets:
  - title: Lecture
    url: https://drive.google.com/file/d/16VHNDB1728SUurX-_rZcI8Qzd9l8G7Ne
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

- Complete this [survey on  Thinking Aloud/Documentation](https://forms.gle/M6xyT1m8pJv8HRoe7){:target="_blank"}

No new content for pre-class; we'll work through the Connect 4 example more
today.

## Handout

<iframe src="https://drive.google.com/file/d/1vyAaXbHgsHagaOgrKHeFKOVarL3FMM-M/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}