package com.mayan.sistema_financeiro.enums;

public enum PersonType {
    CLIENT, SALESMAN;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public static PersonType toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for(PersonType x : PersonType.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Tipo de pessoa inválido");
    }
}