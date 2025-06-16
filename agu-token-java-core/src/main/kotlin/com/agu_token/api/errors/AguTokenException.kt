package com.agu_token.api.errors

open class AguTokenException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
