package builder.version2

/**
 * 具体的建造者，这里是商场的一个装机人员
 */
class AssemblerBuilder : Builder {

    /**
     * 有一台最基本的电脑（只有一个电脑空壳，其它的什么都没有）
     */
    private val computer = Computer()

    override fun setupCPU(cpu: String) {
        computer.cpu = cpu
    }

    override fun setupHardDisk(hardDisk: String) {
        computer.hardDisk = hardDisk
    }

    override fun setupMainBoard(mainBoard: String) {
        computer.mainBoard = mainBoard
    }

    override fun setupMemory(memory: String) {
        computer.memory = memory
    }

    override fun createComputer(): Computer {
        return computer
    }

}