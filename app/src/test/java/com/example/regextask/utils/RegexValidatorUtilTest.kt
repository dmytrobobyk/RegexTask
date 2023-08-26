import com.example.regextask.utils.RegexValidatorUtil
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class RegexValidatorUtilTest {

    private val specialChars = """[!"#$%&'()*+,-./:;<=>?@\]^_`{|}~]"""
    private val maxLength = 20

    @Test
    fun `test too long input`() {
        val longInput = "Aa1@" + "a".repeat(18)
        assertFalse(RegexValidatorUtil.isValidString(longInput, maxLength, specialChars))
    }

    @Test
    fun `test matching input length`() {
        assertTrue(RegexValidatorUtil.isValidString("Aa1@abcdef", maxLength, specialChars))
    }

    @Test
    fun `test missing uppercase`() {
        assertFalse(RegexValidatorUtil.isValidString("aa1@abcdef", maxLength, specialChars))
    }

    @Test
    fun `test missing lowercase`() {
        assertFalse(RegexValidatorUtil.isValidString("AA1@BCDEFG", maxLength, specialChars))
    }

    @Test
    fun `test missing special character`() {
        assertFalse(RegexValidatorUtil.isValidString("Aa12345678", maxLength, specialChars))
    }

    @Test
    fun `test missing digit`() {
        assertFalse(RegexValidatorUtil.isValidString("Aa@abcdef", maxLength, specialChars))
    }

    @Test
    fun `test whitespace at start`() {
        assertFalse(RegexValidatorUtil.isValidString(" Aa1@abcdef", maxLength, specialChars))
    }

    @Test
    fun `test whitespace in middle`() {
        assertFalse(RegexValidatorUtil.isValidString("Aa1@ abcdef", maxLength, specialChars))
    }

    @Test
    fun `test whitespace at end`() {
        assertFalse(RegexValidatorUtil.isValidString("Aa1@abcdef ", maxLength, specialChars))
    }

    @Test
    fun `test valid input`() {
        assertTrue(RegexValidatorUtil.isValidString("Aa1@abcdef", maxLength, specialChars))
    }
}
