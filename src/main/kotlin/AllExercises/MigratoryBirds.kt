package AllExercises

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

class MigratoryBirds() {
    @ExperimentalContracts
    fun getResult(array: Array<Int>) : Int {
        var map: MutableMap<Int, Int> = mutableMapOf()
        var maxEntry: Map.Entry<Int, Int>? = null

        array.forEach { arrayValue ->
            val value = map.putIfAbsent(arrayValue, 1)
            value?.let { map[arrayValue] = value+1 }
        }

        map = map.toSortedMap()

        map.forEach {
            if(maxEntry!=null){
                maxEntry = if(it.value > maxEntry!!.value) it else maxEntry
            } else {
                maxEntry = it
            }
        }
        return if(maxEntry!=null) maxEntry!!.key else 0
    }
}