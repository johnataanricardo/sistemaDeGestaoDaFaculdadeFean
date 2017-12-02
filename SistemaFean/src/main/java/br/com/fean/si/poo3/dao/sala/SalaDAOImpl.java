package br.com.fean.si.poo3.dao.sala;

import br.com.fean.si.poo3.entity.sala.Sala;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SalaDAOImpl implements SalaDAO {

    private static List<Sala> room;

    public SalaDAOImpl() {
        room = new LinkedList<>();
    }

    @Override
    public void add(Sala sala) {
        long posicao = room.size();
        sala.setIdSala(posicao + 1L);
        sala.setNumSala(100L + posicao + 1L );
        room.add(sala);
    }

    @Override
    public void remove(Long id) {
        room.removeIf((sala) -> sala.getIdSala().equals(id));
    }

    @Override
    public void update(Sala sala) {
        room.stream().filter((room) -> room.getIdSala().equals(sala.getIdSala()))
                .forEach((room) -> {
                    room.setNumSala(sala.getNumSala());
                    room.setCategoria(sala.getCategoria());
                    room.setQntCadeira(sala.getQntCadeira());
                    room.setQntTomada(sala.getQntTomada());
                    room.setQntArCondicionado(sala.getQntArCondicionado());
                    room.setQntJanela(sala.getQntJanela());
                    room.setDtCriacao(sala.getDtCriacao());
                    room.setDtAlocado(sala.getDtAlocado());
                    room.setMaterias(sala.getMaterias());
                });
    }

    @Override
    public List<Sala> salas() {
        return room;
    }

    @Override
    public Sala findById(Long id) {
        return room.stream()
                .filter((sala) -> sala.getIdSala().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }
}
