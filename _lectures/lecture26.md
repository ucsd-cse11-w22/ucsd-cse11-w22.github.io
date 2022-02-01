---
layout: with-sidebar
index: 26
name: Equality, Overrides
released-on: "2022-3-7"
videos:
    - title: "Equals Ourselves"
      url: https://drive.google.com/file/d/1yq4xTudhikFAVH9gLRs_8Xe8wcLLmj4V
    - title: "instanceof"
      url: https://drive.google.com/file/d/1sw2rDZ9Qb-tK6KI2nCY_R7w9iypXH_RZ
    - title: "Casting"
      url: https://drive.google.com/file/d/1XFuMKAMREdoFzSBQ7HXwPtklvdwoC0TV
    - title: "toString()"
      url: https://drive.google.com/file/d/1yeM6VHMe6mLeIV_dpjx0yWG6XZ7QjlPo
worksheets:

---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

(It's OK to watch these after class in this particular case, too, the class
introduces many of these topics)

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Code from lecture:

<script src="https://emgithub.com/embed.js?target=https%3A%2F%2Fgithub.com%2Fucsd-cse11-f21%2Fucsd-cse11-f21.github.io%2Fblob%2Fmain%2F_lectures%2Flecture26%2FPair.java&style=github&showBorder=on&showLineNumbers=on&showFileMeta=on&showCopy=on"></script>

Handout: 

<iframe src="https://drive.google.com/file/d/1wKkMb2TyI1brv_Sw31Yg4KNPV910Jdt6/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}
