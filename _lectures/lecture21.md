---
layout: with-sidebar
index: 21
name: Debugging
released-on: "2022-2-23"
videos:
worksheets:
  - title: Lecture
    url: https://drive.google.com/file/d/1CCKc2JcHGm7nIvvdlLInqYVDvahPBUUh
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class

No new videos – go back and study lecture 20's example, because we will use it
heavily for a debugging example in class.

## Handout

Code from class:

<script src="https://emgithub.com/embed.js?target=https%3A%2F%2Fgithub.com%2Fucsd-cse11-f21%2Fucsd-cse11-f21.github.io%2Fblob%2Fmain%2F_lectures%2Flecture21%2FRegionMain.java&style=github&showBorder=on&showLineNumbers=on&showFileMeta=on&showCopy=on"></script>

Full example with file contents: [https://github.com/ucsd-cse11-w22/ucsd-cse11-w22.github.io/tree/main/_lectures/lecture21](https://github.com/ucsd-cse11-w22/ucsd-cse11-w22.github.io/tree/main/_lectures/lecture21)

<iframe src="https://drive.google.com/file/d/1vxoukWPH4FTkbn2jOWl_FoDcwSDPRCr5/preview" width="640" height="480" allow="autoplay"></iframe>

## Recording

[Lecture 21 - Recording](https://podcast.ucsd.edu/watch/wi22/cse11_a00/21){:target="_blank"}

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}