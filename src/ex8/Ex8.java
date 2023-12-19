package ex8;

import java.util.ArrayList;

public class Ex8 {
    public ArrayList<Integer> list;
    public ArrayList<Integer> listT1;
    public ArrayList<Integer> listT2;
    public Integer n;
    public Integer comptPairs;
    public Integer comptImpairs;

    public ArrayList<Integer> getListT1() {
        return listT1;
    }

    public ArrayList<Integer> getListT2() {
        return listT2;
    }

    public Integer getComptPairs() {
        return comptPairs;
    }

    public Integer getComptImpairs() {
        return comptImpairs;
    }


    public Ex8(ArrayList<Integer> list, Integer n) {
        this.list = list;
        this.n = n;
    }

    public void PareIparer(ArrayList<Integer> list, Integer n) {
        comptPairs = 0;
        comptImpairs = 0;
        listT1 = new ArrayList<>();
        listT2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0) {
                listT1.add(list.get(i));
                System.out.println(listT1);
                comptPairs = comptPairs +1;
            }
            if (list.get(i)%2 != 0) {
                listT2.add(list.get(i));
                System.out.println(listT2);
                comptImpairs = comptImpairs + 1;
            }
        }
    }
}
