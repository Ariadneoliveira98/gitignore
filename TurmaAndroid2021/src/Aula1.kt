fun main() {


// val imutavel - nao consigo alterar
// var mutavel - consigo alterar

    val inteiro: Int = 1
    val inteiro2 = 2
    val numeroUltraGrande: Long = 28947287382732
    val texto = "cesar"
    val ehmMaior = true
    val decimalMenor: Float = 2.5f
    val decimalMenor1 = 2.5f
    val decimalMaior = 2.829839274247

    //println(2-2)
    //println(2 <= 1)
    //println(2 == 2)
    //println (5 % 2)
    //println(9 % 3)

    /* E    OU
       V V V
       V F F
       F V F
       F F F


     */

    //println(false && false)
    //println(true && true)
    //println(false && true)

    //println(! false)
    //println("Hello World!")
    // listOf lista imutavel pra ser imutavel tem que usar mutablelistof
    //var pets = listOf("dog","gato","tartaruga","rato", "vaca")
    //val petsMutavel = mutableListOf("dog", "gato", "tartaruga", "rato")
    //petsMutavel.add("vaca")
    //println(petsMutavel.last())
    //print(petsMutavel.first())
    //pets = listOf("cobra", "leao")

    val numero = 2
    when {
        numero < 3 -> {
           // print("menor que 3")
        }
        numero > 3 -> {
           // print("maior que 3")
        }
        numero == 1 -> {
           // print("numero é um")
        }
        else -> {
           // print("caiu no else")
        }

    }
    for(num in 1..10 step 3){
        //println(num)
    }

    var x = 0
    while(x < 2){
        //println(x)
        x++
    }
}
