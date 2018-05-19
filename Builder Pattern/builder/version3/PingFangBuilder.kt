package builder.version3

/**
 * 具体建造者-工人-盖平房
 */
class PingFangBuilder : HouseBuilder {

    private val house = House()

    override fun doFoundation() {
        house.foundation = "盖平房的地基"
    }

    override fun doFrame() {
        house.frame = "盖平房的框架"
    }

    override fun doPouring() {
        house.pouring = "盖平房不用浇灌，直接人工手刷就可以。"
    }

    override fun createHouse(): House {
        return house
    }

}