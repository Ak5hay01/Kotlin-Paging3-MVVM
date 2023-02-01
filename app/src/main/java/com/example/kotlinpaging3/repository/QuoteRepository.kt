package com.example.kotlinpaging3.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.kotlinpaging3.paging.QuoteSource
import com.example.kotlinpaging3.retrofit.QuoteAPI
import javax.inject.Inject

class QuoteRepository @Inject constructor(val quoteAPI: QuoteAPI) {

    fun getQuotes() = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100),
        pagingSourceFactory = {QuoteSource(quoteAPI)}
    ).liveData
}