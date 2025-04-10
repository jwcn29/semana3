public class ColorItem {
    private String colorName;
    private String colorHex;
    private int colorResId;

    public ColorItem(String colorName, String colorHex, int colorResId) {
        this.colorName = colorName;
        this.colorHex = colorHex;
        this.colorResId = colorResId;
    }

    public String getColorName() { return colorName; }
    public String getColorHex() { return colorHex; }
    public int getColorResId() { return colorResId; }
}
