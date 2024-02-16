package org.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    public PasswordField PasswordBox;
    public Label PasswordText;
    public Label AgeText;
    public PasswordField AgeBox;
    public Button Submitto;
    public Label Firstnametext;
    public PasswordField FirstNameBox;
    public Label LastNameText;
    public PasswordField LastNameBox;
    public Label GenderText;
    public RadioButton MaleToggle;
    public RadioButton FemaleToggle;
    public Label BirthdayText;
    public DatePicker BirthdayBox;
    public Label CivilStatusText;
    public PasswordField CivilStatusBox;
    public Label CountryText;
    public PasswordField CountryBox;
    public Button ClearClear;
    public Label EmailText;
    public PasswordField EmailBox;
    public Label MobileText;
    public PasswordField MobileBox;
    public Label UsernameText;
    public PasswordField UsernameBox;
    public Label PasswordText2;
    public PasswordField PasswordBox1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}