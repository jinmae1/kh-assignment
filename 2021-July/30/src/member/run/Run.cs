using System;
using member.controller;
using member.model.vo;

namespace member.run
{
    class Run
    {
        static void Main(string[] args)
        {
            MemberManager m = new MemberManager();
            m.silverInsert(new Silver("홍길동", "Silver", 1000));
            m.silverInsert(new Silver("김말똥", "Silver", 2000));
            m.silverInsert(new Silver("고길동", "Silver", 3000));

            m.printData();
        }
    }
}
