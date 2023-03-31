fun main(){
//val words = mutableListOf(40,62,2,8,7,9,4,8)
    println(listOfstring(mutableListOf("house","car","garage","lorry","train","jog","laptop")))
    personObjects()
    carObjects()
}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun listOfstring(words:List<String>):List<String>{
    val indices = mutableListOf<String>()
for (word in words){
    if (words.indexOf(word)%2 ==0)
        indices.add(word)
    }
    return indices
}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

//data class peopleHeight(var totalheight:Double, var averageheight:Double)
//fun heights(height:List<Double>):peopleHeight{
//
//
//}









//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String, var age:Int,var height:Double, var weight:Double)
fun personObjects(){
    val person1 = Person("robert",21,5.2,56.0)
    val person2 = Person("kate",17,5.0,48.9)
    val person3 = Person("herbert",22,6.2,69.3)
    val person4 = Person("junior",8,3.7,29.3)

    val person = listOf(person1,person2,person3,person4)
     var sortedPerson = person.sortedByDescending { x->x.age }
    println(sortedPerson)
}


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.



//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration:String,var mileage:Double)
fun carObjects(){
    val subaru = Car("KBC34P",300.9)
    val prado = Car("KDC45K",409.5)
    val jeep = Car("KAF69B",504.5)

    val car = mutableListOf(subaru,prado,jeep)
    val sumMilegae =car.sumOf { x->x.mileage }
    val t = sumMilegae/car.size
    println(t)
}