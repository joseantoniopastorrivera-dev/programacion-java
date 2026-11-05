package examen.dao;

import examen.modelo.Vehiculo;
import examen.utils.Ansi;
import examen.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

//Clase encargada de la persistencia de datos en MySQL(Data Access Object)
public class VehiculoDAO {

    /**
     * Inserta o actualiza un catálogo completo de vehículos en la base de datos.
     * * @param vehiculos Colección de vehículos a importar.
     */

    public static void importarVehiculosABaseDeDatos(Collection<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println(Ansi.RED + "Error, no hay vehículos en el catálogo para exportar." + Ansi.RESET);
            return;
        }

        // Consulta a MySQL: Si el código ya éxiste, en lugar de petar actualiza los
        // datos.
        String sql = "Insert into vehiculos (codigo, marca, modelo, anio, disponible, tipo, dato1, dato2) "
                + "VALUES (?, ?,?,?,?,?,?,?)" + "on duplicate key upddate"
                + "marca = values(marca), modelo = values(modelo), anio = values(anio), "
                + "disponible = values(disponible), tipo = values(tipo), dato1 = values(tipo1), dato2 = values(tipo2)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int insertados = 0;
            // Recorremos la colección y vamos rellenando las interrogaciones de la SQL
            for (Vehiculo v : vehiculos) {
                pstmt.setString(1, v.getCodigo());
                pstmt.setString(2, v.getMarca());
                pstmt.setString(3, v.getModelo());
                pstmt.setInt(4, v.getAnio());
                pstmt.setBoolean(5, v.isDisponible());
                pstmt.setString(6, v.getTipo());
                pstmt.setString(7, v.getDato1());
                pstmt.setString(8, v.getDato2());

                // Ejecutamos la inserción para este vehículo
                pstmt.executeUpdate();
                insertados++;
            }
            System.out.println(Ansi.GREEN + "¡Éxito! " + insertados + " vehículos sincronizados con la base de datos."
                    + Ansi.RESET);

        } catch (SQLException e) {
            System.out.println(Ansi.RED + "Error de Base de Datos: " + e.getMessage() + Ansi.RESET);
            System.out.println(
                    Ansi.RED + "¿Tienes XAMPP/MySQL encendido y la base de datos 'rentacar' creada?" + Ansi.RESET);
        }

    }
}
