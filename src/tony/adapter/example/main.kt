package tony.adapter.example

fun main() {
    val bfs = BfsAlgorithm()

    // bfs 알고리즘 문제 해결
    bfs.run()

    // bfs 알고리즘으로 길 찾기 문제 해결
    val adapter = PathFindAdapter(bfs)
    adapter.findPath()
}