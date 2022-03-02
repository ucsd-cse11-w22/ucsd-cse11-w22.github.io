---
layout: with-sidebar
index: 23
name: More Generics
released-on: "2022-2-28"
videos:
    - title: "Generic Definitions (Pair)"
      url: https://drive.google.com/file/d/1kvdNWRXNwe0oldTiPZa6IvUL56XPUo0X
    - title: "Wrapper Classes (Integer/Double/Boolean)"
      url: https://drive.google.com/file/d/1fxNkBh_BBr9uLfRtpU8X2B2FT9dq9Lne
worksheets:
  - title: Lecture
    url: https://drive.google.com/file/d/1H75c-seRiSAqZwcSAY1sm86MFxcWPTHI
---
## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

Complete this [second survey on Impact of Diverse TAs in Computing](https://forms.gle/ww13qAyu1xZBmDFR8){:target="_blank"} by Friday, March 4th at 10pm.
- Surveys will be graded in the same category as Stepik exercises and are required.

No new reading.

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1w6ZlF5DxuQxfVwqj6SMU75zIGr_T0vCw/preview" width="640" height="480" allow="autoplay"></iframe>

## Recording

[Lecture 23 - Recording](https://podcast.ucsd.edu/watch/wi22/cse11_a00/23){:target="_blank"}

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}