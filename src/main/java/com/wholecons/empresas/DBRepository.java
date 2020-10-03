package com.wholecons.empresas;

public class DBRepository implements Repository{

    public Empresa getEmpresa(String razonSocial) {
        Empresa prueba = new Empresa();
        prueba.setRubro(Rubro.REPLICA_METALOGRAFICA);
        prueba.setDireccion("12 de octubre");
        prueba.setRazonSocial("Hugo");
        return prueba;
    }

    public void guardarEmpresa(Empresa empresa) {
    }
}
