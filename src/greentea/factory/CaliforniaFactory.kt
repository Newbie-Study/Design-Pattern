package greentea.factory

class CaliforniaFactory : GigaFactory {
    override fun putBattery(): String = "LGEnergySolution"

    override fun createEcoFriendlyMark(): String = "ECO"

    override fun getFactoryBranchMark(): String = "Cali"

}