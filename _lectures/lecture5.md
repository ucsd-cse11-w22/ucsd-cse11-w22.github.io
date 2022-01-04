---
layout: with-sidebar
index: 5
name: Booleans and If
released-on: "2021-1-12"
videos:
  - title: More on String Methods
    url: https://drive.google.com/file/d/1rYWNaFbrW5W-ITueTlzaPzW8k-CkTuWX
  - title: A Design Recipe Example
    url: https://drive.google.com/file/d/1WgbC_LPGfsRbj-ybdoYYg8SHl8W5Ryvd
  - title: Booleans
    url: https://drive.google.com/file/d/1LHxrTqZfszFmsF6xDTCD8SbAO2iemxY5
  - title: If (watch from 26:00 to 37:30)
    url: https://drive.google.com/file/d/1Akg2I_XKXuyOImRrVD6phPk-x-YBfcL8

worksheets:


---

## Problem Session 5 – Booleans and If

_{{ page.released-on }}_

Readings to be completed **before** problem session.

- Stepik Chapter 4 [https://stepik.org/lesson/568133/step/1?unit=562510](https://stepik.org/lesson/568133/step/1?unit=562510)

Videos (to watch **before** your problem session on January 12) You will
need to make an account on Stepik to have your work saved.:

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout

<iframe src="https://drive.google.com/file/d/1hV3M2zQloU020laQb6xJY23SQR6URNlJ/preview" width="640" height="480" allow="autoplay"></iframe>

## Completed Worksheets from Dicussion and Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="256" height="192" allow="autoplay"></iframe>
</div>
{% endfor %}