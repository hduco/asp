package com.wholecons.empresas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryRepository implements Repository {
    private Map<String, Empresa> indiceRazon = new HashMap<String, Empresa> ();

    public Empresa getEmpresa(String razonSocial){
        if ( indiceRazon.containsKey(razonSocial) ) {
            return  indiceRazon.get(razonSocial);
        }
        return null;
    }

    public void guardarEmpresa(Empresa empresa){
        indiceRazon.put(empresa.getRazonSocial(),empresa);
    }
}
