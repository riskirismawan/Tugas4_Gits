fun main() {
    while (true) {
        print("Masukan kata : ")
        // get input from user
        val word = readLine()
        if (!word.isNullOrEmpty()) {
            if (palindrome(word)) println("Palindrom")
            else println("Tidak palindrom")
        }
    }
}

/**
 * Palindromic function
 * @param [word] is a String that will check whether it is a palindrome
 * and will return Boolean
  */
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