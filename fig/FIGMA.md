# [FIGMA](https://www.figma.com)

## Relay for Figma

- Add `Relay for Android Studio` plugin
- Figma Account > Settings > Personal Access Tokens > Create a new token
- Android Studio > Tools > Relay Settings > paste PAT in dialog
- In Figma, import file > typically created by design team > *.fig
- Right click file > Copy link
- Android Studio > File > New > Import UI Packages > paste link into dialog
    - also paste app theme url into dialog
    - make sure it matches path to projects ../ui/theme/Theme.kt
- Android Studio > Build > Make Project

## Gradle

- `id("com.google.relay").version("0.3.11")`
- include `gradlePluginPortal()` in repositories in settings.gradle.kts

## Resources

- [Flaticon](https://www.flaticon.com/)
- [Creative Assets](https://elements.envato.com/)
- [Fonts](https://fonts.google.com/)
- [Screen Resolution Stats](https://gs.statcounter.com/screen-resolution-stats)
- [Create UI Package in Figma](https://developer.android.com/develop/ui/compose/tooling/relay/create-ui-package-in-figma)
- [Relay for Figma](https://www.figma.com/community/plugin/1041056822461507786/relay-for-figma)
