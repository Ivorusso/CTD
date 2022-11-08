import daos.OdontologoH2;
import entidad.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import servicios.OdontologoService;

public class OdontologoTest {

    @Test
    public void puedoGuardarUnOdontologo(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        //DADO
        Odontologo odontologo =  new Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("A123");
        //CUANDO
        odontologoService.guardarOdontologo(odontologo);
        //ENTONCES
        Assertions.assertTrue((odontologoService.buscarOdontologo("A123") != null));
    }


    @Test
    public void buscarOdontologoPorMatricula(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        odontologoService.eliminarOdontologo("A123");

        Odontologo odontologo =  new Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("A123");
        odontologoService.guardarOdontologo(odontologo);

        odontologoService.buscarOdontologo("A123");
        Assertions.assertNotNull(odontologo);
    }

    @Test
    public void eliminarOdontologo(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());

        odontologoService.eliminarOdontologo("A123");
        Assertions.assertNull(odontologoService.buscarOdontologo("A123"));
    }

    @Test
    public void mostrarTodosLosOdontologos(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        odontologoService.eliminarOdontologo("A123");
        odontologoService.eliminarOdontologo("B123");
        odontologoService.eliminarOdontologo("C123");
        odontologoService.eliminarOdontologo("D123");
        String resultadoEsperado = "[Odontologo{matricula='C123', nombre='ivan', apellido='russo'}, Odontologo{matricula='D123', nombre='ivan2', apellido='rodriguez'}]";

        Odontologo odontologo =  new Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("C123");

        Odontologo odontologo1 =  new Odontologo();
        odontologo1.setNombre("ivan2");
        odontologo1.setApellido("rodriguez");
        odontologo1.setMatricula("D123");

        odontologoService.guardarOdontologo(odontologo);
        odontologoService.guardarOdontologo(odontologo1);

        Assertions.assertEquals(resultadoEsperado, odontologoService.mostrarTodos().toString());


    }
}
