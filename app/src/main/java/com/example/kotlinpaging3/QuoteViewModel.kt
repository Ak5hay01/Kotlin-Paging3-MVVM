package com.example.kotlinpaging3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.kotlinpaging3.repository.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(val quoteRepository: QuoteRepository):ViewModel() {

    val list = quoteRepository.getQuotes().cachedIn(viewModelScope)
}