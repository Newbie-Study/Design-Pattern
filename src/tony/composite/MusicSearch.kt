package tony.composite

class MusicSearch : SearchEngine() {
    private val songs = hashMapOf<String, MutableList<String>>()

    override fun search(keyword: String): Boolean {
        if (songs[keyword] != null) {
            songs[keyword]!!.forEach { println("$keyword - $it") }
            return true
        }
        return false
    }

    fun addSong(singer: String, song: String) {
        if (songs[singer] == null) {
            songs[singer] = mutableListOf()
        }
        songs[singer]!!.add(song)
    }
}