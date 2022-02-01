---
layout: with-sidebar
index: 21
name: Debugging
released-on: "2022-2-21"
videos:
worksheets:
   
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class

No new videos – go back and study lecture 20's example, because we will use it
heavily for a debugging example in class.

## Handout

<iframe src="https://drive.google.com/file/d/1vxoukWPH4FTkbn2jOWl_FoDcwSDPRCr5/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}