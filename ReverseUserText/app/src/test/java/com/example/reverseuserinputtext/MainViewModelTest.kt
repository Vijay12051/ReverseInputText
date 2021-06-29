package com.example.reverseuserinputtext

import com.example.reverseuserinputtext.utils.Util
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine.
 *
 * See testing documentation (http://d.android.com/tools/testing).
 */
class MainViewModelTest {

    @Test
    fun testReverseString() {
        assertEquals(Util.reverseText("Vijay"), "yajiV")
        assertNotEquals(Util.reverseText("bcd"), "dcba")
        assertEquals(Util.reverseText(""), "")
    }
}