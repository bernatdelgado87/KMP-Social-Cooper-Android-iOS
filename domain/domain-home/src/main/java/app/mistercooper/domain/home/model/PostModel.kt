package app.mistercooper.domain.home.model

import app.mistercooper.domain.common.feature.user.model.UserModel

data class PostModel(
    val id: Long,
    val user: UserModel,
    val description: String?,
    val imageUrl: String,
    val totalLikes: Int,
    val totalComments: Int,
    val hasLiked: Boolean
)