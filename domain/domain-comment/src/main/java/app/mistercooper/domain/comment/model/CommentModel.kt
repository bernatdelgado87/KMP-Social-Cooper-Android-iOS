package app.mistercooper.domain.comment.model

import app.mistercooper.domain.common.feature.user.model.UserModel
import java.util.Date

data class CommentModel(val text: String,
                        val date: Date,
                        val user: UserModel,
                        val relatedComment: CommentModel? = null)