
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Category;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class CategoryDAO {
     DBContext db;
     Connection con;
     public CategoryDAO(){
         db=new DBContext();
         try{
            con=db.getConnection();
         }catch(Exception e){
             System.out.println(e);
         }
     }
     public List<Category> getAll(){
         List<Category> list=new ArrayList<>();
         String sql="select * from Categories";
         try{
             PreparedStatement st=con.prepareStatement(sql);
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                 Category c=new Category();
                 c.setId(rs.getString(1));
                 c.setName(rs.getString(2));
                 c.setDescribe(rs.getString(3));
                 list.add(c);
             }
         }catch(SQLException e){
             System.out.println(e);
         }
         return list;
     }
}
