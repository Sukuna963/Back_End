package one.digitalInnovation.lab_padroes_projetos_spring.service;

import one.digitalInnovation.lab_padroes_projetos_spring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscatodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
