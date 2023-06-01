package com.demo.validationlib

import java.util.regex.Pattern


private val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
    "[a-zA-Z0-9+._%\\-]{1,256}" + "@" + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" + "\\." + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+"
)

fun isValidEmail(target: CharSequence): Boolean {
    return if (target.isBlank()) {
        false
    } else {
        EMAIL_ADDRESS_PATTERN.matcher(target).matches()
    }
}