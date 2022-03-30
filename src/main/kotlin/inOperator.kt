fun main (){
    println(isLetter('a'))

    print(isNotDigit('x'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'