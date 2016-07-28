//Universidad del Valle de Guatemala
//Ingenieria de Software
//Sprint 2
//Juan Carlos Tapia
//Hugo Noriega
//Rodrigo Castro
//Leonel Guillen
//Clase Perfil
//Clase encargada del perfil

package com.nor.hugo.tutorgt;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Perfil extends Fragment{

//Definicion de variables
    @Nullable
    private String nombre;
    private int edad;
    private String infoP;
    private String correo;
    private int numeroCel;
//Set and gets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setInfoP(String infoP) {
        this.infoP = infoP;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumeroCel(int numeroCel) {
        this.numeroCel = numeroCel;
    }

    @Nullable
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNumeroCel() {
        return numeroCel;
    }

    public String getInfoP() {
        return infoP;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.perfil,container,false);
        return view;
    }

}
