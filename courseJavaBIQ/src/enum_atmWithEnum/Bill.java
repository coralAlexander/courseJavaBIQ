package enum_atmWithEnum;

public enum Bill {
    _20(20, 150, 37),
    _50(50, 157, 37),
    _100(100, 164, 37),
    _200(200, 168, 37);

    private int monetaryValue;
    private int width;
    private int height;

    private Bill(int monetaryValue, int width, int height) {
        this.monetaryValue = monetaryValue;
        this.width = width;
        this.height = height;
    }

    int getMonetaryValue() {
        return monetaryValue;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
