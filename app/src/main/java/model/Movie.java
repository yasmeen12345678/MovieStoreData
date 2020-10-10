package model;

public class Movie {

    private String Name;
    private String title;
    private int year;

    public Movie(String name, String title, int year) {
        Name = name;
        this.title = title;
        this.year = year;
    }

    public String getName() {
        return Name;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
               "\n" +'}';
    }


}
