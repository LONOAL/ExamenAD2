package org.example.objectdb;

public class Prueba {

    
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        obx.connection();
        //obx.insert();
        obx.selectPoints();
        obx.updatePointForId(3);
        obx.selectPoints();
        obx.closingConection();

    }
    
}
