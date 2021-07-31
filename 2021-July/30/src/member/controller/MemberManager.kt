package member.controller

import member.model.vo.Silver

class MemberManager {

    companion object {
        private var pSilver: Int = 0
        private val MAX_MEMBER: Int = 10
    }

    private val silver: Array<Silver?> = arrayOfNulls<Silver>(MAX_MEMBER)



    fun silverInsert(silver: Silver?): Unit {
        this.silver[pSilver++] = silver
    }

    fun printData(): Unit {
        println("---------------------------<<회원정보>>---------------------------");
        println("이름\t\t등급\t\t포인트\t\t이자포인트")
        println("-----------------------------------------------------------------");

            for(i in 0 until pSilver)
            {
                println(this.formatData(this.silver[i]))
            }
    }

    private fun formatData(s: Silver?): String {

        // if(s != null) s.toUpperCase()
        // else null

        // s?.toUpperCase()

        // if (s == null) return ""
        // else 
            return s?.name + "\t\t" + s?.grade + "\t\t" + s?.point + "\t\t" + s?.getInterest()
    }
    
}