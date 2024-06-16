package com.surajkamble.machine_coding_app.domain.entity

import androidx.compose.ui.graphics.vector.ImageVector

data class UserEntity(
    val userName: String,
    val userImage: ImageVector,
    val userUpiId: String
)
