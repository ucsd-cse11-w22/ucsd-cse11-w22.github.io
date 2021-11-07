---
layout: with-sidebar
index: 19
name: Connect 4!
released-on: "2021-11-05"
videos:

worksheets:
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1Oxqk1oCkrqHTsxHCqPD4usmXgMf5syoS
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation: [https://docs.google.com/forms/d/e/1FAIpQLSfgrDw8VznDpRJUnfQ8zDXX4KxfZRxQe4SStjNYTi4dZ8e7XQ/viewform](https://docs.google.com/forms/d/e/1FAIpQLSfgrDw8VznDpRJUnfQ8zDXX4KxfZRxQe4SStjNYTi4dZ8e7XQ/viewform)

No new content for pre-class; we'll work through the Connect 4 example more
today.

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}