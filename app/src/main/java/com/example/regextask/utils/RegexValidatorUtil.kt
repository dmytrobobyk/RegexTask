package com.example.regextask.utils

object RegexValidatorUtil {

    private val stringValidationRegex: (Int, String) -> Regex = { maxLength, specialChars ->
        Regex(
            "^(?=.{1,$maxLength}$)(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*$specialChars)(?!.*\\s).*$"
        )
    }

    /**
     * Validates the input string based on the following criteria:
     * 1. Maximum string length.
     * 2. At least one uppercase letter, one lowercase letter, one digit, and one special character from a predefined list.
     * 3. No whitespace characters.
     *
     * @param input The input string to validate.
     * @param maxLength The maximum allowed length for the input string.
     * @return `true` if the input string matches the criteria, otherwise `false`.
     */
    fun isValidString(input: String, maxLength: Int, specialChars: String = ""): Boolean {
        val pattern = stringValidationRegex(maxLength, specialChars)
        return pattern.matches(input)
    }
}
