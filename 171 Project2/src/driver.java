import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        int firstScore=0;
        int secondScore=0;
        Card[] card1=new Card[52];
        Card[] firstHand=new Card[5];
        Card[] secondHand=new Card[5];
        Deck deck=new Deck(card1);
        System.out.println("----------------Problem 1------------------");
        card1=deck.generate(card1);
        deck.shuffle(card1);

        //generate two hands for two players

        //Problem 2
        System.out.println("----------------Problem 2------------------");
        DrawCard(card1,firstHand,secondHand);

        //Problem 3
        System.out.println("----------------Problem 3------------------");
        System.out.println("First Hand: ");
        classification(firstHand);
        System.out.println("Second Hand: ");
        classification(secondHand);
        whoWins(score(firstHand,firstScore), score(secondHand,secondScore),firstHand,secondHand);

        //problem 4
        System.out.println("----------------Problem 4------------------");
        Problem4();
    }

    public static void Problem4() {
        boolean b = true;
        boolean b2 = true;
        Card[] firstHandP4 = new Card[5];
        Card[] secondHandP4 = new Card[5];
        int firstScoreP4 = 0;
        int secondScoreP4 = 0;
        readFromUser(firstHandP4);

        while(b) {
            //if input is wrong
            if (firstHandP4[0] == null || firstHandP4[1] == null || firstHandP4[2] == null || firstHandP4[3] == null || firstHandP4[4] == null) {
                System.out.println("Please enter again");
                readFromUser(firstHandP4);
            } else {
                System.out.println("This is your first hand.");
                classification(firstHandP4);
                b = false;
            }
        }

        readFromUser(secondHandP4);
        while(b2){
            //if input is wrong
            if (secondHandP4[0] == null || secondHandP4[1] == null || secondHandP4[2] == null || secondHandP4[3] == null || secondHandP4[4] == null) {
                System.out.println("Please enter again");
                readFromUser(secondHandP4);
                break;
            } else {
                System.out.println("This is your second hand.");
                classification(secondHandP4);
                b2 = false;
            }
        }
        whoWins(score(firstHandP4, firstScoreP4), score(secondHandP4, secondScoreP4), firstHandP4, secondHandP4);

    }

    //print 52 cards
    public static void print(Card[] cards) {
        for(int a=0;a<cards.length;a++) {
            if(cards[a]==null) {
                System.out.print("");
                continue;
            }
            else if(cards[a].rank==1) {
                System.out.println(cards[a].suit+" "+"Ace");
                continue;
            }
            else if(cards[a].rank==11) {
                System.out.println(cards[a].suit+" "+"Jack");
                continue;
            }
            else if(cards[a].rank==12) {
                System.out.println(cards[a].suit+" "+"Queen");
                continue;
            }
            else if(cards[a].rank==13) {
                System.out.println(cards[a].suit+" "+"King");
                continue;
            }
            System.out.println(cards[a]);
        }
    }

    //randomly draw 10 cards and separate them into two hands, printout remaining cards
    public  static void DrawCard(Card[] card1,Card[] firstHand,Card[] secondHand) {
        boolean[] a=new boolean[52];
        for(int i=0;i<52;i++) {
            a[i]=true;
        }
        int i=0;
        while(i<10) {
            int b=(int)((Math.random())*52);
            //avoid having the same card
            if(a[b]==false) {
                continue;
            }
            a[b]=false;
            if(i>=5) {
                secondHand[i-5]=card1[b];
            }
            if(i<5){
                firstHand[i]=card1[b];
            }
            // set drawing cards to null
            card1[b]=null;
            i++;
        }
        System.out.println("---The first hand is---");
        print(firstHand);
        System.out.println("---The second hand is---");
        print(secondHand);
        //print out remaining cards
        System.out.println("---The remaining 42 cards are---");
        print(card1);
    }

    //sort a hand by rank
    public static void sortByRank(Card[] hand) {
        for(int i=0;i<hand.length;i++) {
            int min=i;
            for(int j=i+1;j<hand.length;j++) {
                if(hand[j].rank<hand[min].rank) {
                    min=j;
                }
            }
            Card temp=hand[i];
            hand[i]=hand[min];
            hand[min]=temp;
        }
    }

    public static int straightFlush(Card[] hand) {
        sortByRank(hand);
        if(hand[0].rank==1&&hand[1].rank==10&&hand[2].rank==11&&hand[3].rank==12&&hand[4].rank==13) {
            return 14;
        }
        //Check whether all suits are same
        for(int i=1;i<5;i++) {
            if(hand[0].suit!=hand[i].suit) {
                return 0;
            }
        }
        //Check if it is a straight
        for(int j=1;j<5;j++) {
            if(hand[j-1].rank!=((hand[j].rank)-1)) {
                return 0;
            }
        }
        return hand[4].rank;
    }

    public static int fourOfKind(Card[] hand) {
        sortByRank(hand);
        if(hand[0].rank!=hand[3].rank&&hand[1].rank!=hand[4].rank) {
            return 0;
        }
        if(hand[2].rank==1) {
            return 14;
        }
        return hand[2].rank;
    }

    public static int fullHouse(Card[] hand) {
        sortByRank(hand);
        int counter=0;
        sortByRank(hand);
        for(int i=1;i<5;i++) {
            if(hand[i-1].rank==hand[i].rank) {
                counter++;
            }
        }
        if(counter==3) {
            if(hand[2].rank==1) {
                return 14;
            }
            return hand[2].rank;
        }
        else {
            return 0;
        }
    }

    public static int flush(Card[] hand) {
        for(int i=1;i<5;i++) {
            if(hand[0].suit!=hand[i].suit) {
                return 0;
            }
        }
        return 1;
    }

    public static int straight(Card[] hand) {
        sortByRank(hand);
        if(hand[0].rank==1&&hand[1].rank==10&&hand[2].rank==11&&hand[3].rank==12&&hand[4].rank==13) {
            return 14;
        }
        for(int j=1;j<5;j++) {
            if(hand[j-1].rank!=((hand[j].rank)-1)) {
                return 0;
            }
        }
        return hand[4].rank;
    }

    public static int threeOfKind(Card[] hand) {
        sortByRank(hand);//12223 22234 34555
        if(hand[2].rank==1) {
            return 14;
        }
        if(hand[0].rank==hand[2].rank||hand[1].rank==hand[3].rank||hand[2].rank==hand[4].rank) {
            return hand[2].rank;
        }
        return 0;
    }

    public static int twoPairs(Card[] hand) {
        sortByRank(hand);//11223 12233 11233
        if((hand[0].rank==hand[1].rank&&hand[2].rank==hand[3].rank)||(hand[1].rank==hand[2].rank&&hand[4].rank==hand[3].rank)||(hand[0].rank==hand[1].rank&&hand[4].rank==hand[3].rank)) {
            return hand[3].rank;
        }
        return 0;
    }

    public static int OnePair(Card[] hand) {//12234
        int a=0;
        sortByRank(hand);
        int counter=0;
        for(int i=1;i<5;i++) {
            if(hand[i-1].rank==hand[i].rank) {
                counter++;
                a=i;
            }
        }
        if(counter==1) {
            return hand[a].rank;
        }
        else {
            return 0;
        }
    }

    public static int highCard(Card[] hand) {
        //recognize 1 as Ace(14)
        for(int i=0;i<5;i++) {
            if(hand[i].rank==1) {
                hand[i].rank=14;
            }
        }
        sortByRank(hand);
        return hand[4].rank;
    }

    public static void classification(Card[] hand) {
        if (straightFlush(hand) !=0)
        {
            System.out.println("You have a straight flush!");
        }
        else if (fourOfKind(hand) != 0)
        {
            System.out.println("You have four of a kind!");
        }
        else if (fullHouse(hand) != 0)
        {
            System.out.println("You have a full house!");
        }
        else if (flush(hand) != 0)
        {
            System.out.println("You have a flush!");
        }
        else if (straight(hand) != 0)
        {
            System.out.println("You have a straight!");
        }
        else if (threeOfKind(hand) != 0)
        {
            System.out.println("You have three of a kind!");
        }
        else if (twoPairs(hand) != 0)
        {
            System.out.println("You have two pairs!");
        }
        else if (OnePair(hand) != 0)
        {
            System.out.println("You have a pair!");
        }
        else
        {
            int highCard = highCard(hand);
            if(highCard==14) {
                System.out.println("Your highest card is Ace");
            }
            else if(highCard==13) {
                System.out.println("Your highest card is King");
            }
            else if(highCard==12) {
                System.out.println("Your highest card is Queen");
            }
            else if(highCard==11) {
                System.out.println("Your highest card is Jack");
            }
            else {
                System.out.println("Your highest card is " + highCard);
            }
        }
    }

    public static int score(Card[] hand, int y) {
        if (straightFlush(hand) != 0)
        {
            y=8;
        }
        else if (fourOfKind(hand) != 0)
        {
            y=7;
        }
        else if (fullHouse(hand) != 0)
        {
            y=6;
        }
        else if (flush(hand) != 0)
        {
            y=5;
        }
        else if (straight(hand) != 0)
        {
            y=4;
        }
        else if (threeOfKind(hand) != 0)
        {
            y=3;
        }
        else if (twoPairs(hand) != 0)
        {
            y=2;
        }
        else if (OnePair(hand) != 0)
        {
            y=1;
        }
        else
        {
            y=0;
        }
        return y;
    }

    public static void whoWins(int firstScore,int secondScore,Card[] firstHand, Card[] secondHand) {
        if(firstScore>secondScore) {
            System.out.println("First hand wins!");
        }
        else if(firstScore<secondScore) {
            System.out.println("Second hand wins");
        }
        else {
            //Straight flush case
            if(firstScore==8&&secondScore==8) {
                if(straightFlush(firstHand)>straightFlush(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(straightFlush(firstHand)<straightFlush(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    System.out.println("This is a draw.");
                }
            }
            //Four of a kind case
            else if(firstScore==7&&secondScore==7) {
                if(fourOfKind(firstHand)>fourOfKind(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(fourOfKind(firstHand)<fourOfKind(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    System.out.println("This is a draw.");
                }
            }
            //Full House case
            //player with the best three of a kind wins
            else if(firstScore==6&&secondScore==6) {
                if(fullHouse(firstHand)>fullHouse(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(fullHouse(firstHand)<fullHouse(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    System.out.println("This is a draw.");
                }
            }
            //Flush case
            //In this case, if two hands all have same suit, then we compare the highest card
            else if(firstScore==5&&secondScore==5) {
                //recognize 1 as Ace(14)
                for(int i=0;i<5;i++) {
                    if(firstHand[i].rank==1) {
                        firstHand[i].rank=14;
                    }
                    if(secondHand[i].rank==1) {
                        secondHand[i].rank=14;
                    }
                }
                sortByRank(firstHand);
                sortByRank(secondHand);
                //compare the highest card
                if(highCard(firstHand)>highCard(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(highCard(firstHand)<highCard(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                //compare remaining cards one by one
                else {
                    for(int i=3;i>=0;i--) {
                        if(firstHand[i].rank>secondHand[i].rank) {
                            System.out.println("First hand wins!");
                            break;
                        }
                        else if(firstHand[i].rank<secondHand[i].rank) {
                            System.out.println("Second hand wins!");
                            break;
                        }
                    }
                    System.out.println("This is a draw.");
                }
            }
            //Straight case
            else if(firstScore==4&&secondScore==4) {
                if(straight(firstHand)>straight(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(straight(firstHand)<straight(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    System.out.println("This is a draw.");
                }
            }
            //Three of a kind case
            else if(firstScore==3&&secondScore==3) {
                //recognize 1 as Ace(14)
                for(int i=0;i<5;i++) {
                    if(firstHand[i].rank==1) {
                        firstHand[i].rank=14;
                    }
                    if(secondHand[i].rank==1) {
                        secondHand[i].rank=14;
                    }
                }
                if(threeOfKind(firstHand)>threeOfKind(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(threeOfKind(firstHand)<threeOfKind(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    System.out.println("This is a draw.");
                }
            }
            //Two pairs case
            else if(firstScore==2&&secondScore==2) {
                int a=0;
                int b=0;
                //recognize 1 as Ace(14)
                for(int i=0;i<5;i++) {
                    if(firstHand[i].rank==1) {
                        firstHand[i].rank=14;
                    }
                    if(secondHand[i].rank==1) {
                        secondHand[i].rank=14;
                    }
                }
                //get the only card that is not in two pairs
                sortByRank(firstHand);
                if(firstHand[3].rank!=firstHand[4].rank) {
                    a=firstHand[4].rank;
                }
                else if(firstHand[0].rank!=firstHand[1].rank) {
                    a=firstHand[0].rank;
                }
                else {
                    a=firstHand[2].rank;
                }
                sortByRank(secondHand);
                if(secondHand[3].rank!=secondHand[4].rank) {
                    b=secondHand[4].rank;
                }
                else if(secondHand[0].rank!=secondHand[1].rank) {
                    b=secondHand[0].rank;
                }
                else {
                    b=secondHand[2].rank;
                }
                //compare two pairs which is bigger
                if(twoPairs(firstHand)>twoPairs(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(twoPairs(firstHand)<twoPairs(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    if(firstHand[1].rank>secondHand[1].rank) {
                        System.out.println("First hand wins!");
                    }
                    else if(firstHand[1].rank<secondHand[1].rank) {
                        System.out.println("Second hand wins!");
                    }
                    else {
                        if(a>b) {
                            System.out.println("First hand wins!");
                        }
                        else if(a<b) {
                            System.out.println("Second hand wins!");
                        }
                        else {
                            System.out.println("This is a draw.");
                        }
                    }
                }
            }
            //one pair case
            else if(firstScore==1&&secondScore==1) {
                //recognize 1 as Ace(14)
                for(int i=0;i<5;i++) {
                    if(firstHand[i].rank==1) {
                        firstHand[i].rank=14;
                    }
                    if(secondHand[i].rank==1) {
                        secondHand[i].rank=14;
                    }
                }
                sortByRank(firstHand);
                sortByRank(secondHand);//26678 66789 34566  23466 7
                if(OnePair(firstHand)>OnePair(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(OnePair(firstHand)<OnePair(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    for(int i=4;i>=0;i--) {
                        if(firstHand[i].rank>secondHand[i].rank) {
                            System.out.println("First hand wins!");
                            break;
                        }
                        else if(firstHand[i].rank<secondHand[i].rank) {
                            System.out.println("Second hand wins!");
                            break;
                        }
                        if(i==0&&firstHand[i].rank==secondHand[i].rank) {
                            System.out.println("This is a draw.");
                        }
                    }
                }
            }
            //high card case
            else {
                //recognize 1 as Ace(14)
                for(int i=0;i<5;i++) {
                    if(firstHand[i].rank==1) {
                        firstHand[i].rank=14;
                    }
                    if(secondHand[i].rank==1) {
                        secondHand[i].rank=14;
                    }
                }
                sortByRank(firstHand);
                sortByRank(secondHand);
                if(highCard(firstHand)>highCard(secondHand)) {
                    System.out.println("First hand wins!");
                }
                else if(highCard(firstHand)<highCard(secondHand)) {
                    System.out.println("Second hand wins!");
                }
                else {
                    for(int i=4;i>=0;i--) {
                        if(firstHand[i].rank>secondHand[i].rank) {
                            System.out.println("First hand wins!");
                            break;
                        }
                        else if(firstHand[i].rank<secondHand[i].rank) {
                            System.out.println("Second hand wins!");
                            break;
                        }
                        if(i==0&&firstHand[i].rank==secondHand[i].rank) {
                            System.out.println("This is a draw.");
                        }
                    }
                }
            }
        }
    }

    public static void readFromUser(Card[] hand) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string in RSRSRSRSRS format: ");
        System.out.println("R can be any one of the set (2,3,4,5,6,7,8,9,T,t,J,j,Q,q,K,k,A,a)");
        System.out.println("S can be any one of the set (C,c,H,h,S,s,D,d)");
        String answer=scanner.next();
        int rank1=0;
        int j=0;
        String suit1="";
        for(int i=0;i<answer.length();i++) {
            //even index is a rank, so check rank
            if(i%2==0) {
                if(answer.charAt(i)=='2') {
                    rank1=2;
                }
                else if(answer.charAt(i)=='3') {
                    rank1=3;
                }
                else if(answer.charAt(i)=='4') {
                    rank1=4;
                }
                else if(answer.charAt(i)=='5') {
                    rank1=5;
                }
                else if(answer.charAt(i)=='6') {
                    rank1=6;
                }
                else if(answer.charAt(i)=='7') {
                    rank1=7;
                }
                else if(answer.charAt(i)=='8') {
                    rank1=8;
                }
                else if(answer.charAt(i)=='9') {
                    rank1=9;
                }
                else if(answer.charAt(i)=='T'||answer.charAt(i)=='t') {
                    rank1=10;
                }
                else if(answer.charAt(i)=='J'||answer.charAt(i)=='j') {
                    rank1=11;
                }
                else if(answer.charAt(i)=='Q'||answer.charAt(i)=='q') {
                    rank1=12;
                }
                else if(answer.charAt(i)=='K'||answer.charAt(i)=='k') {
                    rank1=13;
                }
                else if(answer.charAt(i)=='a'||answer.charAt(i)=='A') {
                    rank1=1;
                }
                else {
                    System.out.println("You entered incorrectly!");
                    break;
                }
            }
            //odd index is a suit, so check suit
            else if(i%2!=0) {
                if(answer.charAt(i)=='C'||answer.charAt(i)=='c') {
                    suit1="clubs";
                }
                else if(answer.charAt(i)=='h'||answer.charAt(i)=='H') {
                    suit1="hearts";
                }
                else if(answer.charAt(i)=='d'||answer.charAt(i)=='D') {
                    suit1="diamonds";
                }
                else if(answer.charAt(i)=='s'||answer.charAt(i)=='S') {
                    suit1="spades";
                }
                else {
                    System.out.println("You entered incorrectly!");
                    break;
                }
            }
            Card temp=new Card(suit1,rank1);
            hand[j]=temp;
            if(i%2==1) {
                j++;
            }
        }
        if(j!=5) {

        }
        else {
            print(hand);
        }
    }
}
