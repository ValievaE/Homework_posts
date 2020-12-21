
data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: String,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val commentsCount: Int,
    val likesCount: Int,
    val copyright: String,
    val repostsCount: Int,
    val viewsCount: Int,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    val markedAsAds: Boolean
)

