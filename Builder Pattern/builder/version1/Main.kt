package builder.version1

/**
 * 建造者模式中的角色
 *
 * Builder(建造者)
 * Builder角色负责定义用于生成实例的接口(API)。
 * Builder角色中准备了用于生成实例的方法。在案例中，由Builder类扮演此角色。
 *
 * ConcreteBuilder(具体的建造者)
 * ConcreteBuilder角色是负责实现Builder角色的接口的类(API)。
 * 这里定义了在生成实例时实际被调用的方法。
 * 此外，在ConcreteBuilder角色中还定义了获取最终生成结果的方法。
 * 在案例中，由TextBuilder类和HTMLBuilder类扮演此角色。
 *
 * Director(监工)
 * Director角色负责使用Builder角色的接口(API) 来生成实例。
 * 它并不依赖于ConcreteBuilder角色。
 * 为了确保不论ConcreteBuilder角色是如何被定义的，Director角色都能正常工作，
 * 它只调用在Builder角色中被定义的方法。在案例中，由Director类扮演此角色。
 *
 * Client(使用者)
 * 该角色使用了Builder模式(在GoF的书中，Builder模式并不包含Client角色)。在案例中，由测试类扮演此角色。
 */
fun main(args: Array<String>) {

    //具体建造者
    val textBuilder = TextBuilder()

    //监工
    val director = Director(textBuilder)

    //具体要做些什么事情
    director.construct()

    //要做什么？找建造者，这里写下准备要做什么事情。
    //怎么做？找具体建造者
    //做什么？找监工
    //结果呢？找具体建造者

    //获取结果
    val result = textBuilder.getResult()
    println(result)

}