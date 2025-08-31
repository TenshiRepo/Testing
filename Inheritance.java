class Gadget{
    String brand, type;
    
    Gadget(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    void displayDetails(){
        System.out.println("Brand: " + brand + ", Type: " + type );
    }

    void displayDetails(int price){
        System.out.println(" Type: " + type + " Price: " + price);
    }
    

    void ring(){
        System.out.println("Gadget is ringing");
    }
}
    // class laptop extends Gadget{
//     laptop(String brand, String type){
//         super(brand, type);
//     }

//     void displayDetails(int size){
//        super.displayDetails();
//        System.out.println("Size: " + size);
//     }


// }

class Employee {
    String name; // Instance variable
    int id; // Instance variable
    static int companyCode = 1001; // Static variable

    void displayEmployeeInfo() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Company Code: " + 
   companyCode);
    }
    
    }
   

class smarthphone extends Gadget{
    String model;

    smarthphone(String brand, String type, String model){
        super(brand, type);
        this.model = model;
    }


    void displayDetails(){
        super.displayDetails();
        System.out.println("Model: " + model);
    }
    public static void main(String[] args) {
        
        smarthphone s1 = new smarthphone("Samsung", "Midrange", "A50");
        // laptop laptop = new laptop("Acer", "Flagship");
        Employee m = new Employee();

        m.id= 140;
        m.name = "Chris";
        m.displayEmployeeInfo();
        
        int code = Employee.companyCode;
        



        s1.displayDetails(500000);
        s1.displayDetails();
        // laptop.displayDetails(16);
        System.out.println(code);
        
    }
}

































public class Inheritance {
    public static void main(String[] args) {
        
    }
}
