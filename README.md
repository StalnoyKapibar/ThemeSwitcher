# ThemeSwitcher
Plugin for Inteliji Idea. Switching light/dark theme by one button.

![Смена темы](https://github.com/StalnoyKapibar/ThemeSwitcher/raw/Screenshots/ThemeSwitcher.gif)

### Как собрать jar:
+ Открыть меню Gradle
+ Выбрать intellij
+ Нажать buildPlugin
+ jar файл будет лежать в build\idea-sandbox\plugins\ThemeSwitcher\lib

![Сборка в jar](https://github.com/StalnoyKapibar/ThemeSwitcher/raw/Screenshots/buildJar.png)

### Для корректной работоспособности с разными версиями IDEA

1. Узнать версию IntelliJ IDEA на которую планируется установить плагин
2. Открыть файл build.gradle
3. Найти в этом файле строки
intellij {
    version '2018.3.1'
}
4. Значение в ключе version заменить на нужную версию

![Смена версии](https://github.com/StalnoyKapibar/ThemeSwitcher/raw/Screenshots/build.png)


### Инструкция по установке
1. Открыть настройки (ctral+alt+s)
2. Далее plugins - настройки(значок шестеренки)- install plugin from disk
![Установка плагина](https://github.com/StalnoyKapibar/ThemeSwitcher/raw/Screenshots/install1.png)
3. Перезапустить идею.
4. Готово. Чуть левее кнопки запуски проекта будет значок на смену темы.
