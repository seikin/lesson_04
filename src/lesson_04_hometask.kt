/*ДЗ #04 Alexey Seikin

Создать два списка равного размера и с помощью пройденного материала написать программу,
которая в цикле перебирает оба списка и используя строковый шаблон выводит в консоль пары значений,
где первое значение берется из первого списка, а второе значение из второго списка.

Пример входных данных:
val list1 = listOf("Android", "Kotlin", 17, 'x', 176L, 90F, 20.9)
val list2 = listOf(15, "Ferrari", 90, "String", 1F, 'F', "Mustang")

Пример вывода: Android:15,Kotlin:Ferrari,17:90,x:String,176:1.0,90.0:F,20.9:Mustang
*/

fun main(){
    println("Hello Kotlin")
    val list01 = listOf<Any>(10, 11F, 12.5, 'T', "В","Ксанад","чертог","Кубла")
    val list02 = listOf<Any>("Integer", "Float", "Double", "Char", "стране","благословенной","построил","Хан")
    var i = 0
    while (i <= list01.size - 1){
        print("${list01[i]}" + ":" + "${list02[i]}")
        if (i < list01.size - 1)
            print(",")
            i++
    }
}