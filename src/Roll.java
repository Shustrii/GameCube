/****
 * *
 * * Description: this program show you imitation game cube with equal chance of dropping facet;
 */
public class Roll {
    public static void main(String[] args) {
    int rand=(int)(Math.random()*6);
    if (rand==1)
        System.out.println("Fell out 1");
    else if (rand==2)
        System.out.println("Fell out 2");
    else if (rand==3)
        System.out.println("Fell out 3");
    else if (rand==4)
        System.out.println("Fell out 4");
    else if (rand==5)
        System.out.println("Fell out 5");
    else if (rand==6)
        System.out.println("Fell out 6");
    }
}
