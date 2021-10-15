---
layout: with-sidebar
index: 9
name: Nested Data
released-on: "2021-10-13"
worksheets:
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1Kvda2zvi6eP9rRIo-MCg3lVYWlFpnZZr
  - title: 4PM Discussion
    url: https://drive.google.com/file/d/19ttAEMZscqqfABbz9L-hW4eeqkTOwUdP
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Stepik reading (to complete before class on October 13):
- [Stepik 7](https://stepik.org/lesson/584041/step/10?unit=578810)

No pre-watch videos for October 13 (take the time to review some others!).

If you want to watch ahead, the next topic will be from here, but we won't
discuss interfaces until Friday:

<iframe src="https://drive.google.com/file/d/1FsiNPr6N5yiFymHtwCdDHYHt03mWNw_Q/preview" width="640" height="480" allow="autoplay"></iframe>

Handout:

<iframe src="https://drive.google.com/file/d/1l28Y4DsU79T3pMWXMcrtHUvXp6LZRVwe/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
