import java.util.Random;

public class Deck {
    String[] suit= {"spades","hearts","diamonds","clubs"};
    int[] rank= {2,3,4,5,6,7,8,9,10,11,12,13,1};
    Card[] cards;

    public Deck(Card[] cards) {
        this.cards=cards;
    }
    public Card[] generate(Card[] cards) {
        int a=0;
        for(int i=0;i<suit.length;i++) {
            for(int j=0; j<rank.length;j++) {
                cards[a]=new Card(suit[i], rank[j]);
                if(rank[j]==1) {
                    System.out.println(cards[a].suit+" "+"Ace");
                    a++;
                    continue;
                }
                if(rank[j]==11) {
                    System.out.println(cards[a].suit+" "+"Jack");
                    a++;
                    continue;
                }
                if(rank[j]==12) {
                    System.out.println(cards[a].suit+" "+"Queen");
                    a++;
                    continue;
                }
                if(rank[j]==13) {
                    System.out.println(cards[a].suit+" "+"King");
                    a++;
                    continue;
                }
                System.out.println(cards[a]);
                a++;
            }
        }
        return cards;
    }
    public void shuffle(Card[] cards) {
        Random random=new Random();
        for(int i=0;i<52;i++) {
            //random for remaining positions
            int r=i+random.nextInt(52-i);
            //swap the value
            Card temp=cards[r];
            cards[r]=cards[i];
            cards[i]=temp;
        }
        System.out.println("----------The card after shuffle is---------- ");
        for(int a=0;a<52;a++) {
            if(cards[a].rank==1) {
                System.out.println(cards[a].suit+" "+"Ace");
                continue;
            }
            if(cards[a].rank==11) {
                System.out.println(cards[a].suit+" "+"Jack");
                continue;
            }
            if(cards[a].rank==12) {
                System.out.println(cards[a].suit+" "+"Queen");
                continue;
            }
            if(cards[a].rank==13) {
                System.out.println(cards[a].suit+" "+"King");
                continue;
            }
            System.out.println(cards[a]);
        }
    }
}
