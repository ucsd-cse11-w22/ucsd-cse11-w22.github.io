---
layout: with-sidebar
index: 23
name: More Generics
released-on: "2021-11-15"
videos:
    - title: "Generic Definitions (Pair)"
      url: https://drive.google.com/file/d/1kvdNWRXNwe0oldTiPZa6IvUL56XPUo0X
    - title: "Wrapper Classes (Integer/Double/Boolean)"
      url: https://drive.google.com/file/d/1fxNkBh_BBr9uLfRtpU8X2B2FT9dq9Lne
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-class Tasks

No new reading.

Videos:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}
<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}