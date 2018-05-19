package builder.version2

interface Builder {

    /**
     * 安装CPU
     *
     * @param cpu CPU
     */
    fun setupCPU(cpu: String)

    /**
     * 安装硬盘
     *
     * @param hardDisk 硬盘
     */
    fun setupHardDisk(hardDisk: String)

    /**
     * 安装主板
     *
     * @param mainBoard 主板
     */
    fun setupMainBoard(mainBoard: String)

    /**
     * 安装内存
     *
     * @param memory 内存
     */
    fun setupMemory(memory: String)

    /**
     * 创建电脑
     *
     * @return 电脑
     */
    fun createComputer(): Computer

}