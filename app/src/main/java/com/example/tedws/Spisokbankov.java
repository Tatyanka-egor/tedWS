package com.example.tedws;

public class Spisokbankov {
    private String Adress;
    private String Otdelenie;
    private  String Status;
    private String Vremrab;

    public Spisokbankov(String adress, String otdelenie, String status, String vremrab) {
        Adress = adress;
        Otdelenie = otdelenie;
        Status = status;
        Vremrab = vremrab;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getOtdelenie() {
        return Otdelenie;
    }

    public void setOtdelenie(String otdelenie) {
        Otdelenie = otdelenie;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getVremrab() {
        return Vremrab;
    }

    public void setVremrab(String vremrab) {
        Vremrab = vremrab;
    }
}
