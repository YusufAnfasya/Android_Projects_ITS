package com.example.aplikasikontak;

public class kontak {
    private String nama;
    private String noHp;
    private String mk;

    private Integer quiz;
    private Integer tugas;
    private Integer ets;
    private Integer eas;


    public kontak(String nama, String noHp, String mk) {
        this.nama = nama;
        this.noHp = noHp;
        this.mk = mk;
//        this.tugas = tugas;
//        this.quiz = quiz;
//        this.ets = ets;
//        this.eas = eas;

    }

    public String getNoHp() {  return noHp;}
    public String getNama() {return nama;}
    public String getMk() {  return mk;}
//    public Integer getTugas() {  return tugas;}
//    public Integer getQuiz() {return quiz;}
//    public Integer getEts() {  return ets;}
//    public Integer getEas() {return eas;}


    public void setNoHp(String noHp) {this.noHp = noHp;}
    public void setNama(String nama) {this.nama = nama;}
    public void setMk(String mk) {this.mk = mk;}
//    public void setTugas(Integer tugas) {this.tugas = tugas;}
//    public void setQuiz(Integer quiz) {this.quiz = quiz;}
//    public void setEts(Integer ets) {this.ets = ets;}
//    public void setEas(Integer eas) {this.eas = eas;}
}


