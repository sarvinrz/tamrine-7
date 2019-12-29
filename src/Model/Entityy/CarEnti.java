package Model.Entityy;

  public class CarEnti {
     private int number, build;
     long prise;
     private String model, color;


             public CarEnti setPrise(long prise){
                 this.prise = prise;
                 return this;
             }


             public long getPrise(){
                 return prise;
             }
             public int getNumber() {    return number; }


             public CarEnti setNumber(int number) {
                 this.number = number;
                 return this;
             }


             public int getBuild() {
                 return build;
             }


             public CarEnti setBuild(int build) {
                 this.build = build;
                 return this;
             }


             public String getModel() {
                 return model;
             }


             public CarEnti setModel(String model) {
                 this.model = model;
                 return this;
             }


             public String getColor() {
                 return color;
             }


             public CarEnti setColor(String color) {
                 this.color = color;
                 return this;
             }
 }
