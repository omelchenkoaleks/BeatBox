package com.omelchenkoaleks.beatbox

import android.content.res.AssetManager
import android.util.Log

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager) {

    private val sounds: List<Sound>

    init {
        sounds = loadSounds()
    }

    fun loadSounds(): List<Sound> {

        val soundNames: Array<String>

        try {
            soundNames =
                assets.list(SOUNDS_FOLDER)!! // возвращает список имен файлов в заданной папке
        } catch (e: Exception) {
            Log.e(TAG, "Could not list assets", e)
            return emptyList()
        }

        val sounds = mutableListOf<Sound>()

        // Строим список объектов Sound.
        soundNames.forEach { filename ->
            val assetPath = "$SOUNDS_FOLDER/$filename"
            val sound = Sound(assetPath)
            sounds.add(sound)
        }

        return sounds
    }
}