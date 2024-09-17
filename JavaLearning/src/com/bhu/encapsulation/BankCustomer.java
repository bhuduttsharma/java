package com.bhu.encapsulation;

public class BankCustomer {

	private String Name;
    private int accountNumber;
    private int id;
    private int age;
    private char gender;
    private long phoneNumber;
    
    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public BankCustomer(String Name, int accountNumber, int id, int age, char gender, long phoneNumber){
        setName(Name);
        setAccountNumber(accountNumber);
        setId(id);
        setGender(gender);
        setAge(age);
        setPhoneNumber(phoneNumber);
    }
}
