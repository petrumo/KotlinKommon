package sample

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin Rocks on ${platformName()}"
}

fun buildModel(id: String, favorite: Boolean, title: String): Model {
    return Model(id, favorite, title)
}

fun useMode(model: Model): String {
    return "Kotlin Model ${model.title}"
}