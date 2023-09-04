package se.lexicon.utilExamples;

import java.time.LocalDate;

public class Account {

    private String username;
    private String password;
    private Role role;
    private LocalDate registrationDate;
    private boolean status;

    public Account(String username, Role role) {
        this.username = username;
        this.role = role;
        this.status = false;
        this.registrationDate = LocalDate.now();
        newPassword();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void newPassword() {
        this.password = PasswordGenerator.generate();
    }

    public void activate() {
        this.status = true;
    }

    public void deactivate() {
        this.status = false;
    }


    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                '}';
    }
}
