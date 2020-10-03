package com.wholecons.empresas;

public interface Repository {
    public Empresa getEmpresa(String razonSocial);
    public void guardarEmpresa(Empresa empresa);

}
