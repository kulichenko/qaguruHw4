package guru.qa;

public class ElectronicDevices {
    private CategoriesOfDevices categoryName;
    private String name;
    private Characteristics characteristics;

    public ElectronicDevices(CategoriesOfDevices categoryName, String name, Characteristics characteristics) {
        this.categoryName = categoryName;
        this.name = name;
        this.characteristics = characteristics;
    }

    public void putDeviceToCart (int quantity){
        String answer = String.format("В корзину добавлен %d %s(ов) %s. Характеристики: \n" +
                "Цвет: %s, \nОбъем памяти: %dGb, \nRAM: %dGb, \nРазмер экрана: %s\", \nКарта памяти: %s, \n",
                quantity, categoryName.getCategoryName(), name, characteristics.getColour(),
                characteristics.getInternalStorageSize(), characteristics.getRamSize(),
                characteristics.getScreenSize(), characteristics.isAbleToUseMemoryCard());
        System.out.println(answer);
    }
}

class Characteristics {
    private String colour;
    private int internalStorageSize;
    private int RamSize;
    private double ScreenSize;
    private boolean isAbleToUseMemoryCard;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getInternalStorageSize() {
        return internalStorageSize;
    }

    public void setInternalStorageSize(int internalStorageSize) {
        this.internalStorageSize = internalStorageSize;
    }

    public int getRamSize() {
        return RamSize;
    }

    public void setRamSize(int ramSize) {
        RamSize = ramSize;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }

    public boolean isAbleToUseMemoryCard() {
        return isAbleToUseMemoryCard;
    }

    public void setAbleToUseMemoryCard(boolean ableToUseMemoryCard) {
        isAbleToUseMemoryCard = ableToUseMemoryCard;
    }
}

enum CategoriesOfDevices {

    SMARTPHONE("Смартфон"),
    NOTEBOOK("Ноутбук"),
    TABLET("Планшет");
    private String categoryName;

    CategoriesOfDevices(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

class Test{

    public static void main(String[] args) {
        Characteristics characteristics = new Characteristics();
        characteristics.setColour("Белый");
        characteristics.setInternalStorageSize(128);
        characteristics.setRamSize(3);
        characteristics.setScreenSize(6.5);
        characteristics.setAbleToUseMemoryCard(true);
        String name = "Samsung A52";
        ElectronicDevices electronicDevices = new ElectronicDevices(CategoriesOfDevices.SMARTPHONE, name, characteristics);
        electronicDevices.putDeviceToCart(1);
    }
}

