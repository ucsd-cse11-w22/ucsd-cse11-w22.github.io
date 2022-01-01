---
layout: with-sidebar
index: 3
name: Methods
released-on: "2022-01-07"
videos:
  - title: Diagramming and Vocabulary Review
    url: https://drive.google.com/file/d/1lxNyu3kfqZ4wREkxrX8h7a2p_LpB1okR
  - title: Values and Evaluation
    url: https://drive.google.com/file/d/1Ts-T_hYkeFBgWTSQUieGFTlVYPz5M1sv
  - title: Talking About Expressions
    url: https://drive.google.com/file/d/1VUn3Z7vfMwIBWwbFocYLyLmj76Aya7vQ
  - title: Method Definitions
    url: https://drive.google.com/file/d/1g_gHQ3Bm8s4dPHvIIkrh9e7Bwl8ZBehw
  - title: Method Diagramming and Vocabulary
    url: https://drive.google.com/file/d/1m_72isftSttgHZ9Rj9PR1I4hPbzzAFyH

worksheets:

---

## Problem Session 3 – Vocabulary and Methods

_{{ page.released-on }}_

Readings (to be completed by 9am on January 7, **before** problem session).
- [Stepik 3.1-3.4](https://stepik.org/lesson/559662/step/1?unit=553722){:target="_blank"}

Videos (to watch **before** your problem session on January 7):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout (used during the session), [direct link](https://drive.google.com/file/d/1c2Jf_Mtvo2onnhF3TEpLZeYyzeH1DxoP/preview){:target="_blank"}

<iframe src="https://drive.google.com/file/d/1c2Jf_Mtvo2onnhF3TEpLZeYyzeH1DxoP/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
