package learningJV.Unit9.cau1;

public class Users {
    private int code;
    private String username;
    private String password;
    private String displayname;
    private int day, month, year;
    private String mobile;

    public Users() {
    }

    public Users(int code, String username, String password, String displayname, int day, int month, int year, String mobile) {
        this.code = code;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.mobile = mobile;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Users{" +
                "code=" + code +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", displayname='" + displayname + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
