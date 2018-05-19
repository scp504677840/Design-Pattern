package builder.version3

/**
 * 房子
 */
class House {

    /**
     * 打地基
     */
    var foundation: String? = null

    /**
     * 盖框架
     */
    var frame: String? = null

    /**
     * 浇筑
     */
    var pouring: String? = null

    override fun toString(): String {
        return "House(foundation=$foundation, frame=$frame, pouring=$pouring)"
    }


}