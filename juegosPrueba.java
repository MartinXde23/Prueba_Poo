public class juegosPrueba {
    public String nombreJ;
    public int anoPublic;
    public juegosPrueba(String nombreJ, int anoPublic){
        this.nombreJ = nombreJ;
        this.anoPublic = anoPublic;
    }
    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }
    public String getNombreJ() {
        return nombreJ;
    }
    public void setAnoPublic(int anoPublic){
        this.anoPublic = anoPublic;
    }
    public int getAnoPublic(){
        return anoPublic;
    }
    public void mostrarInfo(){
        System.out.println("El juego: "+nombreJ+" fue publidado en: "+anoPublic);
    }
}
class genero extends juegosPrueba{
    public String generoJ;
    public genero(String nombreJ, int anoPublic, String generoJ){
        super(nombreJ, anoPublic);
        this.generoJ = generoJ;
    }
     public void setGeneroJ(String generoJ){
        this.generoJ = generoJ;
     }
     public String getGeneroJ(){
        return generoJ;
     }
     public void mostrarInfo(){
        System.out.println("El juego: "+nombreJ+" es de: "+generoJ);
     }
}
class desarrolladora extends juegosPrueba{
    String desarrolladoraJ;
    public desarrolladora(String nombreJ, int anoPublic, String desarrolladoraJ){
        super(nombreJ, anoPublic);
        this.desarrolladoraJ = desarrolladoraJ;
    }
    public void setDesarrolladoraJ(String desarrolladoraJ) {
        this.desarrolladoraJ = desarrolladoraJ;
    }
    public String getDesarrolladoraJ() {
        return desarrolladoraJ;
    }
    public void mostrarInfo(){
        System.out.println("El juego: "+nombreJ+" fue desarrollado por: "+desarrolladoraJ);
    }

    public static void main (String[]args) {
        try{
            juegosPrueba juego1 = new juegosPrueba("Gta V", 2013);
            genero juego2 = new genero("Minecraft",2014,"Aventura");
            desarrolladora juego3 = new desarrolladora("Warzone", 2019, "Activision");
            juego1.mostrarInfo();
            juego2.mostrarInfo();
            juego3.mostrarInfo();
            
            int lista[];
            lista = new int[3];
            int a = juego1.getAnoPublic();
            int b = juego2.getAnoPublic();
            int c = juego3.getAnoPublic();
            lista[0] = a;
            lista[1] = b;
            lista[2] = c;

            System.out.println("Lista con los años de publicación: "+lista[0]+" "+lista[1]+" "+lista[2]);
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}