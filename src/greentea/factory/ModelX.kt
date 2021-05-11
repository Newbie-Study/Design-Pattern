package greentea.factory

class ModelX(factory: GigaFactory) : Tesla() {

    init {
        battery = factory.putBattery()
        ecoFriendliness = factory.createEcoFriendlyMark()
        productionPlace = factory.getFactoryBranchMark()
    }
}