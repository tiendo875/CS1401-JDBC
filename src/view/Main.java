
package view;

import entity.Category;
import java.util.List;
import model.CategoryDAO;


public class Main {
    public static void main(String[] args) {
        CategoryDAO cdb=new CategoryDAO();
        List<Category> list=cdb.getAll();
        System.out.println(list.get(0).getName());
    }
    
}
