# BilibiliMod

LSPosed module for foreign Bilibili users (`tv.danmaku.bili`).

It forces Bilibili to treat the app as the CN version/region and unlocks hidden mobile video categories, similar to the category access available on PC.

## Features

- Forces Bilibili region/version behavior to China (`CN`) for foreign users.
- Restores access to hidden video categories in the mobile app.
- Opens the category menu through `bilibili://main/top_category`.
- Sets Portuguese as the preferred subtitle language when Bilibili does not provide a preferred language.
- Translates video titles in category and author-space pages through Bilibili's internal `TranslationMoss` endpoint.

## Usage

1. Install the APK from the release page.
2. Enable the module in LSPosed.
3. Select only `tv.danmaku.bili` as the module scope.
4. Force close Bilibili and open it again.

> [!IMPORTANT]
> On the first Bilibili launch after installing/enabling this module, use a Chinese VPN. If the app is opened without the VPN first, Bilibili may hide the categories and they usually return only after clearing Bilibili app data.

## Source

Source code: https://github.com/pbzin/BilibiliMod

## Donate

I do not have a stable income and I build this module for fun in my free time. If it helps you, any support keeps the project alive and means a lot.

[![Donate](https://img.shields.io/badge/Donate-Support%20the%20project-ff69b4?style=for-the-badge)](https://github.com/pbzin)
