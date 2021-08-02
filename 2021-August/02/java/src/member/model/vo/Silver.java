package member.model.vo;

/**
 * Silver
 */
public class Silver {

    private String name;
    private String grade;
    private int point;
    private static float interest = 0.02f;

    public Silver() {

    }

    public Silver(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public float getInterestPoint() {
        return point * interest;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}