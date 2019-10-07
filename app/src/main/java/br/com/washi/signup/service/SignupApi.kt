package br.com.washi.signup.service

import br.com.washi.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SignupApi {
    private fun signupApi(retrofit: Retrofit) =
        retrofit.create(SignupService::class.java)

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val signupService: SignupService = signupApi(getRetrofit())
}