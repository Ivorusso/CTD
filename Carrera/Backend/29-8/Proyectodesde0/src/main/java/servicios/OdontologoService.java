package servicios;
import daos.IDao;
import daos.OdontologoH2;
import entidad.Odontologo;

import java.util.List;

public class OdontologoService {


    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoIDao = odontologoDao;
    }
    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }


    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public void eliminarOdontologo(String matricula){
        odontologoIDao.eliminar(matricula);
    }

    public Odontologo buscarOdontologo(String matricula){
        return odontologoIDao.buscar(matricula);
    }

    public List<Odontologo> mostrarTodos(){
        return odontologoIDao.mostrarTodos();
    }
}




