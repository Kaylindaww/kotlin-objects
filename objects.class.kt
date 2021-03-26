fun main(){
    var me=Human("Akullu kay linda",22,65)
    me.Eat(7)
    var humanWeight=(65+7)
    println(humanWeight)
    me.speak("The food taste so delicious.")
    var birthday=(22+1)
    println(birthday)
    var student=Registration("Akullu","Kay linda","akullukaylinda@gmail.com","0788946683","akullu")
    println(student.firstName)
    println(student.email)
}
class Human(Name:String,Age:Int,Weight:Int,){
    fun Eat(foodWeight:Int){
        println("I am eating "+ foodWeight +" Kgs of food")
    }
    fun speak(speech:String){
        println("The food taste so delicious.")
    }
    fun birthday(age:Int){

    }


}
data class Registration(val firstName:String,val lastName:String,val email:String,val phoneNumber:String,var password:String){

}