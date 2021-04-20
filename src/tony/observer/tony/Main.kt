package tony.observer.tony

fun main() {
    val dogeCoin = DogeCoin()
    val user1 = User("김철수")
    val user2 = User("홍길동")

    dogeCoin.setDogeCoin(470)
    dogeCoin.setDogeCoin(483)
    dogeCoin.addObserver(user1)

    dogeCoin.setDogeCoin(492)
    dogeCoin.setDogeCoin(512)
    dogeCoin.addObserver(user2)
    dogeCoin.setDogeCoin(551)
    dogeCoin.setDogeCoin(592)
    dogeCoin.removeObserver(user2)

    dogeCoin.setDogeCoin(521)
    dogeCoin.setDogeCoin(472)
    dogeCoin.setDogeCoin(431)
    dogeCoin.setDogeCoin(311)
    dogeCoin.setDogeCoin(181)
}