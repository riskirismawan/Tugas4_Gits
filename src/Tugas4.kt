fun main() {
    while (true) {
        print("Masukan kata : ")
        val word = readLine()
        if (!word.isNullOrEmpty()) {
            if (palindrome(word)) println("Palindrom")
            else println("Tidak palindrom")
        }
    }
}

fun palindrome(word: String): Boolean {
    var index = word.length-1
    val array = arrayListOf<Char>()
    word.forEach { char -> array.add(char) }
    for (char in array) {
        if (char != word[index]) return false
        else index--
    }
    return true
}