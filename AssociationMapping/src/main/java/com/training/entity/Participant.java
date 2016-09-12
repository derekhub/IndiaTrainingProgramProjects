package com.training.entity;

public class Participant {

    private long participantCode;
    private String participantName;

    public Participant() {
        super();
    }

    public Participant(long participantCode, String participantName) {
        super();
        this.participantCode = participantCode;
        this.participantName = participantName;
    }

    public long getParticipantCode() {
        return participantCode;
    }

    public void setParticipantCode(long participantCode) {
        this.participantCode = participantCode;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    @Override
    public String toString() {
        return "Participant [participantCode=" + participantCode + ", participantName=" + participantName + "]";
    }

}
