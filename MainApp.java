package gb2.lesson8.lesson8dz;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.sql.SQLException;


public class MainApp {

    public static void main(String[] args) throws JsonProcessingException, SQLException {
        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();
    }
}
