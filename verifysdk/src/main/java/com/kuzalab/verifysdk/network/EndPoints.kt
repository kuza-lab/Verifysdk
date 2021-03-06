/*
 * *
 *  * Created by Kogi Eric  on 5/20/19 5:42 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 5/20/19 3:58 PM
 *
 */

import com.kuzalab.verifysdk.models.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * @author kogi
 */
internal interface EndPoints {

    @GET("oauth")
    fun generateToken(): Call<AuthToken>


    @GET("userdetails")
    fun searchIdNumber(@Query("id_number") id: String): Call<SearchUserResponse>


    @POST("userverification")
    fun verifyPerson(@Query("id_number") id: String, @Body verifyPersonModel: VerifyPersonModel): Call<VerifyPersonResponse>


    @GET("ncadetailsbyname")
    fun searchNcaContractorByName(@Query("contractor_name") contractorName: String): Call<SearchNcaContractorsResponse>

    @GET("ncadetailsbyid")
    fun searchNcaContractorById(@Query("registration_number") registrationNumber: String): Call<SearchNcaContractorResponse>


    @POST("ncaverification")
    fun verifyNcaContractor(@Query("registration_number") registrationNumber: String, @Body verifyNcaContractor: VerifyNcaContractor): Call<VerifyNcaContractorResponse>

}
