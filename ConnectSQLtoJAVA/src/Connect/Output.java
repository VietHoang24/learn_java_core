package Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Output {
    public static void outputResult() {
        Connection connect = null;
        try {
            connect = Connect.getConnect();
            String sql = "select * from Mark";
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                String studentId = result.getString(1);
                String subjectId = result.getString(2);
                System.out.println(studentId + "\t" + subjectId);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
