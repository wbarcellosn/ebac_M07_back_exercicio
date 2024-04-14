/**
 * @author winic
 * @since 1.0
 */
package com.task;

public class Notebook {

    private int manufacturingCode;
    private String color;
    private String manufacturer;
    private String model;
    private boolean accessingInternet;


    public boolean isAccessingInternet() {
        return accessingInternet;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufacturingCode() {
        return manufacturingCode;
    }

    public void setManufacturingCode(int manufacturingCode) {
        this.manufacturingCode = manufacturingCode;
    }

    public void turnOn() {
        System.out.println("O notebook ligou");
    }

    public void turnOff() {
        System.out.println("O notebook desligou");
    }

    public void setAccessingInternet(boolean accessingInternet) {
        this.accessingInternet = accessingInternet;
        if (accessingInternet) {
            System.out.println("O notebook está acessando a internet");
        } else {
            System.out.println("O notebook não está mais acessando a internet");
        }
    }

    public void registerNotebook(int manufacturingCode, String manufacturer, String model, String color) {
        this.manufacturingCode = manufacturingCode;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    private void printData() {

        System.out.println("********************************************");
        System.out.println("NOVO NOTEBOOK CRIADO");
        System.out.println();
        System.out.println("Código do notebook: " + manufacturingCode);
        System.out.println("Fabricante do notebook: " + manufacturer);
        System.out.println("Modelo do notebook: " + model);
        System.out.println("Cor do notebook: " + color);
        System.out.println("********************************************");
        System.out.println();
    }

    public static void main (String[] args) {
        Notebook testNotebook = new Notebook();

        testNotebook.registerNotebook(
            1234567,
            "Dell",
            "Dell-S2024",
            "black"
        );
        testNotebook.printData();
        testNotebook.turnOn();
        testNotebook.setAccessingInternet(true);
        testNotebook.setAccessingInternet(false);
        testNotebook.turnOff();
    }
}
