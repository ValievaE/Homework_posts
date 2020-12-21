import org.junit.Assert.*
import org.junit.Test

class MainKtTest {


    private val service = WallService()

    @Test
    fun addPost() {
        val post = Post(
            1,
            0,
            0,
            0,
            "20 / 12 / 2020",
            "post first",
            0,
            0,
            false,
            0,
            0,
            "copiright",
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            0,
            false
        )

        service.add(post)
        assertTrue(post.id != 0)
    }

    @Test
    fun updateExisting() {
        val post = Post(
            0,
            0,
            0,
            0,
            "20 / 12 / 2020",
            "post first",
            0,
            0,
            false,
            0,
            0,
            "copiright",
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            0,
            false
        )
        service.add(post)
        assertTrue(service.updateById(0))

    }

    @Test
    fun updateUnexisting() {
        val post = Post(
            0,
            0,
            0,
            0,
            "20 / 12 / 2020",
            "post first",
            0,
            0,
            false,
            0,
            0,
            "copiright",
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            0,
            false
        )
        service.add(post)
        assertFalse(service.updateById(5))

    }


}