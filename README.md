[![Repo Views](https://api.visitorbadge.io/api/visitors?path=https%3A%2F%2Fgithub.com%2Fpbzin%2FBilibiliMod&label=repo%20views&countColor=%230e75b6&style=flat)](https://visitorbadge.io/status?path=https%3A%2F%2Fgithub.com%2Fpbzin%2FBilibiliMod)

![Downloads](https://img.shields.io/github/downloads/pbzin/BilibiliMod/total?style=flat&color=0e75b6&label=downloads)

# BilibiliMod

LSPosed module for foreign Bilibili users (`tv.danmaku.bili`).

It forces Bilibili to treat the app as the CN version/region and unlocks hidden mobile video categories, similar to the category access available on PC.

## Features

- Forces Bilibili region/version behavior to China (`CN`) for foreign users.
- Restores access to hidden video categories in the mobile app, similar to Bilibili on PC.
- Opens the category menu through `bilibili://main/top_category`.
- Sets Portuguese as the preferred subtitle language when Bilibili does not provide a preferred language.
- Logs subtitle and translation diagnostics with the `BilibiliMod` logcat tag.
- Translates video titles in category and author-space pages through Bilibili's internal `TranslationMoss` endpoint.

## Usage

1. Install the module APK.
2. Enable the module in LSPosed.
3. Select only `tv.danmaku.bili` as the module scope.
4. Force close Bilibili and open it again.

> [!IMPORTANT]
> On the first Bilibili launch after installing/enabling this module, use a Chinese VPN. If the app is opened without the VPN first, Bilibili may hide the categories and they usually return only after clearing Bilibili app data.

## Notes

- Title translation on category pages runs through the render path used by that Compose screen, so the first category opening may have a short delay.
- The module does not store a persistent translation cache.
- Avoid scoping Bilibili into another module that hooks the same behavior, otherwise effects may be duplicated.


### 💖 Support My Work

<p align="center">
  <a href="https://buymeacoffee.com/pbzin">
    <img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" height="38" align="absmiddle">
  </a>
  <a href="https://github.com/sponsors/pbzin">
    <img src="https://img.shields.io/badge/Sponsor-💖-ea4aaa?style=for-the-badge&logo=githubsponsors&logoColor=white" alt="GitHub Sponsors" height="38" align="absmiddle">
  </a>
<p align="center">
  <img src="https://img.shields.io/badge/Pix-⚡-32BCAD?style=for-the-badge&logo=pix&logoColor=white" alt="Pix" height="30">
  <img src="https://raw.githubusercontent.com/pbzin/pbzin/main/assets/brasil-badge.png" alt="Brasil" height="30">
  <br>
  <code>5198a8b3-6b89-4475-aec1-5adcfcfd12cf</code>
  <br><br>
  <img src="https://img.shields.io/badge/Bitcoin-F7931A?style=for-the-badge&logo=bitcoin&logoColor=white" alt="Bitcoin" height="30">
  <br>
  <code>1GkpDZDHYov7WZLs54Nv19f2KUoZPcACs2</code>
</p>
<p align="center">
  <img src="https://raw.githubusercontent.com/pbzin/pbzin/main/assets/bitcoin-qr.png" width="150" alt="Bitcoin donation QR code">
  <br><br>
  <img src="https://img.shields.io/badge/Monero-FF6600?style=for-the-badge&logo=monero&logoColor=white" alt="Monero" height="30">
  <br>
  <code>45YtYmxUeXeFdokKPG1KWtMFLByS8nwmtiJjEiZ9LfbkNaSUCvyWWAx3VmtDKKkxPJFdQLSXxodRWMt7EBu5TmA3Qi9dgwT</code>
  <br>
  <img src="https://raw.githubusercontent.com/pbzin/pbzin/main/assets/monero-qr.png" width="150" alt="Monero donation QR code">
</p>
---
