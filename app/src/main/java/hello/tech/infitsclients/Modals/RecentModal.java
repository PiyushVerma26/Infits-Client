package hello.tech.infitsclients.Modals;

public class RecentModal {
    private int image;
    private  String name;
    private String amount;
    private  String roti;
    private String gram;

    public RecentModal(int image, String name, String amount, String roti, String gram) {
        this.image = image;
        this.name = name;
        this.amount = amount;
        this.roti = roti;
        this.gram = gram;
    }

    public RecentModal() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getGram() {
        return gram;
    }

    public void setGram(String gram) {
        this.gram = gram;
    }
}
