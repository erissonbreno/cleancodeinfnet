package br.com.acme.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public class AssinaturaModel {
    private final BigDecimal mensalidade;
    private final LocalDate inicio;
    private final Optional<LocalDate> fim;
    private final ClienteModel cliente;

    public AssinaturaModel(BigDecimal mensalidade, LocalDate inicio, LocalDate fim, ClienteModel cliente) {
        this.mensalidade = mensalidade;
        this.inicio = inicio;
        this.fim = Optional.of(fim);
        this.cliente = cliente;
    }

    public AssinaturaModel(BigDecimal mensalidade, LocalDate inicio, ClienteModel cliente) {
        this.mensalidade = mensalidade;
        this.inicio = inicio;
        this.cliente = cliente;
        this.fim = Optional.empty();
    }

    public BigDecimal getMensalidade() {
        return mensalidade;
    }

    public LocalDate getInicio() {
        return inicio;
    }


    public Optional<LocalDate> getFim() {
        return fim;
    }

    public ClienteModel getCliente() {
        return cliente;
    }
}
