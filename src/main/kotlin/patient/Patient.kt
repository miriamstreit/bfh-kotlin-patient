package patient

class Patient(private val name : String) {
    var height : Int = 0
    var weight : Double = 0.0
    var temperature : Double = 0.0
    var vaccsok : Boolean = true

    fun getName() : String {
        return name
    }

    fun addCheckup(_height : Int, _weight : Double, _temperature : Double, _vaccsok : Boolean) {
        height = _height
        weight = _weight
        temperature = _temperature
        vaccsok = _vaccsok
    }

    override fun toString() : String {
        return "Name: %s,Height: %s,Weight: %s,Temperature: %s".format(name, height, weight, temperature)
    }
}