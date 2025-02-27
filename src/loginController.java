import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class loginController {
  private Stage stage;
  private Scene scene;
  private Parent root;

  @FXML
  public void switchtohome(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchtoaboutus(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("AboutUS.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchtolistbook(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("ListBook.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchtologin(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}