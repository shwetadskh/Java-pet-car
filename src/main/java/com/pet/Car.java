package com.pet;

public class Car {

        private String make;
        private String model;
        private int manufacturingYear;

        //constructor 1 empty
        public Car() {
            make = "";
            model = "";
            manufacturingYear=0;
        }

        //Constructor 2 parameter
            public Car(String make, String model) {
            this.make = make;
            this.model = model;
            manufacturingYear = 0;
        }
        //constructor 3 parameter/3 variables
        public Car(String make, String model, int manufacturingYear) {
            this.make = make;
            this.model = model;
            this.manufacturingYear = manufacturingYear;
        }
        //getter & setter methods
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
        public int getManufacturingYear() {
            return manufacturingYear;
        }
        public void setManufacturingYear(int manufacturingYear) {
            this.manufacturingYear = manufacturingYear;
        }
        //method return a string
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", manufacturingYear=" + manufacturingYear +
                    '}';
        }

        //method return boolean
        public boolean isNewCar() {
            return manufacturingYear >= 2020;
        }
    }
