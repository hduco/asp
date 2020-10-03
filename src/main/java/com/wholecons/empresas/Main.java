package com.wholecons.empresas;

public class Main {
    public static void main(String[] args) {

        Repository repo = new DBRepository();

        Empresa emp1 = new Empresa() ;

        emp1.setRazonSocial("aluar");
        emp1.setDireccion("Ruta 2");
        emp1.setRubro(Rubro.SOLDADURA);

        repo.guardarEmpresa(emp1);

        System.out.println(emp1.getRazonSocial());
        System.out.println(emp1.getDireccion());

        Empresa emp2 = repo.getEmpresa("aluar");
        System.out.println(emp2.getRazonSocial());

    }
}
