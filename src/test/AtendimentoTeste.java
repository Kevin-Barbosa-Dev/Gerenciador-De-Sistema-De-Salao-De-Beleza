package test;


import Model.Atendimento;
import Model.Cliente;
import Model.Servico;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AtendimentoTeste {
    private Atendimento atendimento;
    private Cliente cliente;
    private Servico servico;

    @Before
    public void setUp(){
        cliente = new Cliente("Kevin", "kevin@gmail.com",12345678, "Rua Aleatória");
        servico = new Servico("Corte de cabelo", "Cortar cabelo na régua", 30);
        atendimento = new Atendimento(servico,cliente,"20/11/2023","08:00");
    }
    @Test
    public void atendimentoTeste(){
        assertEquals(cliente,atendimento.getCliente());
        assertEquals(servico,atendimento.getServico());
        assertEquals("20/11/2023", atendimento.getData());
        assertEquals("08:00", atendimento.getHora());
        assertNotNull(atendimento);
    }
}
