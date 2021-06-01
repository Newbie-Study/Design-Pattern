package tony.adapter.example

interface PathFinder {
    fun findPath()
}

class PathFindAdapter(private val bfs: BfsAlgorithm): PathFinder {
    override fun findPath() {
        bfs.run()
        println("길 찾기 시작")
    }
}