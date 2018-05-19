package builder.version3

/**
 * 抽象建造者-包工头
 */
interface HouseBuilder {

    /**
     * 打地基
     */
    fun doFoundation()

    /**
     * 盖框架
     */
    fun doFrame()

    /**
     * 浇筑
     */
    fun doPouring()

    /**
     * 盖房成功
     *
     * @return 房子
     */
    fun createHouse(): House

}