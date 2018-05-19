package builder.version3

/**
 * 具体建造者-工人-盖楼房
 */
class LouFangBuilder : HouseBuilder {

    private val house = House()

    override fun doFoundation() {
        house.foundation = "盖楼房的地基就打十米深"
    }

    override fun doFrame() {
        house.frame = "楼房的框架要使用非常坚固钢筋混凝土"
    }

    override fun doPouring() {
        house.pouring = "楼房拿个罐车把框架拿混凝土灌满即可"
    }

    override fun createHouse(): House {
        return house
    }
}