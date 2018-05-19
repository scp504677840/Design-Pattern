package builder.version3

/**
 * 房子设计师
 */
class HouseDirector {

    /**
     * 指挥包工头
     */
    fun buildHouse(houseBuilder: HouseBuilder){
        //打地基
        houseBuilder.doFoundation()
        //盖框架
        houseBuilder.doFrame()
        //浇筑
        houseBuilder.doPouring()
    }

}