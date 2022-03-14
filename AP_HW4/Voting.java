package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;

public class Voting {
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    public ArrayList<String> getChoices() {
        ArrayList<String> choices_list = new ArrayList<>();
        for (String choice : choices.keySet()) {
            choices_list.add(choice);
        }
        return choices_list;
    }

    public void createChoices(String choice) {
        choices.put(choice, new HashSet<>());
    }

    public void vote(Person voter, ArrayList<String> voterChoices) {
        Vote vote = new Vote(voter, "1400/3/20");
        for (String Choices : voterChoices) {
            for (Entry<String, HashSet<Vote>> entry : choices.entrySet()) {
                if (entry.getKey().equals(Choices)) {
                    entry.getValue().add(vote);
                }
            }
        }
    }

    public void vote(Person voter) {
        Vote vote = new Vote(voter, "1400/3/20");
        ArrayList<String> Choices = getChoices();
        Random rand = new Random();
        int random = rand.nextInt(Choices.size());
        for (Entry<String, HashSet<Vote>> entry : choices.entrySet()) {
            if (Choices.get(random).equals(entry.getKey())) {
                entry.getValue().add(vote);
            }
        }
    }


    public void printResults() {
        for (Entry<String, HashSet<Vote>> entry : choices.entrySet()) {
            System.out.println(entry.getKey() + " : number of people who chose this choice : " + entry.getValue().size());
        }
    }

    public void printVoters() {
        for (Entry<String, HashSet<Vote>> entry : choices.entrySet()) {
            System.out.print(entry.getKey() + " : List of people who chose this choice :\n");
            for (Vote vote : entry.getValue()) {
                System.out.print(vote.getVoter().toString()+" ");
            }
            System.out.println();
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }
}
