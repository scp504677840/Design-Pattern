package builder.version2

fun main(args: Array<String>) {

    //装机员小美
    val assemblerBuilder = AssemblerBuilder()

    //老板把小明的需求转给小美
    val director = Director(assemblerBuilder)

    //老板最后拿到成品机子，工作全由小美去做
    val computer = director.createComputer("Intel", "2TB", "技嘉", "16GB")

    println(computer)
}