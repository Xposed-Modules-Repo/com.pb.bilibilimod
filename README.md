# BilibiliMod

Modulo LSPosed para ajustar o app Bilibili (`tv.danmaku.bili`).

## Funcoes

- Forca o `RegionManager` do Bilibili a tratar a regiao como China (`CN`).
- Restaura o acesso ao menu de categorias pelo item `bilibili://main/top_category`.
- Define preferencia de legenda para portugues quando o pedido de legenda nao traz idioma preferido.
- Mostra diagnosticos de legendas e traducao no logcat com a tag `BilibiliMod`.
- Traduz titulos de videos na pagina de categorias usando o endpoint interno `TranslationMoss` do proprio Bilibili.

## Uso

1. Instale o APK do modulo.
2. Ative o modulo no LSPosed.
3. Coloque somente `tv.danmaku.bili` no escopo.
4. Force o fechamento do Bilibili e abra novamente.

> [!IMPORTANT]
> Na primeira abertura do Bilibili apos instalar/ativar o modulo, use uma VPN chinesa. Se o app for aberto sem VPN nessa primeira vez, ele pode ocultar as categorias e elas so voltam depois de limpar os dados do Bilibili.

## Observacoes

- A traducao dos titulos da pagina de categorias e feita no caminho de renderizacao que funciona nessa tela Compose. Isso pode causar atraso inicial ao abrir uma categoria.
- O modulo nao grava cache persistente de traducoes.
- Evite escopar o Bilibili em outro modulo que tenha hooks iguais para nao duplicar comportamento.

## Donate

I do not have a stable income and I build this module for fun in my free time. If it helps you, any support keeps the project alive and means a lot.

[![Donate](https://img.shields.io/badge/Donate-Support%20the%20project-ff69b4?style=for-the-badge)](https://github.com/pbzin)
