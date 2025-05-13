import java.sql.*;
public class PersonCRUD {
    public void addPerson(String firstName, String lastName, int age){
        String sql = "INSERT INTO person (firstName, lastName, age) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection()){
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        pstmt.setInt(3, age);
        pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void viewAllPerson(){
        String sql = "SELECT * FROM person";
        try(Connection conn = DBConnection.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id") + ": " +
                        rs.getString("firstName") + " " +
                        rs.getString("lastName") + ", " +
                        rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updatePerson(int id, String firstName, String lastName, int age){
        String sql = "UPDATE person SET firstName = ?, lastName = ?, age = ? WHERE id = ? ";
        try(Connection conn = DBConnection.getConnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3,age);
            pstmt.setInt(4,age);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deletePerson(int id){
        String sql = "DELETE FROM person WHERE id = ?";
        try(Connection conn = DBConnection.getConnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
