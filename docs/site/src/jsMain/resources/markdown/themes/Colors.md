---
title: Color customization
applies_to: v0.5 or later
---

## Color values

FlorisBoard supports three different color types. 
Static colors are simple rgba color values whereas the dynamic-color values are derived from the phones Material You
color or the override `Accent color` from the [Themes screen](ui://florisboard/settings/theme) in FlorisBoard.

### Static color

| Property value          | Description                                                                                                            |
|-------------------------|------------------------------------------------------------------------------------------------------------------------|
| `transparent`           | Defines a transparent background.                                                                                      |
| `rgb(<r>,<g>,<b>)`      | Defines a rgba color where the alpha value is set to one. `<r>`,`<g>`,`<b>` must be an integer withing 0 and 255.      |
| `rgba(<r>,<g>,<b>,<a>)` | Defines a rgba color. `<r>`,`<g>`,`<b>` must be an integer withing 0 and 255. `<a>` must be a float between 0 and 1.   |
| `hex#<r><g><b>`         | Defines a rgba color where the alpha value is set to one. `<r>`,`<g>`,`<b>` must be a hex value between 00 and FF.     |
| `hex#<r><g><b><a>`      | Defines a rgba color. `<r>`,`<g>`,`<b>`,`<a>` must be a hex value between 00 and FF.                                   |

### Dynamic (Material You) colors

FlorisBoard uses the [materialkolor](https://github.com/jordond/MaterialKolor) library to calculate the dynamic `ColorScheme` from a given accent color.
This accent color is either derived from the system accent color (Material You Color) or a custom color override.
Not using the `ColorScheme` provided by the system has multiple advantages.

1. The theme looks the same on every device and android version given the same accent color.
2. Older devices can use features from newer android versions.
3. Custom accent colors can easily get integrated.


The theme author can control the calculation for the Color on a per stylesheet basis with the [stylesheet meta](/extensions#theme-extension-specific-files-fields).
Currently there are three different options you can control the generator with.

1. [PalleteStyle](https://github.com/jordond/MaterialKolor/blob/main/material-kolor/src/commonMain/kotlin/com/materialkolor/PaletteStyle.kt)
2. [Color contrast](https://github.com/jordond/MaterialKolor/blob/main/material-kolor/src/commonMain/kotlin/com/materialkolor/Contrast.kt)
3. [Spec version](https://github.com/jordond/MaterialKolor/blob/main/material-color-utilities/src/commonMain/kotlin/com/materialkolor/dynamiccolor/ColorSpec.kt)

#### Dynamic light color

| Property value                | Description                                                                                                                                                                                                                                                                     |
|-------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `dynamic-light-color(<name>)` | Defines a dynamic light Material You color with the given `<name>`. The `<name>` has to be one of the ids from the FlorisBoard [ColorPalette](https://github.com/florisboard/florisboard/blob/main/lib/color/src/main/kotlin/org/florisboard/lib/color/ColorPalette.kt) |


#### Dynamic dark color

| Property value               | Description                                                                                                                                                                                                                                                                    |
|------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `dynamic-dark-color(<name>)` | Defines a dynamic dark Material You color with the given `<name>`. The `<name>` has to be one of the ids from the FlorisBoard [ColorPalette](https://github.com/florisboard/florisboard/blob/main/lib/color/src/main/kotlin/org/florisboard/lib/color/ColorPalette.kt) |


## Color elements

### Background

Controls the background color of the element.

- property-name: `background`
- Inherits implicitly: no
- Possible values: [Static color](#static-color), [Dynamic light color](#dynamic-light-color), [Dynamic dark color](#dynamic-dark-color)

### Foreground

Controls the foreground color of the element.

- property-name: `foreground`
- Inherits implicitly: no
- Possible values: [Static color](#static-color), [Dynamic light color](#dynamic-light-color), [Dynamic dark color](#dynamic-dark-color)

### Border color

Controls the corder color of the element.

- property-name: `border-color`
- Inherits implicitly: no
- Possible values: [Static color](#static-color), [Dynamic light color](#dynamic-light-color), [Dynamic dark color](#dynamic-dark-color)

### Shadow color

Controls the shadow color color of the element.

- property-name: `shadow-color`
- Inherits implicitly: no
- Possible values: [Static color](#static-color), [Dynamic light color](#dynamic-light-color), [Dynamic dark color](#dynamic-dark-color)

<table-of-contents />
