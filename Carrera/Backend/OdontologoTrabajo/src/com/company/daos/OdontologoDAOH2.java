package com.company.daos;
import com.company.entidad.Odontologo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class OdontologoDAOH2 implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("INSERT INTO odontologo VALUES (?, ?, ?, ?)");
            preparedStatement.setLong(1, odontologo.getId());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.setString(4, odontologo.getMatricula());

            //Ejecutar Sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return odontologo;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM odontologo WHERE ID=?");
            preparedStatement.setLong(1, id);


            //Ejecutar Sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Odontologo buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM odontologo WHERE ID=?");
            preparedStatement.setLong(1, id);

            //Ejecutar Sentencia
            ResultSet result = preparedStatement.executeQuery();


            //Evaluar Resultados

            while(result.next()){
                Long idOdontologo = result.getLong("id");
                String nombreOdontologo = result.getString("nombre");
                String apellidoOdontologo = result.getString("apellido");
                String matriculaOdontologo = result.getString("matricula");


                odontologo = new Odontologo();
                odontologo.setId(idOdontologo);
                odontologo.setNombre(nombreOdontologo);
                odontologo.setApellido(apellidoOdontologo);
                odontologo.setMatricula(matriculaOdontologo);

            }
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return odontologo;
    }

    @Override
    public List<Odontologo> mostrarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM odontologo");

            //Ejecutar Sentencia
            ResultSet result = preparedStatement.executeQuery();

            //Evaluar Resultados

            while(result.next()){
                Long idOdontologo = result.getLong("id");
                String nombreOdontologo = result.getString("nombre");
                String apellidoOdontologo = result.getString("apellido");
                String matriculaOdontologo = result.getString("matricula");

                odontologo = new Odontologo();
                odontologo.setId(idOdontologo);
                odontologo.setNombre(nombreOdontologo);
                odontologo.setApellido(apellidoOdontologo);
                odontologo.setMatricula(matriculaOdontologo);

                odontologos.add(odontologo);

            }
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return odontologos;
    }
}
