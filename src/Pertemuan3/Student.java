package Pertemuan3;

public class Student {
  String nrp;

  public Student() {

  }

  public void setNrp (String nrp) {
      this.nrp = nrp;
  }

  public String getNrp() {
      return nrp;
  }

  public void show(){
      System.out.println("Student index of : " + getNrp());
  }

}
