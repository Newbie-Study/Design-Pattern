package greentea.state

class TroubleMaker(var cigarettes: Int) : StudentState {

    var normalState: StudentState = NormalState(this)
    var noCigaretteState: StudentState = NoCigaretteState(this)
    var bullyState: StudentState = BullyState(this)
    var expelledState: StudentState = ExpelledState(this)

    var state: StudentState = NormalState(this)

    override fun smoke() {
        state.smoke()
    }

    override fun extort() {
        state.extort()
    }

    override fun serve() {
        state.serve()
    }

    override fun showState() {
        state.showState()
    }

    fun changeState(to: StudentState) {
        state = to
        state.showState()
        println()
    }
}