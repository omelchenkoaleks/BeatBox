package com.omelchenkoaleks.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {

    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    /**
     * Класс должен содержать два свойства: для объекта Sound и для объекта BeatBox.
     * Эти свойства образуют интерфейс, который будет использоваться адаптером.
     */
    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange() // Когда будет вызвана эта функция, она оповестит класс привязки, что все Bindable-свойства наших объектов были обновлены.
        }

    /**
     * Дополнительная функция для получения названия, которое должно отображаться на кнопке.
     */
    @get:Bindable
    val title: String?
        get() = sound?.name

}