package greentea.factory

class Model3(factory: GigaFactory) : Tesla() {

    init {
        battery = factory.putBattery()
        ecoFriendliness = factory.createEcoFriendlyMark()
        productionPlace = factory.getFactoryBranchMark()
    }

}