package com.doctorAppointmentBookingSystem.model.viewModel;

/**
 * Created by Edi on 30-Apr-17.
 */
public class PatientBasicViewModel {
    private String firstName;

    private String lastName;

    private String EGN;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }
}
