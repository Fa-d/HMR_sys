package com.faddy.hmr_sys.repository

import com.faddy.hmr_sys.api.ApiService
import javax.inject.Inject


class AppRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getCustomerBalance(customerCode: String) = apiService.getCustomerBalance(customerCode)

}