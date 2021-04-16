package patient

class Checkup (val height : Int, val weight : Double, val temperature : Double, val vaccsok : Boolean) {
    fun getVaccsOk() : Boolean {
        return vaccsok
    }
}