import kotlin.math.*

fun main(args: Array<String>) {


}

fun precentChar(list: List<Any>):Any {
    var counter: Int = 0

    for (element in list)
        if (element !=("a") && element != "b") return -1
        else counter=list.count{it=="a"}                        //count "a" in the list

    return counter.toDouble() / list.size * 100                 //find the percent by divide the counter on list size *100
}



