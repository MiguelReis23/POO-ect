package Aula09.ex1;
import Aula07.ex2.Date;


public class Pessoa {
    
    private String name;
    private int cc;
    private Date birthday;

    public Pessoa(String name, int cc, Date birthday) {
        this.name = name;
        this.cc = cc;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
   

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", cc=" + cc + ", birthday=" + birthday + '}';
    }

    @Override
    public int hashCode(){
        final int prime= 31;
        int result = 1;
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + cc;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
