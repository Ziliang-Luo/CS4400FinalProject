package db_connection;


public class App {

    public static void main(String[] args) {
        User_CRUD object = new User_CRUD();
        object.create_user(3, "Zzz", "Luo",java.sql.Date.valueOf("2013-09-04"),"aiden551720@gmail.com","123","3194008322");
        //object.read_user(2);
        //object.delete_user(2);
        //object.update_user();
    }

}