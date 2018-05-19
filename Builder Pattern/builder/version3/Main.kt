package builder.version3

fun main(args: Array<String>) {

    //方式一、客户自己盖房子，亲力亲为
    println("========客户自己建房子，必须知道盖房的细节========")
    val house = House()
    house.foundation = "用户自己建造房子：打地基"
    house.frame = "用户自己建造房子：盖框架"
    house.pouring = "用户自己建造房子：浇筑"
    println(house)

    //方式二、客户找一个建造者盖房子「充当包工头角色」，但是要知道如何盖房子「调用建造者盖房子的顺序」
    println("========客户直接找盖房子的工人「建造者」，客户要调用建造者方法去盖房子，客户必须得知道房子如何造========")
    val pingFangBuilder = PingFangBuilder()
    pingFangBuilder.doFoundation()
    pingFangBuilder.doFrame()
    pingFangBuilder.doPouring()
    val pingFang = pingFangBuilder.createHouse()
    println(pingFang)

    //方式三、使用建造者模式，找一个设计师「设计师拉一帮建造者去干活」，告诉他我想要什么样的房子，最后客户只问设计师要房子即可
    println("========客户直接找一个设计师，设计师统一指挥建造者盖房子，房子杂盖，客户不关心，最后只是找设计师要房子即可========")
    val pfBuilder = PingFangBuilder()
    val houseDirector = HouseDirector()
    houseDirector.buildHouse(pfBuilder)
    val pfHouse = pfBuilder.createHouse()
    println(pfHouse)

}