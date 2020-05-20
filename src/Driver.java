import java.sql.*;

public class Driver {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/cabinetmedical", "root" , "");
            //create statement
            Statement myStmt = connexion.createStatement();
            ResultSet myRs = myStmt.executeQuery("select *  from medecin ");
            while (myRs.next()) {
                System.out.println(myRs.getString("nom") + " , " + myRs.getString("prenom"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}