package com.example.reverseuserinputtext.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

object Util {

    //Get the reverse text
    fun reverseText(value: String?): String {
        val inputText: String? = value
        val enteredInputText = inputText?.length
        var reverseText = ""
        if (enteredInputText != null) {
            for (i in enteredInputText - 1 downTo 0) {
                val textValue = inputText.substring(i, i + 1)
                reverseText += textValue
            }
        }
        return reverseText
    }

    //hide keyboard
    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}