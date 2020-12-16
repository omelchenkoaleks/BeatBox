package com.omelchenkoaleks.beatbox

class SoundViewModel {

    /**
     * Класс должен содержать два свойства: для объекта Sound и для объекта BeatBox.
     * Эти свойства образуют интерфейс, который будет использоваться адаптером.
     */
    var sound: Sound? = null
        set(sound) {
            field = sound
        }

    /**
     * Дополнительная функция для получения названия, которое должно отображаться на кнопке.
     */
    val title: String?
        get() = sound?.name

}