package br.ufc.quixada.dadm.manualdobixo.dao;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.dadm.manualdobixo.model.Oferta;

public class OfertaDAO {

    private static List<Oferta> ofertas;
    private static OfertaDAO instance = new OfertaDAO();

    private OfertaDAO() {
        ofertas = new ArrayList<>();
        ofertas.add(new Oferta("Oferta 1", "Endereco 1", "Tipo 1", "Descricao da oferta 1", 100.0f, 1));
        ofertas.add(new Oferta("Oferta 2", "Endereco 2", "Tipo 2", "Descricao da oferta 2", 200.0f, 2));
        ofertas.add(new Oferta("Oferta 3", "Endereco 3", "Tipo 3", "Descricao da oferta 3", 300.0f, 3));
        ofertas.add(new Oferta("Oferta 4", "Endereco 4", "Tipo 4", "Descricao da oferta 4", 400.0f, 4));
        ofertas.add(new Oferta("Oferta 5", "Endereco 5", "Tipo 5", "Descricao da oferta 5", 500.0f, 5));
    }

    public static OfertaDAO getInstance() {
        return instance;
    }

    public static List<Oferta> getAll() {
        return ofertas;
    }

    public static Oferta get(Integer idx) {
        return ofertas.get(idx);
    }

    public static void add (Oferta oferta) {
        ofertas.add(oferta);
    }

    public static void update(Oferta oferta, Integer idx) {
        ofertas.remove(idx);
        ofertas.add(idx, oferta);
    }

    public static void remove(Integer idx) {
        ofertas.remove(idx);
    }

    public static Integer getOfertaCount() {
        return ofertas.size();
    }

}
