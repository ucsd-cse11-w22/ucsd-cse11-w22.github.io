---
layout: with-sidebar
index: 2
name: Classes and Fields
released-on: "2022-01-05"
videos:


worksheets:

---
## Problem Session 2 – Classes and Fields

_{{ page.released-on }}_

Session plan:
- 2-3 min: Welcome, logistics questions
- 20 min: First page of handout + discussion + demo
- 5 min: (hydration) break
- 20 min: Second page of handout + discussion + demo

Readings (to be completed by 9am on September 27, **before** problem session). You will
need to make an account on Stepik to have your work saved.
- [Stepik 1.1-1.3](https://stepik.org/lesson/559661/step/1?unit=553721){:target="_blank"}
- [Stepik 2.1-2.3](https://stepik.org/lesson/571216/step/1?unit=565754){:target="_blank"}

Videos (to watch **before** your problem session on September 27):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout (used during the session), [direct link](https://drive.google.com/file/d/1sPG_aHG1VfSXR8utVomzmptWbsn8c7gB/preview)

<iframe src="https://drive.google.com/file/d/1sPG_aHG1VfSXR8utVomzmptWbsn8c7gB/preview" width="640" height="800" allow="autoplay"></iframe>

<iframe src="https://drive.google.com/file/d/1c24cFNcp6_uGf5bbRRSPkaY_DKmEs6zh/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
