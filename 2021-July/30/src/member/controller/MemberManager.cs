using member.model.vo;
using System;

namespace member.controller
{
    public class MemberManager
    {

        private static int pSilver = 0;
        private const int MAX_MEMBER = 10;

        private Silver[] silver = new Silver[MAX_MEMBER];

        public void silverInsert(Silver silver)
        {
            this.silver[pSilver++] = silver;
        }

        public void printData()
        {
            Console.WriteLine("---------------------------<<회원정보>>---------------------------");
            Console.WriteLine("{0}\t\t{1}\t\t{2}\t\t{3}", "이름", "등급", "포인트", "이자포인트");
            Console.WriteLine("-----------------------------------------------------------------");

            for (int i = 0; i < pSilver; i++)
            {
                System.Console.WriteLine(this.formatData(this.silver[i]));
            }

        }

        private string formatData(Silver silver)
        {
            return String.Format("{0}\t\t{1}\t\t{2}\t\t{3:.00}", silver.getName(), silver.getGrade(), silver.getPoint(), silver.getInterestPoint());
        }

    }

}