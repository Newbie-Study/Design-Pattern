package tony.composite

/*
         통합 검색
        /       \
     뉴스 검색  음악 검색
     /   \
  스포츠  경제
 */

fun main() {
    val economy = EconomyNewsSearchEngine()
    val sports = SportsNewsSearchEngine()
    val news = NewsSearch()
    val music = MusicSearch()
    economy.addContents("카카오", "'역전 드라마' 카카오, 플랫폼 대장株 '우뚝'…네이버 제쳤다")
    economy.addContents("네이버", "\"정말 오늘이 최저가?\" 카카오 무섭게 뛴다…장중 네이버 넘어 시총 3위 등극")
    sports.addContents("축구", "남자 올림픽 축구대표팀, 가나 친선전 2-1 승리")
    news.addSearchEngines(economy)
    news.addSearchEngines(sports)

    music.addSong("BTS", "Butter")
    music.addSong("BTS", "Dynamite")
    music.addSong("BTS", "Savage Love (Laxed-Siren Beat) (BTS Remix)")
    music.addSong("헤이즈", "헤픈 우연")
    music.addSong("헤이즈", "처음처럼 (Feat. 개리)")
    music.addSong("aespa", "Next Level")

    val naver = NaverSearch()
    naver.addSearchEngine(news)
    naver.addSearchEngine(music)

    println("========통합 검색=========")
    naver.search("카카오")
    naver.search("BTS")
    println()

    println("========음악 검색=========")
    music.search("aespa")
    println()

    println("========경제 뉴스 검색=========")
    economy.search("네이버")
}