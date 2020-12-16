package com.omelchenkoaleks.beatbox

private const val WAV = ".wav"

/**
 * Класс для хранения имени файла, который видит пользователь и всей информации,
 * относящейся к звуку.
 */
class Sound(private val assetPath: String) {

    /**
     * Отделяем имя файла и удаляем расширение.
     */
    val name = assetPath.split("/").last().removeSuffix(WAV)

}