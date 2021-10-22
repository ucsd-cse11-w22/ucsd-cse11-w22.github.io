---
layout: with-sidebar
index: 12
name: Arrays
released-on: "2021-10-20"
videos:
  - title: Arrays
    url: https://drive.google.com/file/d/1TglDg1vHTC1ibjO4WJR8SJJSfvpMp9fC
  - title: Arrays, Indexing
    url: https://drive.google.com/file/d/1WkQ5PoQxwNFVio_tp9RD7y-h188zGKoF
  - title: Arrays, Methods
    url: https://drive.google.com/file/d/1PzrWhXBRerq0oTeVhlnuNc0vNJ6xQW9k
  - title: Arrays, Memory
    url: https://drive.google.com/file/d/14QiAfHlccvCZTVsU3MuBvLoFkSU-_UAo
worksheets:
  - title: 10AM Lecture
    url: https://drive.google.com/file/d/1No7iG6OZ0388oXyMWlJGgiHnzV8KazOe
  - title: 2PM Lecture
    url: https://drive.google.com/file/d/1A3MTpOsjkarlxFUYlo_qt_xGnfVDEyoB
  - title: 4PM Lecture
    url: https://drive.google.com/file/d/1QFW-8b4ge3u3p9QS9bl7QiY9m_TIYdmI
  - title: 4PM Discussion
    url: https://drive.google.com/file/d/11_1wbLfkurK5UiZQkbeXwNaHfLVfZEkV
---


## Problem Session {{ page.index }} – {{ page.name }}

_{{ page.released-on }}_

Participation form: [https://docs.google.com/forms/d/e/1FAIpQLSeFHcjPjwRxRUpzFF-g4JlAQkAnpqcweYTWwyTbdvOVFpEeNQ/viewform](https://docs.google.com/forms/d/e/1FAIpQLSeFHcjPjwRxRUpzFF-g4JlAQkAnpqcweYTWwyTbdvOVFpEeNQ/viewform)

## Pre-Reading and Videos

Stepik reading:
- [Stepik 9](https://stepik.org/lesson/579631/step/1?unit=574281)

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Handout

<iframe src="https://drive.google.com/file/d/1rxrVoNarZNfsRsKtY7QrG4sOh-XgPbSx/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}
