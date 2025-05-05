package com.terceros.terceros.models;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "thirds")
public class TercerosModel implements Serializable{

     // MODEL ID FIELD
     @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_thirds", nullable = false)
    private Long id_thirds;
    private int typedoc;
    private int typeuserid;
    private Date date;
    private int doctype;
    private String numid;
    private int verifydigit;
    private String firstname;
    private String secondname;
    private String firstlastname;
    private String secondlastname;
    private String persontype;
    private int thirdtype;
    private int retentiontype;
    private int country;
    private int department;
    private int city;
    private int economicactivity;
    private String profesion;
    private String adress;
    private BigInteger phone;
    private BigInteger celphone;
    private String email;
    private String info_verification;
    private String pay_responsable;
    private int bank_code_one;
    private int account_type;
    private BigInteger account_number;
    private int bank_code_two;
    private int account_type_two;
    private BigInteger account_number_two;
    private String calification_laft;

}
