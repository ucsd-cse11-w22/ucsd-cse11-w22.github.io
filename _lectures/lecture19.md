---
layout: with-sidebar
index: 19
name: Connect 4!
released-on: "2022-2-16"
videos:
worksheets:
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

No new content for pre-class; we'll work through the Connect 4 example more
today.

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}