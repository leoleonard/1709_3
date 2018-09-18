public class Device {
    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }


    public Device(String code, String producer, String type, double price) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    String getInfo() {
        return "Kod: " +  code + ", producent " + producer + ", typ " + type + ", cena " + price;
    }
}
