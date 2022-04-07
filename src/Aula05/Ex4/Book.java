package Aula05.Ex4;

public class Book {
    private static int idCount= 100;
    private int id;
    private String title, loantype;
    private boolean isLoaned;

public Book(String title,String loantype){
    this.id= idCount++;
    this.title = title;
    this.loantype = loantype;
}
public Book(String title){
    this.id= idCount++;
    this.title = title;
    this.loantype = "NORMAL";
}

public int getId(){
    return this.id;}

    public String getTitle(){
        return this.title;
    }


    public String getLoanType(){
        return this.loantype;
    }


    public boolean isLoaned(){
        if(this.loantype.equals("CONDICIONAL")) return true;
        return this.isLoaned;
    }


    public void setIsLoaned(boolean isLoaned){
        this.isLoaned = isLoaned;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setLoantype(String loantype){
        this.loantype = loantype;
    }

    public String toString(){
        return "Book:" + this.id + ", " + this.title + ", " + this.loantype;























}}
