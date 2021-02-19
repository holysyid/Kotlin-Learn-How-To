fun main() {
    println("bismillah kotlin")
    //this is my exercise with kotlin
    /*fundamental kotlin
    i assume myself can do basic code
     */

    //Step One, Understanding the Declaration
    //declaration()
    //step Two, the way u write function in kotlin
    //println(setUser("budi",22))
    println(setUsertoo("budi",22))

}
fun declaration(){
    //this is how you declare simple things in kotlin
    var a : String = "kotlin"
    println(a)
    var c : Int?//this is how you do the null exception in kotlin right?
    c = null
    println(c)

    //in kotlin u also can do this, since its statically typed programming languange
    var x = "kamu"

    //to avoid error because of null, use ? after the data type
    var b : String?
    b = null
    println(b)

    //since val is immutable, u cannot do this
    //val x = 12
    // x = 77 //this will be some error :(

    //u can also do something like this
    //print(x+" "+a)
}

//do u know that function also can write like this
fun setUser(name : String, age : Int):String = "yourname is $name, and your age is $age"
//it called expression, u must use = in order to declare the value of ur function

//or becuse of this kinda thing is expression, u dont really have to declare the data type of the function!
fun setUsertoo(name : String, age : Int) = "yourname is $name, and your age is $age"

fun Array(){
 //lads this is how you write
}