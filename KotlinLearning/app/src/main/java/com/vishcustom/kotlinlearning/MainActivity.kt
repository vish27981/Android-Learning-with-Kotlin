package com.vishcustom.kotlinlearning

//data class

/*data class User(val id: Long, var name: String)

fun main(){
    val user1 =User (1,"Vishakha")

    user1.name="Akash"
    val user2 =User(1,"Akash")

    println(user1 == user2)

    println("User Details: $user1")

    val updateUser =user1.copy(name="vish prajapati")
    println(user1)
    println(updateUser)

    println(updateUser.component1())//print 1
    println(updateUser.component2())//print user2

    val(id,name)=updateUser
    println("id=$id,name=$name")

} */


// challange class for practice Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.
//
//Then add a function
//"chargeBattery"
//Which needs details about how much was charged.
//
//It should print out how much battery the phone had before, how much was charged and how much it has now.
//Create an Object of the class and call this function. Charge the battery by 30.

/*fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")

}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}*/

//Inheritance

//super class



//super/parent,base class of vehicle
/*open class Car (val name: String, val brand: String){
   open var range: Double =0.0
    fun extendRange(amount: Double){
        if(amount > 0)
            range +=amount
    }

    open fun drive(distance:Double){
        println("Drove for $distance KM")
    }
}

//sub/child/derived class of Car
class ElectricCar(name: String, brand: String, batteryLife:Double): Car(name, brand){
    override var range =batteryLife * 6
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity"  )
    }
     open fun drive(){
        println("Drove for $range KM on electricity")
    }

}

fun main(){
    var tesla = Car("A3","Audi")
    var audiA3 = ElectricCar("S-Model","Tesla",85.0)

    tesla.extendRange(200.0)
    tesla.drive()
    //polymorphism
    tesla.drive(200.0)
    audiA3.drive(200.0)
}
*/

//           Interface

/*interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The Drivable is breaking")
    }
}*/

//Array List

fun main(){
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.575757)
    myArrayList.add(14.556767)
    myArrayList.add(67.687676)
    myArrayList.add(55.678686)
    myArrayList.add(16.878887)

    var total = 0.0
    for( i in myArrayList){
        total += i
    }

    var average =total/myArrayList.size
    println("Average is " +average)
}