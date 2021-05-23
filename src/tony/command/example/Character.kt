package tony.command.example

// Receiver
abstract class Character {
    abstract var attack: Int
    abstract var defense: Int
    abstract var speed: Int

    abstract fun skill1()
    abstract fun skill2()
    abstract fun skill3()
    abstract fun ultimateSkill()
}

class KaiSa : Character() {
    override var attack: Int = 59
    override var defense: Int = 28
    override var speed: Int = 335

    override fun skill1() {
        println("카이사가 공허 에너지 광선을 발사해 처음으로 적중한 적에 대한 절대 시야를 얻고 광선에 적중된 대상은 플라즈마 중첩이 2회 쌓입니다. 대상은 중첩에 비례한 마법 피해를 입습니다.")
    }

    override fun skill2() {
        println("카이사가 공허 에너지 광선을 발사해 처음으로 적중한 적에 대한 절대 시야를 얻고 광선에 적중된 대상은 플라즈마 중첩이 2회 쌓입니다. 대상은 중첩에 비례한 마법 피해를 입습니다.")
    }

    override fun skill3() {
        println("카이사가 플라즈마 표식이 남은 적 챔피언 근처로 빠르게 돌진하며, 2초 동안 피해를 흡수하는 보호막을 얻습니다.")
    }

    override fun ultimateSkill() {
        println("카이사가 플라즈마 표식이 남은 적 챔피언 근처로 빠르게 돌진하며, 2초 동안 피해를 흡수하는 보호막을 얻습니다.")
    }
}

class LeeSin : Character() {
    override var attack: Int = 70
    override var defense: Int = 36
    override var speed: Int = 345

    override fun skill1() {
        println("리 신이 불협화음으로 된 음파를 발사하여 처음 적중한 적에게 물리 피해를 입히고 해당 적에 대한 절대 시야를 얻습니다. 다음 3초 안에 재사용할 수 있습니다.")
    }

    override fun skill2() {
        println("리 신이 아군이나 와드를 향해 돌진합니다. 대상이 챔피언일 경우 해당 아군과 자신에게 2초 동안 보호막을 씌우고, 이 스킬의 재사용 대기시간이 50% 감소합니다. 3초 안에 재사용할 수 있습니다.")
    }

    override fun skill3() {
        println("리 신이 바닥을 내리쳐 마법 피해를 입히고 4초 동안 은신한 적을 드러내는 충격파를 발생시킵니다. 스킬이 적에게 명중하면 다음 3초 안에 스킬을 재사용할 수 있습니다")
    }

    override fun ultimateSkill() {
        println("리 신이 강력한 돌려차기로 적 챔피언을 롤아이콘-군중제어 넉백뒤로 날려버리고, 물리 피해를 입힙니다. 날아간 대상과 부딪힌 적은 잠시 롤아이콘-군중제어 에어본공중에 떠오르고 날아간 대상 추가 체력에 해당하는 물리 피해를 입습니다.")
    }
}