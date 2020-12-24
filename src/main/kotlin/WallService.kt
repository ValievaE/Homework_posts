object WallService {

    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val copy = post.copy(id = post.id++)
        posts += copy
        return copy
    }

    fun update(post: Post): Boolean{

        posts.forEachIndexed { index, post ->
            if (posts[index].id == add(post).id) {
                val copy = post.copy()
                posts[index] = copy
                println(posts[index].id)
                println(post.id)

                return true
            }
        }
        return false
    }

}


