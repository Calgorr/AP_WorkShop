import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Note> notes = new ArrayList<>();
        try (FileInputStream Fin = new FileInputStream("Export\\Notes.txt"); ObjectInputStream in = new ObjectInputStream(Fin)) {
            notes = (ArrayList<Note>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find the file");
        } catch (IOException e) {
            System.out.println("I/O occurred");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }
        while (true) {
            System.out.println("""
                    1-Add
                    2-Remove
                    3-Notes
                    4-Export
                    5-Exit""");
            int order = 0;
            boolean suc;
            do {
                try {
                    order = input.nextInt();
                    suc = true;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Wrong input try again");
                    suc = false;
                }
            } while (!suc);
            input.nextLine();
            if (order == 1) {
                System.out.println("Name of the note :");
                String name = input.nextLine();
                System.out.println("Write the note :");
                String content = input.nextLine();
                System.out.println("Current date :");
                String date = input.nextLine();
                Note note = new Note(name, content, date);
                notes.add(note);
            } else if (order == 2) {
                int index = 1;
                for (Note note : notes) {
                    System.out.println((index++) + ". " + note.getNameOfNote() + " " + note.getDateOfNote());
                }
                int indexOfNote = -1;
                boolean succ;
                do {
                    try {
                        indexOfNote = input.nextInt();
                        succ = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Wrong input try again");
                        succ = false;
                    }
                } while (!succ);
                input.nextLine();
                notes.remove(indexOfNote - 1);
            } else if (order == 3) {
                int index = 1;
                for (Note note : notes) {
                    System.out.println((index++) + ". " + note.getNameOfNote() + " " + note.getDateOfNote());
                }
                int indexOfNote = -1;
                boolean succ;
                do {
                    try {
                        indexOfNote = input.nextInt();
                        succ = true;
                    } catch (InputMismatchException e) {
                        input.nextLine();
                        System.out.println("Wrong input try again");
                        succ = false;
                    }
                } while (!succ);
                input.nextLine();
                Note note = notes.get(indexOfNote - 1);
                System.out.println(note.getContentOfNote());
            } else if (order == 4) {
                int index = 1;
                for (Note note : notes) {
                    System.out.println((index++) + ". " + note.getNameOfNote() + " " + note.getDateOfNote());
                }
                int indexOfNote = -1;
                boolean succ;
                do {
                    try {
                        indexOfNote = input.nextInt();
                        succ = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Wrong input try again");
                        succ = false;
                    }
                } while (!succ);
                input.nextLine();
                Note note = notes.get(indexOfNote - 1);
                try (FileOutputStream Fout = new FileOutputStream("Export\\Notes.txt");
                     ObjectOutputStream out = new ObjectOutputStream(Fout)) {
                    out.writeObject(note);
                } catch (FileNotFoundException e) {
                    System.out.println("Cannot open the file");
                } catch (IOException e) {
                    System.out.println("I/O occurred");
                }
            } else if (order == 5) {
                try (FileOutputStream Fout = new FileOutputStream("Export\\Notes.txt");
                     ObjectOutputStream out = new ObjectOutputStream(Fout)) {
                    out.writeObject(notes);
                } catch (FileNotFoundException e) {
                    System.out.println("Cannot open the file");
                } catch (IOException e) {
                    System.out.println("I/O occurred");
                }

                return;
            }

        }
    }
}
