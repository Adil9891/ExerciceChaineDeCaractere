import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        String strQuantite = "robe 1;pantalon 2;chemise 6;chaussure 4";
        String strPrix = "robe 200;pantalon 100;chemise 50;chaussure 25";
        double total = 0;
        HashMap<String, Double> hashQuantite = new HashMap<String, Double>();
        HashMap<String, Double> hashPrix = new HashMap<String, Double>();
        String[] t1 = strQuantite.split(";");
        String[] t2 = strPrix.split(";");
        //HashMap Prix
        for (String str : t2) {
            String k = str.split(" ")[0];
            String v = str.split(" ")[1];
            hashPrix.put(k, Double.parseDouble(v));
        }
        //HashMap Quantité
        for (String str : t1) {
            String k = str.split(" ")[0];
            String v = str.split(" ")[1];
            hashQuantite.put(k, Double.parseDouble(v));
            total+=Double.parseDouble(v)*hashPrix.get(k);
        }


       /* for (String element : hashQuantite.keySet()) {
            total += hashQuantite.get(element) * hashPrix.get(element);


        }*/
        System.out.println(total);
    }
}












