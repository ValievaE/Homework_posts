class WallService {
    var id = 0
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val copy = post.copy(id = id++)
        posts += copy
        return copy
    }

    fun updateById(id: Int): Boolean {
        posts.forEachIndexed { index, post ->
            if (post.id == id) {

                val copy = post.copy(
                    id = 1,
                    ownerId = 0,
                    fromId = 1,
                    createdBy = 1,
                    date = "20/12/2020",
                    text = "post second",
                    replyOwnerId = 1,
                    replyPostId = 1,
                    friendsOnly = true,
                    commentsCount = 0,
                    likesCount = 0,
                    copyright = "copiright",
                    repostsCount = 0,
                    viewsCount = 0,
                    postType = "reply",
                    signerId = 0,
                    canPin = false,
                    canDelete = false,
                    canEdit = false,
                    isPinned = false,
                    isFavorite = false,
                    postponedId = 0,
                    markedAsAds = false
                )
                posts[index] = copy
                return true
            }
        }
        return false
    }

}


