package Lab2.Problem4;

import java.time.LocalDate; // Import thư viện LocalDate

public class Photographer {

    private String Session ; 
    private int SessionDuration ; 
    private LocalDate date ;

    public Photographer () {}

    public String getSession() {
        return Session;
    }

    public void setSession(String session) {
        Session = session;
    }

    public int getSessionDuration() {
        return SessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        SessionDuration = sessionDuration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    


}
