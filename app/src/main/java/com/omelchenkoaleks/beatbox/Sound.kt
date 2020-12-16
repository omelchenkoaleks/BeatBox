package com.omelchenkoaleks.beatbox

private const val WAV = ".wav"

/**
 * Класс для хранения имени файла, который видит пользователь и всей информации,
 * относящейся к звуку.
 */
class Sound(val assetPath: String, var soundId: Int? = null) {

    /**
     * Отделяем имя файла и удаляем расширение.
     */
    val name = assetPath.split("/").last().removeSuffix(WAV)

}