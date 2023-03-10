package com.example.myapplication.model

sealed class ValidationResult{
    data class Empty(val errorMessage:String):ValidationResult()
    data class InValid(val errorMessage:String):ValidationResult()
    object Valid:ValidationResult()
}
