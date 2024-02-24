module gb.diplomgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens gb.diplomgame to javafx.fxml;
    exports gb.diplomgame;
}