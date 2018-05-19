package builder.version2

/**
 * 声明一个导演类「指挥者，这里可以装电脑的老板」，用来指挥组装过程，也就是组装电脑的流程
 */
class Director(private val builder: Builder) {

    /**
     * 组装电脑
     *
     * @param cpu CPU
     * @param hardDisk 硬盘
     * @param mainBoard 主板
     * @param memory 内存
     */
    fun createComputer(cpu: String, hardDisk: String, mainBoard: String, memory: String): Computer {
        builder.setupCPU(cpu)
        builder.setupHardDisk(hardDisk)
        builder.setupMainBoard(mainBoard)
        builder.setupMemory(memory)
        return builder.createComputer()
    }

}