package org.exemple.models;

import java.time.Instant;

public class Survey {
    private String question;
    private Instant date;
    private boolean didAnswer;
    private SurveyAnswer answers;

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public Instant getDate() {
        return date;
    }
    public void setDate(Instant date) {
        this.date = date;
    }
    public boolean isDidAnswer() {
        return didAnswer;
    }
    public void setDidAnswer(boolean didAnswer) {
        this.didAnswer = didAnswer;
    }
    public SurveyAnswer getAnswers() {
        return answers;
    }
    public void setAnswers(SurveyAnswer answers) {
        this.answers = answers;
    }

    
}
