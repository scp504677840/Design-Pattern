package builder

class Computer private constructor(builder: ComputerBuilder) {

    var cpu: String? = null
    var hardDisk: String? = null
    var mainBoard: String? = null
    var memory: String? = null

    override fun toString(): String {
        return "Computer(cpu=$cpu, hardDisk=$hardDisk, mainBoard=$mainBoard, memory=$memory)"
    }

    class ComputerBuilder {

        private var cpu: String? = null
        private var hardDisk: String? = null
        private var mainBoard: String? = null
        private var memory: String? = null

        fun setCPU(cpu: String): ComputerBuilder {
            this.cpu = cpu
            return this
        }

        fun setHardDisk(hardDisk: String): ComputerBuilder {
            this.hardDisk = hardDisk
            return this
        }

        fun setMainBoard(mainBoard: String): ComputerBuilder {
            this.mainBoard = mainBoard
            return this
        }

        fun setMemory(memory: String): ComputerBuilder {
            this.memory = memory
            return this
        }

        fun build(): Computer {
            val computer = Computer(this)
            computer.cpu = cpu
            computer.hardDisk = hardDisk
            computer.mainBoard = mainBoard
            computer.memory = memory
            return computer
        }

    }

}