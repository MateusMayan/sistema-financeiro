package com.mayan.sistema_financeiro.enums;

public enum TransactionType {
    PURCHASE, SALE;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public static TransactionType toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for(TransactionType x : TransactionType.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Tipo de transação inválido");
    }
}