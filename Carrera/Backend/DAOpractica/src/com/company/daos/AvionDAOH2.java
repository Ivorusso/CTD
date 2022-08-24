package com.company.daos;

import com.company.entidad.Avion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDAOH2 implements IDao<Avion> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";


    @Override
    public Avion guardar(Avion avion) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //levantar driver
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

         //Crear Sentencia
         preparedStatement = connection.prepareStatement("INSERT INTO aviones VALUES (?,?,?,?,?)");
         preparedStatement.setLong(1, avion.getId());
         preparedStatement.setString(2, avion.getMarca());
         preparedStatement.setString(3, avion.getModelo());
         preparedStatement.setString(4, avion.getMatricula());
         preparedStatement.setString(5, avion.getFechaDeEntradaEnServicio());

         //ejecutar sentencia
        preparedStatement.executeUpdate();
        preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return avion;
    }

    @Override
    public void eliminarAvion(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //levantar driver
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM aviones where id=?");
            preparedStatement.setLong(1, id);

            //ejecutar sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Avion buscarAvion(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Avion avion = null;
        //levantar driver
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones where id=?");
            preparedStatement.setLong(1, id);

            //ejecutar sentencia
            ResultSet result = preparedStatement.executeQuery();
            preparedStatement.close();

            //Evaluar resultados
            while (result.next()){
                Long idAvion = result.getLong("id");
                String marcaAvion = result.getString("marca");
                String modeloAvion = result.getString("modelo");
                String matriculaAvion = result.getString("matricula");
                String fechaDeEntradaAvion = result.getString("fechadeentradaenservicio");
                avion = new Avion();
                avion.setId(idAvion);
                avion.setMarca(marcaAvion);
                avion.setModelo(modeloAvion);
                avion.setMatricula(matriculaAvion);
                avion.setFechaDeEntradaEnServicio(fechaDeEntradaAvion);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return avion;
    }

    @Override
    public List<Avion> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Avion> aviones = new ArrayList<>();
        //levantar driver
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crear Sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones");

            //ejecutar sentencia
            ResultSet result = preparedStatement.executeQuery();
            preparedStatement.close();

            //Evaluar resultados
            while (result.next()){
                Long idAvion = result.getLong("id");
                String marcaAvion = result.getString("marca");
                String modeloAvion = result.getString("modelo");
                String matriculaAvion = result.getString("matricula");
                String fechaDeEntradaAvion = result.getString("fechadeentradaenservicio");
                Avion avion = new Avion();
                avion.setId(idAvion);
                avion.setMarca(marcaAvion);
                avion.setModelo(modeloAvion);
                avion.setMatricula(matriculaAvion);
                avion.setFechaDeEntradaEnServicio(fechaDeEntradaAvion);

                aviones.add(avion);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aviones;
    }
}
