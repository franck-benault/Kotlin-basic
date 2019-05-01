package net.franckbenault

fun max(a : Int , b : Int) : Int {
    return if (a>b) a else b
}

fun max2(a : Int , b : Int) = if (a>b) a else b

fun getLanguages() : List<String> {
    val languages = arrayListOf("French", "English")

    //the reference is immutable not the content
    languages.add("Dutch")

    return languages
}
