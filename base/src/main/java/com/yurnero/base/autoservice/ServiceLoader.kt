package com.yurnero.base.autoservice

import java.util.*

class BaseServiceLoader {
    companion object {
        fun <S> load(service: Class<S>?): S? {
            return try {
                ServiceLoader.load(service, javaClass.classLoader).iterator().next()
            } catch (e: Exception) {
                null
            }
        }
    }
}