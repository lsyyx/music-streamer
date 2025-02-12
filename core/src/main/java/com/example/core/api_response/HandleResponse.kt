package com.example.core.api_response

import android.util.Log
import okhttp3.internal.platform.android.AndroidLog
import retrofit2.HttpException
import retrofit2.Response

suspend fun <T : Any, R : Any> handleApi(
    execute: suspend () -> Response<T>,
    transform: (T) -> R
): ApiResponse<R> {
    return try {
        val response = execute()
        val body = response.body()
        if (response.isSuccessful && body != null) {
            Log.d("TAGsTracks", "handleApi: $body")
            Success(transform(body))
        } else {
            Error(
                code = response.code(),
                message = response.message()
            )
        }
    } catch (e: HttpException) {
        Error(code = e.code(), message = e.message())
    } catch (e: Throwable) {
        Exception(e)
    }
}