//Object Class --> tidak butuh main method
public class Friend {
    //property class
    String nama;
    int usia;
    String hobi;
    String cita;
   

    //Construcuor
    public Friend(String n, int u, String h, String c) {
        nama = n; 
        usia = u;
        hobi = h;
        cita = c;

    }

    //method untuk menampilkan data
   public void print() {
        System.out.println( "nama:" + nama);
        System.out.println( "usia:" + usia);
        System.out.println( "hobi:" + hobi);
        System.out.println( "cita:" + cita);
        System.out.println("======================");
    
    }

}
