package com.isil.sunat.entidades;

public class Tributante {
    long codigo;
    String name;
    String apellido;
    double monto;
    public static double igv = 0.18;
    public static double ir = 0.015;

    public Tributante(long codigo, String name, String apellido, double monto) {
        this.codigo = codigo;
        this.name = name;
        this.apellido = apellido;
        this.monto = monto;
    }

    private double CalcularIgv(){
        return monto*igv;
    }

    private double CalcularIr(){
        return monto*ir;
    }

    public double CalcularTributo(){
        return CalcularIgv()+CalcularIr();
    }

    public static void ModificarIGV(double value){
        igv = value;
    }

    public String MostrarInfo(){
        return "Monto: "+monto+
                "\nI.G.V.: "+CalcularIgv()+
                "\nI.R.: "+CalcularIr()+
                "\nTributo: "+CalcularTributo();
    }
}
