fun main (){
    var man = Person ("Steve Maina", 30, "Doctor", "Kenyan")
    man.introduction()
    println(man.name)
    println(man.nationality)
    println(man.age)
    println(man.occupation)
    var human = Person ("Anne",23,"Nurse","Ugandan")
    println(human.name)
    println(human.age)
    //creating objects from the second class
    var nissan = Car("Corona", "34c",45000,0)
    println(nissan.startSpeed(70))
    println(nissan.speed)
}
//Object Oriented Programs
class Person( var name:String,var age:Int,var occupation:String,var nationality:String) {
    fun introduction() {
        println("I am a man")//behavior of the class template
    }
}
class Car (var make :String, var model:String, var price :Int, var speed:Int){
    fun startSpeed (accelerator:Int):Int{
        speed = speed + accelerator
        return speed
    }
}


