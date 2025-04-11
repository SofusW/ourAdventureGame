package game.items;

import java.util.Collections;
import java.util.List;

public class Items {

        String name;
        int value;


        public Items(String name, int value){
            this.name = name;
            this.value = value;
        }

        public String getName(){
            return name;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value){
            this.value = value;
        }

    public static void sortValue(List<Items> person) {

        Collections.sort(person, new ValueComparator());

    }

    public String toString() {

            StringBuilder sb = new StringBuilder();

            sb.append(name);

            while(sb.length() < 20) {
                sb.append(" ");
            }

            sb.append("value: " + value);

            return sb.toString();
    }


}

