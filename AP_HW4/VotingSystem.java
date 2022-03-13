package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting();
        voting.setQuestion(question);
        voting.setAnonymous(isAnonymous);
        voting.setType(type);
        for (String choice : choices) {
            voting.createChoices(choice);
        }
        votingList.add(voting);
    }

    public Voting getVoting(int index) {
        return votingList.get(index);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void printResults(int index) {
        votingList.get(index).printResults();
    }

    public void printVoters(int index) {
        votingList.get(index).printVoters();
    }

    public void printVoting(int index) {
        String question;
        question = votingList.get(index).getQuestion();
        ArrayList<String> choices = votingList.get(index).getChoices();
    }
}
