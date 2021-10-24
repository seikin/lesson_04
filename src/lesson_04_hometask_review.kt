fun main(){
    val list01 = listOf<Any>(10, 11F, 12.5, 'T', "В","Ксанад","чертог","Кубла")
    val list02 = listOf<Any>("Integer", "Float", "Double", "Char", "стране","благословенной","построил","Хан")

    for (j in list01.indices){
        println("${list01[j]} : ${list02[j]}, ")

    }

}