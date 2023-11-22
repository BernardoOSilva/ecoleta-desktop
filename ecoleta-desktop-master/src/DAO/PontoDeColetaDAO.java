package DAO;

import entity.CollectPoint;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.BancoDeDados;

public class PontoDeColetaDAO {
   public static void CriarPontoDeColeta(CollectPoint coleta) {
        String sql = "INSERT INTO ecoleta (name, email, city, typeOfWaste, latitude, longitude) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement stm = BancoDeDados.getConexao().prepareStatement(sql)) {

            
            stm.setString(1, coleta.getName());
            stm.setString(2, coleta.getEmail());
            stm.setString(3, coleta.getCity());
            stm.setObject(4, coleta.getTypeOfWaste());
            stm.setDouble(5, coleta.getLatitude());
            stm.setDouble(6, coleta.getLongitute());

            stm.executeUpdate();
    JOptionPane.showMessageDialog(null, "Inserido no banco de dados");
        } catch (SQLException e) {
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Problema ao inserir " + e);
        }

    } 
   
   public static ArrayList<CollectPoint> SelecionarPontoDeColetaPorCidade(String city){
       String sql = "SELECT * FROM ecoleta WHERE city = ?";
        try (PreparedStatement stm = BancoDeDados.getConexao().prepareStatement(sql)){
            stm.setString(1, city);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                
            }
        }catch (SQLException e){
            System.out.println("Não a nenhum local de coleta nesta cidade");
            return null;
        }
       return null;
   }
}
