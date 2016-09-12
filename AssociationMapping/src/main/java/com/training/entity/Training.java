package com.training.entity;

import java.util.Set;

public class Training {
    private int trainingCode; // First variable will always be primary key
    private String trainerName;

    private Set<Participant> participants;

    public Training() {
        super();
    }

    public Training(int trainingCode, String trainerName, Set<Participant> participants) {
        super();
        this.trainingCode = trainingCode;
        this.trainerName = trainerName;
        this.participants = participants;
    }

    public int getTrainingCode() {
        return trainingCode;
    }

    public void setTrainingCode(int trainingCode) {
        this.trainingCode = trainingCode;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Training [trainingCode=" + trainingCode + ", trainerName=" + trainerName + ", participants="
                + participants + "]";
    }

}
