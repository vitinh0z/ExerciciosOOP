package Construtores.ConstructorValorPadrao;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car (String make, String model, int year){
        this.make = (make == null || make.isEmpty()) ? "Marca desconhecida" : make;
        this.model = (model == null || model.isEmpty()) ? "Modelo desconhecida" : model;
        this.year = (year <= 0) ? 0 : year; 
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public String toString (){
        return "Marca: " + getMake() + " | Modelo: " + getModel() + " | Year: " + getYear();
    }










    
}
