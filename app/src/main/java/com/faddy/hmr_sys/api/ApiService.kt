package com.faddy.hmr_sys.api

import com.faddy.hmr_sys.models.CustomerBalanceModel
import com.faddy.hmr_sys.models.ErrorResponse
import com.faddy.hmr_sys.utils.Constants
import com.haroldadmin.cnradapter.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/customerBal/{customerCode}")
    suspend fun getCustomerBalance(@Path("customerCode") customerCode: String): NetworkResponse<List<CustomerBalanceModel>, ErrorResponse>

}