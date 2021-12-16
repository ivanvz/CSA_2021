package HW3.Proj2;

class Holiday {
    private String name;
    private int day;
    private String month;

    //Answer for a - Constructor
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String toString(){
        return name + ", " + month + " " + day;
    }
}