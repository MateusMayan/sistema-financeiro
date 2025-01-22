package com.mayan.sistema_financeiro.enums;

public enum PaymentMethod {
    CASH, CREDIT_CARD, DEBIT_CARD, PIX;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public static PaymentMethod toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for(PaymentMethod x : PaymentMethod.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Método de pagamento inválido");
    }
}