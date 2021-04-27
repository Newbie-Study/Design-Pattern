package greentea.decorator

class FullSelfDriving(private val tesla: Tesla) : OptionDecorator() {

    override fun getOptionList(): MutableList<String> {
        // 옵션 중복에 대한 체크를 공통적으로 처리하는 방법?
        return tesla.getOptionList().apply { add("FSD") }
    }

    override fun cost(): Int {
        return tesla.cost() + 1000
    }
}