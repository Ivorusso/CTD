package com.company;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoH2 implements Idao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/Base_Odontologos;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER = "sa";
    private final String DB_PASSWORD = "";
    private static final Logger logger = Logger.getLogger(OdontologoH2.class);

    @Override
    public Odontologo darDeAlta(Odontologo odontologo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("INSERT INTO odontologo VALUES (?, ?, ?, ?)");
            preparedStatement.setLong(1, odontologo.getId());
            preparedStatement.setString(2, odontologo.getMatricula());
            preparedStatement.setString(3, odontologo.getNombre());
            preparedStatement.setString(4, odontologo.getApellido());
            preparedStatement.executeUpdate();
            logger.info("Se dio de alta el odontologo" + odontologo.getNombre());
            preparedStatement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return odontologo;
    }

    @Override
    public void darDeBaja(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("DELETE FROM odontologo WHERE ID=?");
            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();
            logger.info("Se elimino el odontologo cual matricula es: " + id);
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
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM odontologo WHERE ID=?");
            preparedStatement.setLong(1, id);

            preparedStatement.executeQuery();
            logger.info("Se encontro al odontologo: " + id);
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Odontologo> listar() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;
        List<Odontologo> odontologos = new ArrayList<>();
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT * FROM odontologo");

            ResultSet result = preparedStatement.executeQuery();
            logger.info("Lista de odontologos");

            while(result.next()){
                Long id = result.getLong("id");
                String matricula = result.getString("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                odontologo = new Odontologo();
                odontologo.setId(id);
                odontologo.setMatricula(matricula);
                odontologo.setNombre(nombre);
                odontologo.setApellido(apellido);


                odontologos.add(odontologo);

            }
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(odontologos);
        return odontologos;
    }
}
