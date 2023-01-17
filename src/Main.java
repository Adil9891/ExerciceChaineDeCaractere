public class Main {
    public static void main(String[] args) {
        String chaine1 = "robe 5;pantalon 2";
        String chaine2 = "robe 100;pantalon 100";//
        double total = 0;
        String[] tabQuantite = chaine1.split(";");
        String[] tabPrix = chaine2.split(";");
        for (int i = 0; i < tabQuantite.length; i++) {
            String v1 = tabQuantite[i].split(" ")[0].toString().replace(" ","");
            String v2 = tabQuantite[i].split(" ")[1].toString().replace(" ","");
            for (int j = 0; j < tabPrix.length; j++)
            {
                String vPrix1 = tabPrix[i].split(" ")[0].toString().replace(" ","");
                String vPrix2 = tabPrix[i].split(" ")[1].toString().replace(" ","");

                if (vPrix1.equals(v1) ){
                    total+=Double.parseDouble(v2) * Double.parseDouble(vPrix2);
                    break;
                } else if (vPrix1.equals(v2)){
                    total+=Double.parseDouble(v2) * Double.parseDouble(vPrix1);
                    break;
                } else if (vPrix2.equals(v1)){
                    total+=Double.parseDouble(v1) * Double.parseDouble(vPrix2);
                    break;
                } else if (vPrix2.equals(v2)){
                total+=Double.parseDouble(v1) * Double.parseDouble(vPrix1);
                    break;
                }
            }
            }
        System.out.println("Total: " + total);

        }
    }










