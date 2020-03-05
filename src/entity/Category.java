
package entity;


public class Category {
    /*
     ID varchar(6) primary key,
   [name] nvarchar(30) ,
   describe nvarchar(50), 
    */
    private String id,name,describe;

    public Category() {
    }

    public Category(String id, String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
}
