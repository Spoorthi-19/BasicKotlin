import java.util.*

fun isAnagram(str1: String, str2: String): Boolean{
    //length of the strings must be equal
    if(str1.length != str2.length){
        return false
    }
    val array1 = str1.toCharArray()
    val array2 = str2.toCharArray()

    Arrays.sort(array1)
    Arrays.sort(array2)

    // sorting the character arrays to check all the characters
    val sorted1 = String(array1)
    val sorted2 = String(array2)
    return sorted1==sorted2
    // returns true or false as the output
}


fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    //input from the user
    println("Enter first string: ")
    val str1: String = s.nextLine()

    //enter both the strings
    println("Enter second string:")
    val str2: String = s.nextLine()

    if(isAnagram(str1,str2)){
        println("They are anagrams")
    }
    else{
        println("They are not anagrams")
    }
}