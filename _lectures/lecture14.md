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
    url: https://drive.google.com/file/d/1At2ogDjHBMuE9Ci-tHwcdSqY8xx5I3r1
  - title: Loops Examples
    url: https://drive.google.com/file/d/1BwyC-9QP85-SX3VlSPkbNfWxjrmTd4dT
worksheets:
  - title: 9AM Discussion
    url: https://drive.google.com/file/d/15WgZFoDRjl7-6N92p9BZOeyuscR_bJdl
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1yQe60va-UfpArAh0UUcXooWe68hHOozQ
  - title: 10AM Discussion
    url: https://drive.google.com/file/d/1toPmjbAjoRu3vvighgFOI2et7BTl202r
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1UHF7c1iwRminEnE45_VoJyDCGQvu0rWX
---

## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLScnvVZPXfhBz9fXtLKFpWz_K-TM8ACVMB5FOnNrpmAi_7ZI_Q/viewform](https://docs.google.com/forms/d/e/1FAIpQLScnvVZPXfhBz9fXtLKFpWz_K-TM8ACVMB5FOnNrpmAi_7ZI_Q/viewform)

## Pre-Reading and Videos

Stepik reading:
- [Stepik 10](https://stepik.org/lesson/579629/step/1?unit=574279)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/16kwLwctsZ5QdZTXyRqa_dzc22KviuK_f/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
