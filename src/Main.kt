fun main() {

    val adminRole = UserRole.ADMIN
    val editorRole = UserRole.EDITOR
    val viewerRole = UserRole.VIEWER
    println("Role: ${adminRole}")
    println("Role: ${editorRole}")
    println("Role: ${viewerRole}")
}
enum class UserRole (val accessLevel:Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)
}
fun u