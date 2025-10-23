# Color Extraction Android Task

## Background

As part of this task, we’d like you to build an app that:
1.	Downloads an image from a given URL
2.	Extracts the main colours from the image
3.	Displays the image with the colours as per the Figma designs

## UI

We’d like you to:
1.	Build the UI so that it matches the Figma specification
2.	Verify that the UI looks correct across different form factors

## UX

When a user navigates through the images, we want them to see the image even
if the colours haven’t been extracted, so that they are not looking at a blank
screen.

Images should be viewable in the same order they appear in the list, unless, of
course, there is no image for a given URL.

## Downloading Images

We have included [LargeImageDownloader](app/src/main/java/com/popsa/colorextraction/LargeImageDownloader.kt)
for downloading images, as well as a list of [imageUrls](app/src/main/java/com/popsa/colorextraction/ImageUrls.kt)

The images provided by Picsum are quite small, so we are scaling them to produce larger images for this task.

## Colour Extraction

For the colour extraction, we’d like you to use androidx.palette.graphics.Palette;
however, it could be swapped out at a later stage for a different library. Please
design your solution with this possibility in mind.

The main colours we want to extract are:
* Vibrant: which can be mapped from Palette’s VibrantColor
* Light Vibrant: which can be mapped from Palette’s LightVibrantColor
* Dark Vibrant: which can be mapped from Palette’s DarkVibrantColor
* Muted: which can be mapped from Palette’s MutedColor
* Light Muted: which can be mapped from Palette’s LightMutedColor

## Other

The goal of this task is to see how you tackle the problem, so we’d love
to hear your thoughts as you work through it.

Feel free to use any tools you are familiar with — just let us know what
you are using them for.

If you have any questions throughout the process, we’re happy to help!

Good luck! 😊
