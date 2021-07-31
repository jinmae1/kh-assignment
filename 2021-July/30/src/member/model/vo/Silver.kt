package member.model.vo

class Silver {

    var name: String? = null
    var grade: String? = null
    var point: Int = 0

    // * https://stackoverflow.com/questions/40352879/what-is-the-equivalent-of-java-static-final-fields-in-kotlin

    // * https://kimch3617.tistory.com/entry/Kotlin%EC%97%90%EC%84%9C-val-%EC%99%80-const-val-%EC%9D%98-%EC%B0%A8%EC%9D%B4

    companion object {
        private const val interest: Float = 0.05f

    }
    var companion = Companion

    // * https://velog.io/@conatuseus/Kotlin-%EC%83%9D%EC%84%B1%EC%9E%90-%EB%BF%8C%EC%8B%9C%EA%B8%B0

    constructor(name: String?, grade : String, point: Int) {
        this.name = name
        this.grade = grade
        this.point = point
    }

    fun getInterest(): Float {
        return this.companion.interest

    }
}