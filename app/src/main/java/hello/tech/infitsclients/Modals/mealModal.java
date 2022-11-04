package hello.tech.infitsclients.Modals;

public class mealModal {
    private int img;
    private String item;
    private String day;
    private  String time;
    private  int icon;

    public mealModal(int img, String item, String day, String time, int icon) {
        this.img = img;
        this.item = item;
        this.day = day;
        this.time = time;
        this.icon = icon;
    }

    public mealModal() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
