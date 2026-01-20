public class Student {
    //Attributes
    private String name;
    private int study_year;
    private int score = 0;

    //setName()
    public void setName(String name){
        this.name = name; //P.S. "this" use to declare the attribute "name", not the parameter "name".
    }

    //getName()
    public String getName(){
        return this.name;
    }

    //setStudyYear()
    public void setStudyYear(int study_year){
        this.study_year = study_year;
    }

    //getStudyYear()
    public int getStudyYear(){
        return this.study_year;
    }

    //getScore()
    public int getScore(){
        return this.score;
    }

    //addPoint()
    public void addPoint(int point){
        this.score += point;
        System.out.println(this.name + " got " + point + " points");
    }

    //getGrade()
    public String getGrade(){
        if(this.score >= 80) return "A";
        else if(this.score >= 70) return "B";
        else if(this.score >= 60) return "C";
        return "F"; //P.S. If you have to return sth. you don't have to use "else" in this case.
    }
}