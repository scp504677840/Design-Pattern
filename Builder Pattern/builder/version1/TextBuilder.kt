package builder.version1

class TextBuilder : Builder() {

    /**
     * 文本保存对象
     */
    private val sb = StringBuilder()

    override fun makeTitle(title: String) {
        sb.append("==============================\n")
        sb.append("[$title]\n")
        sb.append("\n")
    }

    override fun makeString(str: String) {
        sb.append("》$str\n")
        sb.append("\n")
    }

    override fun makeItems(items: List<String>) {
        items.forEach { item: String? -> sb.append("》》》$item\n") }
        sb.append("\n")
    }

    override fun close() {
        sb.append("==============================\n")
    }

    /**
     * 获取结果
     *
     * @return 字符串结果集
     */
    fun getResult() = sb.toString()
}