package member.run

import member.controller.MemberManager
import member.model.vo.Silver

class Run {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val m = MemberManager()
            m.silverInsert(Silver("홍길동", "Silver", 1000)) 
            m.silverInsert(Silver("고길동", "Silver", 3000)) 
            m.printData();
        }
    }
}