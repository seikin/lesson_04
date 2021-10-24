//Упражнения занятия #04
fun main(){
    /* Строковый Шаблон. String Template */
    val hello = "Hello"
    val kotlin = "Kotlin"
    println("$hello $kotlin")
    println("result: ${hello + kotlin}")
    val inv = "Inv"
    println("${inv}olta")

    val array = arrayOf(hello, kotlin, inv)
    println("${array[0]}")

    /* Списки. Неизменяемые. Lists */
    val anyList = listOf<Any>(1.5, 10, 15F, "Involta", 'T' ,150L)
    val intList = listOf<Int>(10, 15, 20, 25, 30, 35)
    println("${anyList[0]}")

    /* Списки изменяемые. Mutable Lists */
    val anyMutableList = mutableListOf(1.5, 10, 15F, "Involta", 'T' ,150L)
    println("${anyMutableList[0]}")
    anyMutableList[0] = "Science"
    println("${anyMutableList[0]} ${anyMutableList[3]}")

    /* Добавление значений в списки */
    anyMutableList.addAll(intList)
    anyMutableList.add(1, "kotlin")

    /* Удаление значений из списка по имени (remove) и по индексу (removeAt)*/
    anyMutableList.remove("Involta")
    anyMutableList.removeAt(9)

    for(i in anyMutableList.indices){
        println("$i:${anyMutableList[i]}")
    }
}