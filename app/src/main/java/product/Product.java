package product;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    int image;
    String phoneNumber;

    public Product(String name, int image){
        this.name = name;
        this.image = image;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPhoneNumber(){return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
