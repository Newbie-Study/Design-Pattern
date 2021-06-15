package finn.composite

fun main() {
    val serverDeveloper = ServerDeveloper()
    val frontDevelop = FrontDevelop()
    val cto = CTO()

    val iconDesigner = IconDesigner()
    val bannerDesigner = BannerDesigner()
    val design = Design()

    cto.addDeveloper(serverDeveloper)
    cto.addDeveloper(frontDevelop)

    design.addDesigner(iconDesigner)
    design.addDesigner(bannerDesigner)

    cto.work()
    println("===")
    serverDeveloper.work()
    println("===")
    frontDevelop.work()
    println("===")

    design.work()
    println("===")
    iconDesigner.work()
    println("===")
    bannerDesigner.work()
    println("===")
}

/*                  Composite Pattern
 *
 *                         company -> composite
 *                      /         \
 *                    CTO         design   -> composite
 *                  /    \         /     \
 *         leaf <- tf   client    banner icon
 *                      /   \
 *                   one    two -> leaf
 */