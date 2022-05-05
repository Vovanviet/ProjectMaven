package entity;

import jakarta.persistence.*;

@Table(name = "customers")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
   private int id;
    @Column(name = "cusName",nullable = false)
   private String cusName;
    @Column(name = "cusEmail",nullable = false)
   private String cusEmail;
    @Column(name = "cusPhone",nullable = false)
   private String cusPhone;

    public Customer( String cusName, String cusEmail, String cusPhone) {
        this.cusName = cusName;
        this.cusEmail = cusEmail;
        this.cusPhone = cusPhone;
    }
    public Customer() {
    }

    public Customer(String cusName) {
        this.cusName = cusName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", cusName:'" + cusName + '\'' +
                ", cusEmail:'" + cusEmail + '\'' +
                ", cusPhone:'" + cusPhone + '\'' +
                '}';
    }
}
