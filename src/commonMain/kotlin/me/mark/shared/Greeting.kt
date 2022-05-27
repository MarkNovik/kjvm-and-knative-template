package me.mark.shared


object Greeting {
    fun greetPlatform(): String {
        return "Hello, ${Platform.platform}!"
    }
}
