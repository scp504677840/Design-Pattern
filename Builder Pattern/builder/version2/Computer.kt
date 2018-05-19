package builder.version2

/**
 * 创建被建造的对象电脑
 */
class Computer {

    /**
     * CPU
     */
    var cpu: String? = null

    /**
     * 硬盘
     */
    var hardDisk: String? = null

    /**
     * 主板
     */
    var mainBoard: String? = null

    /**
     * 内存
     */
    var memory: String? = null

    override fun toString(): String {
        return "Computer(cpu=$cpu, hardDisk=$hardDisk, mainBoard=$mainBoard, memory=$memory)"
    }


}