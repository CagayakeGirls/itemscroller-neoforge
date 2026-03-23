<center><div align="center">

<img height="100" src="src/main/resources/icon.png" width="100"/>

# Rock‘n Roller for NeoForge

ItemScroller unofficial NeoForge port.

<img alt="neoforge" height="56" src="https://raw.githubusercontent.com/KessokuTeaTime/badges-extra/main/assets/cozy/supported/neoforge_vector.svg">

<a href="https://modrinth.com/mod/mafglib">
<img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">
</a>
<a href="https://www.curseforge.com/minecraft/mc-mods/mafglib">
<img alt="curseforge" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg">
</a>

</div></center>

Rock‘n Roller is a Minecraft mod that adds various convenience features for moving items
inside inventory GUIs. Examples are scrolling the mouse wheel over slots with items in them
or Shift/Ctrl + click + dragging over slots to move items from them in various ways etc.

Item scrolling is basically what the old NEI mod did and Mouse Tweaks also does.
This mod has some different drag features compared to Mouse Tweaks, and also some special
villager trading related helper features as well as crafting helper features.

[Original Repo Readme](Original-README.md)

## Development

This mod use modrinth maven.

```gradle
repositories {
    maven { url 'https://api.modrinth.com/maven' }
}

dependencies {
    modImplementation "maven.modrinth:rocknroller:${mafglib_version}"
}
```

or use KessokuTeaTime maven (only 0.4.1 and above)

```gradle
repositories {
    maven { url 'https://maven.kessokuteatime.work/releases' }
}

dependencies {
    modImplementation "team.cagayakegirls.rocknroller:rocknroller:${mafglib_version}"
}
```

> Note: "${mafglib_version}" can be found in [Modrinth](https://modrinth.com/mod/rocknroller)

## Compiling
- Clone the repository
- Open a command prompt/terminal to the repository directory
- run 'gradlew build'
- The built jar file will be in build/libs/

## Credits
- [maruohon/itemscroller](https://github.com/maruohon/itemscroller)
- [sakura-ryoko/itemscroller](https://github.com/sakura-ryoko/itemscroller)