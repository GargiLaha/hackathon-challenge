package com.stackroute.encapsulation;

public class Printer {
  int numberOfPagesPrinted;
  String typeOfPrinter;
  int tonerLevel;

  // Initial Printer Status using default constructor ( non - parameterised )
  public Printer() {
    this.numberOfPagesPrinted = 0;
    this.typeOfPrinter = "Duplex";
    this.tonerLevel = 100;
  }


  // Getters

  public int getNumberOfPagesPrinted() {
    System.out.print("Number of Pages :");
    return numberOfPagesPrinted;
  }

  public String getTypeOfPrinter() {
    System.out.print("Type of Printer :");
    return typeOfPrinter;
  }

  public int getTonerLevel() {
    System.out.print("Toner Level :");
    return tonerLevel;
  }


  // Setters
  public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
    this.numberOfPagesPrinted = numberOfPagesPrinted;
  }

  public void setTypeOfPrinter(String typeOfPrinter) {
    this.typeOfPrinter = typeOfPrinter;
  }

  public void useToner (int value) {
    System.out.println("Used Toner"+value);
    int tonerLevelnew = tonerLevel;
    if(tonerLevel > 0) {
      tonerLevelnew =  tonerLevel - value;
    }
    if (tonerLevel < 0) {
      System.out.println("Toner Drained.. \n Toner available "+tonerLevel);
      tonerLevel = 100;
    }
    tonerLevel = tonerLevelnew;

  }




  public void fillToner (int value) {
    System.out.println("Filled Toner"+value);
    if(tonerLevel < 100) {
      tonerLevel = value + tonerLevel;
    }
    if (tonerLevel > 100) {
      System.out.println("Toner Overflow.. \n Toner set to 100%");
      tonerLevel = 100;
    }

  }
  public static void main(String args[])
  {
    Printer printer = new Printer();

    System.out.println("\nInitial Printer Levels.....\n");
    System.out.print(printer.getNumberOfPagesPrinted()+"\n");
    System.out.print(printer.getTonerLevel()+"\n");
    System.out.print(printer.getTypeOfPrinter()+"\n");


    printer.useToner(70);
    printer.setNumberOfPagesPrinted(95);
    printer.fillToner(20);
    printer.setTypeOfPrinter("duplex");

    System.out.println("\nAfter Some usage and Modifications....");


    System.out.println("\nFinal Printer Levels.....\n");
    System.out.print(printer.getNumberOfPagesPrinted()+"\n");
    System.out.print(printer.getTonerLevel()+"\n");
    System.out.print(printer.getTypeOfPrinter()+"\n");


  }
}
