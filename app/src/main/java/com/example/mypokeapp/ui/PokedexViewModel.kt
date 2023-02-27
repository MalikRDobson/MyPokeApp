package com.example.mypokeapp.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mypokeapp.data.model.pokedex.PokedexModelList
import com.example.mypokeapp.data.repository.Repository
import com.example.mypokeapp.util.ResponseType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokedexViewModel @Inject constructor(private val repository: Repository): ViewModel(){
    private val _pokedexResult = mutableStateListOf<ResponseType<PokedexModelList>>()
    val pokedexResult: SnapshotStateList<ResponseType<PokedexModelList>> = _pokedexResult

    init{
        getPokedexModelList()
    }
    fun getPokedexModelList(){
        viewModelScope.launch{
            _pokedexResult.add(ResponseType.Loading())
            val response = repository.getPokedexList()
            if(response.isSuccessful){
                _pokedexResult.add(ResponseType.Success(response.body()!!))
            }
            else{
                _pokedexResult.add(ResponseType.Error(response.message()))
            }
        }
    }
}
