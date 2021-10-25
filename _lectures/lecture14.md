---
layout: with-sidebar
index: 14
name: Variables and Loops
released-on: "2021-10-25"
videos:
  - title: Variable Update
    url: https://drive.google.com/file/d/1BXvDBZyKMf-L3ET3cBFcmB-V7b4Et7yf
  - title: Variable Update Examples
    url: https://drive.google.com/file/d/1Dh3eJqLtE3_kCP-28fMayK07UWgy-7Xp
  - title: Loops
    url: https://drive.google.com/file/d/1BwyC-9QP85-SX3VlSPkbNfWxjrmTd4dT
  - title: Loops Examples
    url: https://drive.google.com/file/d/1BwyC-9QP85-SX3VlSPkbNfWxjrmTd4dT
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

## Pre-Reading and Videos

Stepik reading:
- [Stepik 10](https://stepik.org/lesson/579629/step/1?unit=574279)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/16kwLwctsZ5QdZTXyRqa_dzc22KviuK_f/preview" width="640" height="480" allow="autoplay"></iframe>