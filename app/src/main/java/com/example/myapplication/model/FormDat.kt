package com.example.myapplication.model

import java.time.Year

class FormDat (private var studentID:String,
               private val year:String,
               private var semester:String,
               private var agreement:Boolean, ){
    fun validateStudentID():ValidationResult {
        return if(studentID.isEmpty())
        {
            ValidationResult.Empty("Student IS is empty")
        }
        else if (!studentID.startsWith("IT"))
        {
            ValidationResult.InValid("should be startingwith IT")
        }
        else if (studentID.length != 10)
        {
            ValidationResult.InValid("Student should have 10 characters")
        }
        else
        {
            ValidationResult.Valid
        }
    }
    fun validateYear():ValidationResult{
        return if(year.isEmpty())
        {
           ValidationResult.Empty ("year is empty")
        }
        else
        {
            ValidationResult.Valid
        }


    }
    fun validateSemester():ValidationResult{

        return if(semester.isEmpty()){
            ValidationResult.Empty("semester is empty")
        }else
        {
            ValidationResult.Valid
        }

    }
    fun validateAgreement():ValidationResult{
       return if(!agreement.not())
       {
           ValidationResult.Empty("must agree")
       }
        else
       {
           ValidationResult.Valid
       }
    }
}
