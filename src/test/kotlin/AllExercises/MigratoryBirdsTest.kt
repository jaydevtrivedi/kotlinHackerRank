package AllExercises

import junit.framework.Assert.assertTrue
import org.junit.Test
import kotlin.contracts.ExperimentalContracts

internal class MigratoryBirdsTest {

    var migratoryBirds: MigratoryBirds = MigratoryBirds()

    @ExperimentalContracts
    @Test
    fun testarrayResult2(){
        val array2 = arrayOf(1,2,2,2,3)
        assertTrue(migratoryBirds.getResult(array2)==2)
    }
}