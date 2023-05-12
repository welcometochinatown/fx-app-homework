module ru.home.java2.homework.fxapphomework {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ru.home.java2.homework.fxapphomework to javafx.fxml;
    exports ru.home.java2.homework.fxapphomework;
}