package com.wholecons.empresas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private String direccion;
    private Rubro rubro;
    private List<Caldera> calderas;


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
}
