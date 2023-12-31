package freemap.openglwrapper

data class Point(var x: Float=0.0f, var y: Float=0.0f, var z: Float=0.0f)

class Camera(dx: Float=0.0f, dy: Float=0.0f, dz: Float=0.0f) {
    var rotation = 0.0f
    var position = Point(dx, dy, dz)

    fun rotate(degrees: Float) {
        rotation += degrees
        if (rotation > 180) {
            rotation -= 360
        } else if (rotation < -180) {
            rotation += 360
        }
    }

    fun translate(dx: Float, dy: Float, dz: Float) {
        position.x += dx
        position.y += dy
        position.z += dz
    }
}