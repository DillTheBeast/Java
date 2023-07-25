import java.util.Scanner;

public class PlayList {
    //Uses Node and LinkedList files
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        boolean done = false;
        boolean done1 = false;
        String songAnswer;
        String doneAnswer;
        String certainSpotAnswer;
        int certainSpot;
        LinkedList playList = new LinkedList(new Node("PlayList"));
        while(done == false) {
            System.out.println("What is the name of the song that you want to add? ");
            System.out.println("But if you want to delete a song, type d. ");
            songAnswer = Scan.nextLine();
            if(songAnswer.equals("d")) {
                //Need to do this
                System.out.println("What spot do you want to delete?");
                certainSpot = Scan.nextInt();
                if(playList.spotChecker(certainSpot)) {

                }
            }
            else {
                while(done1 == false) {
                    System.out.println("Would you like to add this song to the end of the playtlist or a certatin point?");
                    System.out.println("Type y to add to end and n to add to a certain spot.");
                    certainSpotAnswer = Scan.nextLine();
                    if(certainSpotAnswer.equals("y")) {
                        //Add to end
                        playList.append(new Node(songAnswer));
                        System.out.println("Your new playlist is: ");
                        playList.printList();
                        done1 = true;
                    }
                    else if(certainSpotAnswer.equals("n")) {
                        //Certain spot
                        System.out.println("Type the number spot you would like to add the song to");
                        certainSpot = Scan.nextInt();
                        if(playList.spotChecker(certainSpot)) {
                            playList.add(new Node(songAnswer), certainSpot);
                            System.out.println("Your new playlist is: ");
                            playList.printList();
                            done1 = true;
                        }
                        else {
                            System.out.println("This spot has not been filled yet so I am adding it to the last spot");
                            playList.append(new Node(songAnswer));
                            System.out.println("Your new playlist is: ");
                            playList.printList();
                            done1 = true;
                        }
                    }
                    else {
                        System.out.println("That is not an option");
                    }
                }
            }
        }

    }
}
