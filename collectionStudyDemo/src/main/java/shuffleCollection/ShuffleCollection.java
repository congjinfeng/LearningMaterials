package shuffleCollection;

import java.util.*;

/**
 * @author cong
 * @version 1.0
 * @ClassName: ShuffleCollection
 * @Descrip:
 * @since 2019/8/27 20:59
 */
public class ShuffleCollection {
    public static void main(String[] args) {
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"♥", "♢", "♤", "♣"};

        List<String> pukepai = new ArrayList<String>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < color.length; j++) {
                pukepai.add(color[j] + number[i]);
            }
        }
        pukepai.add("小王");
        pukepai.add("大王");

        Collections.shuffle(pukepai);

        ArrayList play1 = new ArrayList();
        ArrayList play2 = new ArrayList();
        ArrayList play3 = new ArrayList();
        ArrayList lastThree = new ArrayList();

        for (int k = 0; k < pukepai.size(); k++) {
            if (k > pukepai.size() - 4) {
                lastThree.add(pukepai.get(k));
            } else if (k % 3 == 0) {
                play1.add(pukepai.get(k));
            } else if (k % 3 == 1) {
                play2.add(pukepai.get(k));
            } else if (k % 3 == 2) {
                play3.add(pukepai.get(k));
            }
        }
        getAllList(play1);
       getAllList(play2);
        getAllList(play3);
        getAllList(lastThree);

    }

    public static void getAllList(List<String> list){
        for(String temp:list){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
}
