package greentea.factory

class ShanghaiFactory : GigaFactory {
    override fun putBattery(): String = "CATL"

    override fun createEcoFriendlyMark(): String = ""

    override fun getFactoryBranchMark(): String = "Shanghai"

}