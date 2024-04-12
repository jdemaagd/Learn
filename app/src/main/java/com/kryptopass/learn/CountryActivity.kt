package com.kryptopass.learn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.kryptopass.learn.ui.theme.LearnTheme
import com.kryptopass.learn.ui.theme.presentation.CountryListViewModel
import com.kryptopass.learn.ui.theme.presentation.CountryListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CountryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTheme {
                val viewModel = hiltViewModel<CountryListViewModel>()
                val state by viewModel.state.collectAsState()

                CountryListScreen(
                    state = state,
                    onSelectCountry = viewModel::selectCountry,
                    onDismissCountryDialog = viewModel::dismissCountryDialog
                )
            }
        }
    }
}