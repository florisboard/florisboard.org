---
title: Theme Editor Basics
menu_position: 2
---

This page describes the basics on how to customize local theme extensions using the built-in theme editor UI.

## Accessing the theme editor

1. Go to Themes > Manage theme extensions
2. Tap on Edit for the theme extension you want to customize
3. Tap on Edit for the stylesheet you want to customize

## Structure of the theme editor

### Stylesheet meta data

In the very top of every theme component there is the theme meta data display.
The theme meta data can be edited by clicking on the ${BootstrapIcon("pencil-fill")} Edit button.
The metadata is saved in the `extension.json` and explained in more detail [here](/extensions#theme-extension-specific-files-fields)

### Variable definition (`@defines`)

In this section you can define variables for your theme. A variable can hold one snygg property value.
The name of the variable must match `--[a-zA-Z0-9-]+` and can only be used once.
Snygg variables can be referenced in the rest of the stylesheet.

### Rules

For the list of available rules see [rules](Rules.md)

<table-of-contents />
