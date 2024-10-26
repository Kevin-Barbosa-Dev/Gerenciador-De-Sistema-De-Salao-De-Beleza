package test;

import Model.BancoDeDados;
import Model.Cliente;
import Model.Servico;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BancodeDadosTeste {
    private BancoDeDados bancoDeDados;
    @Before
    public void setUp() {
        bancoDeDados = new BancoDeDados();
    }

    @Test
    public void testCadastrarCliente() {
        Cliente cliente = new Cliente("João Silva", "joao@example.com", 123456789, "Rua A, 123");
        bancoDeDados.cadastrarCliente(cliente);
        assertEquals(1,bancoDeDados.getArmazenarCliente().size());
    }
    @Test
    public void testCadastrarServico(){
        Servico servico = new Servico("Corte de cabelo", "Cortar cabelo na régua", 30);
        bancoDeDados.cadastrarServico(servico);
        assertEquals(1,bancoDeDados.getArmazernarServico().size());
    }


}
