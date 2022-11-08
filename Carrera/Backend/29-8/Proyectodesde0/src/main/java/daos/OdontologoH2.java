package daos;


import entidad.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoH2 implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/DbOdontologos;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER = "sa";
    private final String DB_PASSWORD = "";
    private static final Logger logger = Logger.getLogger(OdontologoH2.class);

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("INSERT INTO odontologos VALUES (?, ?, ?)");
            preparedStatement.setString(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());

            preparedStatement.executeUpdate();
            logger.info("Se guardo el Odontologo: " + odontologo.getNombre() + " matricula: " + odontologo.getMatricula() );
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            logger.error("Ocurrio un error al guardar el odontologo: ", e);
        } catch (SQLException e) {
            logger.error("Ocurrio un error al guardar el odontologo: ", e);
        }
        return odontologo;
    }

    @Override
    public void eliminar(String matricula) {
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("DELETE FROM odontologos WHERE matricula=?");
            preparedStatement.setString(1, matricula);

            preparedStatement.executeUpdate();
            logger.info("Se elimino el odontologo cual matricula es: " + matricula);
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            logger.error("Ocurrio un error al eliminar al odontologo: ", e);
        } catch (SQLException e) {
            logger.error("Ocurrio un error al eliminar al odontologo: ", e);
        }
    }

    @Override
    public Odontologo buscar(String matricula) {
        Odontologo odontologo = null;
        List<Odontologo> odontologoListado = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM odontologos WHERE matricula=?");
            preparedStatement.setString(1, matricula);
            ResultSet result = preparedStatement.executeQuery();
            logger.info("Se esta buscando al odontologo cual matricula es: " + matricula);

            while(result.next()) {
                String matriculaOdontologo = result.getString("matricula");
                String nombreOdontologo = result.getString("nombre");
                String apellidoOdontologo = result.getString("apellido");

                odontologo = new Odontologo();
                odontologo.setMatricula(matriculaOdontologo);
                odontologo.setNombre(nombreOdontologo);
                odontologo.setApellido(apellidoOdontologo);


                odontologoListado.add(odontologo);
            }
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            logger.error("ocurrio un error al buscar al odontologo: ", e);
        } catch (SQLException e) {
            logger.error("ocurrio un error al buscar al odontologo: ", e);
        }
        System.out.println(odontologoListado);
        return odontologo;
    }

    @Override
    public List<Odontologo> mostrarTodos() {
        Odontologo odontologo = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM odontologos");

            ResultSet result = preparedStatement.executeQuery();
            logger.info("Se estan por mostrar todos los odontologos");

            while(result.next()){
                String matriculaOdontologo = result.getString("matricula");
                String nombreOdontologo = result.getString("nombre");
                String apellidoOdontologo = result.getString("apellido");

                odontologo = new Odontologo();
                odontologo.setMatricula(matriculaOdontologo);
                odontologo.setNombre(nombreOdontologo);
                odontologo.setApellido(apellidoOdontologo);


                odontologos.add(odontologo);

            }
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            logger.error("ocurrio un error al buscar al listar a los odontologos: ", e);
        } catch (SQLException e) {
            logger.error("ocurrio un error al buscar al listar a los odontologos: ", e);
        }
        System.out.println(odontologos);
        return odontologos;
    }
}
