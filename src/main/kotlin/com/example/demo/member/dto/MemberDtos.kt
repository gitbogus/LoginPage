package com.example.demo.member.dto

import com.example.demo.common.status.Gender
import java.time.LocalDate


data class MemberDtoRequest(
    val id: Long?,
    val loginID: String,
    val password: String,
    val name: String,
    val birthDate: LocalDate,
    val gender: Gender,
    val email: String,
)
