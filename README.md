# 📢 music-streamer

![Kotlin](https://img.shields.io/badge/kotlin-2.0.10-orange.svg)
![Apache 2](https://img.shields.io/badge/license-Apache2-green.svg?style=flat)

## 📓 Описание
Приложение предназначено для поиска, прослушивания и управления музыкальными треками, используя API Deezer. Реализованы функциональные экраны для просмотра списка треков, поиска, а также воспроизведения локальной музыки.

## 🏠 Технологии
- **Kotlin** – основной язык разработки
- **ExoPlayer** – для воспроизведения аудио
- **Retrofit, OkHttp** – для работы с API Deezer
- **MVVM**– архитектурный подход
- **Navigation Component** – управление навигацией
- **RecyclerView** – для отображения списка треков
- **CLean Architecture** - разделение логики на слои domain/data/presentation
- **View** - XML
- **DI** - Hilt
- **Многомодульность**

## 🏁 Start

1. Clone the repository:
```bash
git clone https://github.com/lsyyx/music-streamer.git
```
2. Откройте проект в Android Studio
3. Синхронизируйте зависимости (Gradle Sync)
4. Запустите приложение на эмуляторе или устройстве
5. 
<img src="https://github.com/lsyyx/music-streamer/blob/main/gif/screen_record.gif" width="300"/>


## Сложности
1. Технические сложности на моем ПК с Android Studio на Ubuntu, не было доступа к эмулятору без рутовых прав. К сожалению, не успела оперативно выявить причину и продолжила писать проект с этой проблемой. Надеюсь не станет проблемой при билде на другой машине.
2. Не хватило времени реализовать фоновый плеер. Следующий этап был бы создать сервис c **PlayerNotificationManager**, который как раз поддерживает ExoPlayer и с помощью него можно было бы реализовать все, что требует ТЗ.
3. Возникло недопонимание с работой стэка в BottomNavigationBar, но оказалось, что эта реализация Навигационного Бара поддерживает мульти стэк, поэтому пришлось его обрабатывать стек прямо в MainAсtivity.
   
