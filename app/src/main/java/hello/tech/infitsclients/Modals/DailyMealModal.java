package hello.tech.infitsclients.Modals;

public class DailyMealModal {
    private String time;
    private String name;
   private String  amount;
   private int image;
   private String totalAmount;

    public DailyMealModal(String time, String name, String amount, int image, String totalAmount) {
        this.time = time;
        this.name = name;
        this.amount = amount;
        this.image = image;
        this.totalAmount = totalAmount;
    }

    public DailyMealModal() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
