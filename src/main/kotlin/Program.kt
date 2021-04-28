import AllExercises.MigratoryBirds
import kotlin.contracts.ExperimentalContracts

@ExperimentalContracts
fun main(){
    val array = arrayOf(1,2,2,0,0,0)
    val migratoryBirds = MigratoryBirds()

    println(migratoryBirds.getResult(array))
}