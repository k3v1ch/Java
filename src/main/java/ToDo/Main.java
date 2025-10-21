package ToDo;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application  {
private  final LinkedTasks model = new LinkedTasks();
private final ObservableList<String> uiItems = FXCollections.observableArrayList();
private ListView<String> listView;
private TextField input;
private Label status;

    public static void main(String[] args) {
        launch(args);}
    @Override
    public void start(Stage stage) throws Exception {
    stage.setTitle("ToDo List");
    input = new TextField();
    input.setPromptText("Новая задача...");
        Button addBtn = new Button("Добавить");
        addBtn.setDefaultButton(true);

        HBox inputBox
    }
}