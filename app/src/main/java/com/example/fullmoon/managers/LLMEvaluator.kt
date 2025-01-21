package com.example.fullmoon.managers


import android.content.Context
import org.tensorflow.lite.Interpreter
import java.io.File
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel

class LLMEvaluator(context: Context) {
    private val interpreter: Interpreter

    init {
        val model = loadModelFile(context, "model.tflite")
        interpreter = Interpreter(model)
    }

    private fun loadModelFile(context: Context, modelName: String): MappedByteBuffer {
        val fileDescriptor = context.assets.openFd(modelName)
        val inputStream = FileInputStream(fileDescriptor.fileDescriptor)
        val fileChannel = inputStream.channel
        val startOffset = fileDescriptor.startOffset
        val declaredLength = fileDescriptor.declaredLength
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
    }

    fun evaluate(prompt: String): String {
        val input = arrayOf(prompt)
        val output = Array(1) { ByteArray(256) }
        interpreter.run(input, output)
        return output[0].toString(Charsets.UTF_8)
    }
}
