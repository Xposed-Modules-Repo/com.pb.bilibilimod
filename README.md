# BilibiliMod

LSPosed module for foreign Bilibili users (`tv.danmaku.bili`). It forces the app to treat the installation as a CN version/region and releases categories of videos that are hidden outside of China, similar to access on a PC.

## Functions

- Forces Bilibili to treat the region/version as China (`CN`) even for foreign users.
- Restores access to the category menu and hidden video categories in the mobile app outside of China, similar to Bilibili on PC.
- Sets subtitle preference to Portuguese when the subtitle request does not include a preferred language.
- Shows subtitle and translation diagnostics in logcat with the `BilibiliMod` tag.
- Translates video titles on the category page using Bilibili's own internal endpoint `TranslationMoss`.

## Usage

1. Install the module APK.
2. Activate the module in LSPosed.
3. Put only `tv.danmaku.bili` in scope.
4. Force close Bilibili and open it again.

> [!IMPORTANT]
> When opening Bilibili for the first time after installing/activating the module, use a Chinese VPN. If the app is opened without a VPN this first time, it may hide the categories and they will only return after clearing the Bilibili data.

## Observations

- The translation of the category page titles is done in the rendering path that works in this Compose screen. This may cause initial delay when opening a category.
- The module does not record persistent cache of translations.
- Avoid using Bilibili in another module that has the same hooks to avoid duplicating behavior.

## Donate

I do not have a stable income and I build this module for fun in my free time. If it helps you, any support keeps the project alive and means a lot.

[![Donate](https://img.shields.io/badge/Donate-Support%20the%20project-ff69b4?style=for-the-badge)](https://github.com/pbzin)
