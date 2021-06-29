package greentea.state

class NormalState(private val troubleMaker: TroubleMaker) : StudentState {

    override fun smoke() {

        if (troubleMaker.cigarettes == 0) {
            println("아 tlqkf 담배가 다 떨어졌잖아!")
            troubleMaker.changeState(troubleMaker.noCigaretteState)
            return
        }

        troubleMaker.cigarettes--

        if (troubleMaker.cigarettes == 0) {
            println("아 tlqkf 담배가 다 떨어졌잖아!")
            troubleMaker.changeState(troubleMaker.noCigaretteState)
        }
    }

    override fun extort() {
        println("나는야 착한 아이. 담배만 피울 뿐 꺄르르")
    }

    override fun serve() {
        println("와 신나는 봉사활동 시간이다~!")
    }

    override fun showState() {
        println("일반 학생이 되었습니다.")
    }

}

class NoCigaretteState(private val troubleMaker: TroubleMaker) : StudentState {

    override fun smoke() {
        println("담배가 없으니 담배좀 구해야겠다.")
        troubleMaker.changeState(troubleMaker.bullyState)
    }

    override fun extort() {
        println("야 담배 내놔")
        troubleMaker.changeState(troubleMaker.bullyState)
    }

    override fun serve() {
        println("착하게 살아야지")
        troubleMaker.changeState(troubleMaker.normalState)
    }

    override fun showState() {
        println("담배가 다 떨어진 학생이 되었습니다.")
    }

}

class BullyState(private val troubleMaker: TroubleMaker) : StudentState {

    override fun smoke() {
        println("아 이걸 걸리네")
        troubleMaker.changeState(troubleMaker.expelledState)
    }

    override fun extort() {
        println("담배도 못 뺏고 걸리네")
        troubleMaker.changeState(troubleMaker.expelledState)
    }

    override fun serve() {
        println("착하게 살아야지")
        troubleMaker.changeState(troubleMaker.normalState)
    }

    override fun showState() {
        println("양아치가 되었습니다.")
    }

}

class ExpelledState(val troubleMaker: TroubleMaker) : StudentState {
    override fun smoke() {
        println("후.. 이제 자유다")
    }

    override fun extort() {
        println("야 담배 내놔 tlqkf")
    }

    override fun serve() {
        println("내가 비록 퇴학당했지만 착하게 산다.")
    }

    override fun showState() {
        println("퇴학당한 학생이 되었습니다.")
    }

}