package member.controller;

import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;
import member.model.vo.Gold;

/**
 * MemberManager
 */
public class MemberManager {

    private static int pSilver = 0;
    private static int pGold = 0;
    private static int pVip = 0;
    private static int pVVip = 0;

    private static final int MAX_MEMBER = 10;

    private Silver[] silver = new Silver[MAX_MEMBER];
    private Gold[] gold = new Gold[MAX_MEMBER];
    private Vip[] vip = new Vip[MAX_MEMBER];
    private VVip[] vvip = new VVip[MAX_MEMBER];

    public void silverInsert(Silver silver) {
        this.silver[pSilver++] = silver;
    }

    public void goldInsert(Gold gold) {
        this.gold[pGold++] = gold;
    }

    public void vipInsert(Vip vip) {
        this.vip[pVip++] = vip;
    }

    public void vvipInsert(VVip vvip) {
        this.vvip[pVVip++] = vvip;
    }

    public void printData() {
        System.out.println("---------------------------<<회원정보>>---------------------------");
        System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", "이름", "등급", "포인트", "이자포인트");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < pSilver; i++) {
            System.out.println(this.formatData(this.silver[i]));
        }
        for (int i = 0; i < pGold; i++) {
            System.out.println(this.formatData(this.gold[i]));
        }
        for (int i = 0; i < pVip; i++) {
            System.out.println(this.formatData(this.vip[i]));
        }
        for (int i = 0; i < pVVip; i++) {
            System.out.println(this.formatData(this.vvip[i]));
        }

    }

    private String formatData(Silver silver) {
        return String.format("%s\t\t%s\t\t%d\t\t%.2f", silver.getName(), silver.getGrade(), silver.getPoint(),
                silver.getInterestPoint());
    }

    private String formatData(Gold gold) {
        return String.format("%s\t\t%s\t\t%d\t\t%.2f", gold.getName(), gold.getGrade(), gold.getPoint(),
                gold.getInterestPoint());
    }

    private String formatData(Vip vip) {
        return String.format("%s\t\t%s\t\t%d\t\t%.2f", vip.getName(), vip.getGrade(), vip.getPoint(),
                vip.getInterestPoint());
    }

    private String formatData(VVip vvip) {
        return String.format("%s\t\t%s\t\t%d\t\t%.2f", vvip.getName(), vvip.getGrade(), vvip.getPoint(),
                vvip.getInterestPoint());
    }
}