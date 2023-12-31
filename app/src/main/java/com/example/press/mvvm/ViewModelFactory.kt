package com.example.press.mvvm




import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            return ProfileViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(JadwalViewModel::class.java)) {
            return JadwalViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(RiwayatPresensiViewModel::class.java))
            return RiwayatPresensiViewModel(repository) as T
        if (modelClass.isAssignableFrom(DetailRiwayatPresensiViewModel::class.java))
            return DetailRiwayatPresensiViewModel(repository) as T
        if (modelClass.isAssignableFrom(ScanViewModel::class.java))
            return ScanViewModel(repository) as T

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}




