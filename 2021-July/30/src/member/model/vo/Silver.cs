namespace member.model.vo
{
    public class Silver
    {
        private string name;
        private string grade;
        private int point;
        private static float interest = 0.02f;

        public Silver() { }

        public Silver(string name, string grade, int point)
        {
            this.name = name;
            this.grade = grade;
            this.point = point;
        }

        public float getInterestPoint()
        {
            return this.point * interest;
        }

        public string getName()
        {
            return this.name;
        }

        public void setName(string name)
        {
            this.name = name;
        }

        public string getGrade()
        {
            return this.grade;
        }

        public void setGrade(string grade)
        {
            this.grade = grade;
        }

        public int getPoint()
        {
            return this.point;
        }

        public void setPoint(int point)
        {
            this.point = point;
        }

    }

}