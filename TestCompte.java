public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("Amal", 500);
       
        Banque stb=new Banque("STB");
        stb.addClient(new Compte("amal", 700));
        stb.addClient(new CompteEpargne("wafa",8000,0.05));
        for(Compte c :stb.getCompte()){
            System.out.println(c);
        }
        
    }
}
    

