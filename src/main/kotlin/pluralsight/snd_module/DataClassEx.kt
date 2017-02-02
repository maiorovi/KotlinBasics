package pluralsight.snd_module

data class DataClassEx(val param1: String, val param2:String, val id:Int)


fun main(args:Array<String>) {
    val dataClassObject = DataClassEx("param1", "param2" , 5)

    println(dataClassObject)

    //deconstruction

    val (param1, param2, id) = dataClassObject

    println("User is $param1, and param2 is $param2 and their id is $id")
}