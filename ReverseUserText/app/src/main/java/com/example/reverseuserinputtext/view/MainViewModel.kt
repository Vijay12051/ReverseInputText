package com.example.reverseuserinputtext.view

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.reverseuserinputtext.utils.Util
import com.example.reverseuserinputtext.utils.Util.hideKeyboard

class MainViewModel : ViewModel() {

    val inputString = MutableLiveData<String>()
    val reverseString = MutableLiveData<String>()
    private var mUserList: String? = null

    //Get the reverse input text
    fun getReverseText(): MutableLiveData<String> {
        mUserList = Util.reverseText(inputString.value)
        reverseString.value = mUserList!!
        return reverseString
    }

    fun onSubmit(view: View) {
        view.hideKeyboard()
        mUserList = Util.reverseText(inputString.value)
        reverseString.value = mUserList!!
    }
}