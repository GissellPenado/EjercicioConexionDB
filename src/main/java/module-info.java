module com.tuempresa.ejercicioconexiondb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tuempresa.ejercicioconexiondb.model to javafx.base;
    opens com.tuempresa.ejercicioconexiondb to javafx.fxml;
    exports com.tuempresa.ejercicioconexiondb.controller to javafx.fxml;
    opens com.tuempresa.ejercicioconexiondb.controller to javafx.fxml;

    exports com.tuempresa.ejercicioconexiondb;
}