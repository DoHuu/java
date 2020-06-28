
/**
 *
 * @author votandung
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DATABASE {
    private final String s_ClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    private final String s_URL = "jdbc:sqlserver://LAPTOPNEWBT\\SQLEXPRESS:1433;databaseName=QLSV";   
    private String username = "sa";
    private String password = "123456789";
    private Connection con;
    //jdbc:sqlserver://localhost;databaseName=QLTHUVIEN;integratedSecurity=true;
    public DATABASE()
    {
        try {
            Class.forName(s_ClassName);
            con = DriverManager.getConnection(s_URL,username,password);           
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ket noi khong thanh cong!");
        }  
    }
    
    public boolean KetNoi()
    {   
        try {
            Class.forName(s_ClassName);
            con = DriverManager.getConnection(s_URL,username,password);           
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ket noi khong thanh cong");
            return false;
        }  
    }
    
    public ResultSet TruyVan(String sqlCommand)
    {
        Statement st = null;
        ResultSet rs = null;
        try {       
            st = con.createStatement();
            rs = st.executeQuery(sqlCommand);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Thuc thi truy van khong thanh cong:\n" + sqlCommand);
        } 
        return rs;
    }
    
    public int ThemXoaSua(String sqlCommand)
    {
        Statement st = null;
        int d = 0;
        try {       
            st = con.createStatement();
            d = st.executeUpdate(sqlCommand);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Thuc thi them xoa sua khong thanh cong:\n" + sqlCommand);
        }
        if(d==0)
                JOptionPane.showMessageDialog(null,"Thuc thi them xoa sua khong thanh cong:\n" + sqlCommand);
        return d;
    }
    
    public boolean ThucThi(String sSQL)
    {
        Statement st = null;
        boolean isSuccessed = false;
        try {
            isSuccessed = st.execute(sSQL);
        } catch (SQLException ex) {
            Logger.getLogger(DATABASE.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isSuccessed;
    }
    
    //public static void main(String[] args) {
    //    DATABASE mdb = new DATABASE();
//        
//        //thực hiện câu select
//        try {
//            ResultSet rs = mdb.TruyVan("select * from NhanVien");
//            ResultSetMetaData md  = rs.getMetaData();
//            int numColumns = md.getColumnCount();
//            while(rs.next())
//            {
//                for(int i=1;i<=numColumns;i++)
//                    System.out.print(rs.getObject(i).toString() + "  ");
//                System.out.println();
//            }
//        } catch (SQLException | NullPointerException ex) {
//            JOptionPane.showMessageDialog(null,"Thuc thi truy van khong thanh cong");
//            System.out.print(ex.toString());
//        }  
//        
//        //thực hiện câu insert
//        mdb.ThemXoaSua("insert into NHANVIEN values(N'VÕ TẤN DŨNG','08/02/1981',N'100A Nguyễn Hữu Đạt Q.Tân Phú TPHCM','0913605570',2)");
//        //thực hiện câu delete
//        mdb.ThemXoaSua("delete from NHANVIEN where MaNhanVien=1");
//        //thực hiện câu update
//        mdb.ThemXoaSua("update NHANVIEN set HoTenNhanVien=N'LÊ TẤN AAAA' where HoTenNhanVien=N'NGUYỄN TẤN TÈO'");
//        
//        //thực hiện câu tạo bảng
//        //String sCreateTable = "CREATE TABLE [XXX] ([TenThamSo] [nvarchar](40) NOT NULL,[GiaTri] [int] NULL,CONSTRAINT [PK_THAMSOXXX] PRIMARY KEY (TenThamSo))";
//        String sCreateTable="CREATE TABLE XXX ("
//                    + "UID INT NOT NULL,"
//                    + "NAME VARCHAR(45) NOT NULL,"
//                    + "DOB DATE NOT NULL,"
//                    + "EMAIL VARCHAR(45) NOT NULL,"
//                    + "PRIMARY KEY (UID))";     
//        //mdb.ThemXoaSua(sCreateTable);
//    }
}
