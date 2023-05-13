package com.tareamayo;

import java.sql.*;

public class ModuloDAO extends Modulo {


    private ConexionBD conexionBD;


    public ModuloDAO(int idModulo, String nomModulo, int numHoras, String nomProfe, int numUnit, int notaFinal) {
        super(idModulo, nomModulo, numHoras, nomProfe, numUnit, notaFinal);
        this.conexionBD = new ConexionBD("jdbc:mysql://localhost:3306/bd_mismodulos", "root", "");
    }


    private void close(Connection connection) {

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException X) {
                System.out.println("No se ha podido establecer la conexión.");
                X.printStackTrace();
            }

        }
    }

    private void close(PreparedStatement preparedStatement){
        if (preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException X) {
                System.out.println("No se ha podido establecer la conexión.");
                X.printStackTrace();
            }
        }
    }

   public void insertarModulo() throws SQLException {
        //este metodo recibe un objeto de la clase Modulo que usaremos para acceder a los getter de cada atributo

      

       try{
           Connection connection;
           connection = conexionBD.getConnection();

           String query = "INSERT INTO modulos (idModulo, nomModulo, numHoras, nomProfe, numUnit, notaFinal) " +
                   "VALUES (?,?,?,?,?,?)";

           PreparedStatement pstmt = connection.prepareStatement(query);

           pstmt.setInt(1,  1);
           pstmt.setString(2,"Programación");
           pstmt.setInt(3,120);
           pstmt.setString(4,"Juan Cruz");
           pstmt.setInt(5, 11);
           pstmt.setInt(6, 9);


           connection.close();



       }catch (SQLException X){
           X.printStackTrace();
       }

    }

    public void eliminarModulo(int id) throws SQLException {

        try {
            Connection connection;
            connection = conexionBD.getConnection();

            String query = "DELETE FROM modulos WHERE idModulo = ? ";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);

            pstmt.executeUpdate();
            connection.close();

        } catch (SQLException X){
            X.printStackTrace();

        }

    }

}
