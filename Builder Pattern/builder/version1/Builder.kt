package builder.version1

/**
 * 建造者
 */
abstract class Builder {

    /**
     * 创建标题
     *
     * @param title 标题
     */
    abstract fun makeTitle(title: String)

    /**
     * 创建字符串
     *
     * @param str 字符串
     */
    abstract fun makeString(str: String)

    /**
     * 创建条目
     *
     * @param items 条目列表
     */
    abstract fun makeItems(items: List<String>)

    /**
     * 关闭
     */
    abstract fun close()

}