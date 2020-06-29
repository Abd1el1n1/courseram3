package com.example.mascotas;

import android.widget.Button;

public class MascotasModelo {
    private String mascota;
    private int imgMascota;
    private Button favoritos, noFav;

    public MascotasModelo(){

    }

    public MascotasModelo(String mascota, int imgMascota){
        this.mascota = mascota;
        this.imgMascota = imgMascota;
    }
    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
    public int getImgMascota() {
        return imgMascota;
    }

    public void setImgMascota(int imgMascota) {
        this.imgMascota = imgMascota;
    }
}
