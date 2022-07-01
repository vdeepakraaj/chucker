package com.chuckerteam.chucker.internal.support

public fun MutableList<String>.shouldIgnore(url: String): Boolean {
    //Return true if url contains the part of String which has been sent in ignoreApi builder
    return this.any { substringOfUrl -> url.contains(substringOfUrl, ignoreCase = true) }
}
