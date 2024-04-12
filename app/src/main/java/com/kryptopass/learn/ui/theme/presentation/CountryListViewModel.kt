package com.kryptopass.learn.ui.theme.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kryptopass.learn.domain.DetailedCountry
import com.kryptopass.learn.domain.GetCountryListUseCase
import com.kryptopass.learn.domain.GetCountryUseCase
import com.kryptopass.learn.domain.SimpleCountry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountryListViewModel @Inject constructor(
    private val getCountryListUseCase: GetCountryListUseCase,
    private val getCountryUseCase: GetCountryUseCase
): ViewModel() {

    private val _state = MutableStateFlow(CountryListState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.update { it.copy(
                isLoading = true
            ) }
            _state.update { it.copy(
                countryList = getCountryListUseCase.execute(),
                isLoading = false
            ) }
        }
    }

    fun selectCountry(code: String) {
        viewModelScope.launch {
            _state.update { it.copy(
                selectedCountry = getCountryUseCase.execute(code)
            ) }
        }
    }

    fun dismissCountryDialog() {
        _state.update { it.copy(
            selectedCountry = null
        ) }
    }

    data class CountryListState(
        val countryList: List<SimpleCountry> = emptyList(),
        val isLoading: Boolean = false,
        val selectedCountry: DetailedCountry? = null
    )
}