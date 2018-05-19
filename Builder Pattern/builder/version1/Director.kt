package builder.version1

/**
 * 导演
 *
 * @param builder Builder对象
 */
class Director(private val builder: Builder) {

    /**
     * 构建文档
     */
    fun construct() {
        //创建标题
        builder.makeTitle("Greeting")
        //创建字符串
        builder.makeString("Switch")
        //创建条目
        val one = ArrayList<String>()
        //添加条目
        one.add("早上好")
        one.add("中午好")
        one.add("晚上好")
        builder.makeItems(one)

        //创建字符串
        builder.makeString("Kity")

        //创建条目
        val two = ArrayList<String>()
        two.add("1+1")
        two.add("2+2")
        two.add("3+3")
        builder.makeItems(two)

        //创建完成，关闭文档
        builder.close()
    }

}