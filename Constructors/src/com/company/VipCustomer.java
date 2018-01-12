package com.company;

public class VipCustomer {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

   private String name;
   private String creditLimit;
   private String email;

   public VipCustomer(String name, String creditLimit, String email) {
       this.name = name;
       this.creditLimit = creditLimit;
       this.email = email;
   }

   public VipCustomer(String name, String creditLimit) {
       this(name, creditLimit, "default.email@email.com");
   }

   public VipCustomer() {
       this("Default Name", "Default credit limit", "Default email");
   }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
