package day11;

public class MovieVO1 {
    private String title;
    private String openDay;
    private String actor;
    private String runtime;
    private String gener;
    private String grade;

    public MovieVO1() {
    }

    public MovieVO1(String title, String openDay, String actor, String runtime, String gener, String grade) {
        this.title = title;
        this.openDay = openDay;
        this.actor = actor;
        this.runtime = runtime;
        this.gener = gener;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", openDay='" + openDay + '\'' +
                ", actor='" + actor + '\'' +
                ", runtime=" + runtime +
                ", gener='" + gener + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public String getGener() {
        return gener;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getActor() {
        return actor;
    }

    public String getOpenDay() {
        return openDay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}


