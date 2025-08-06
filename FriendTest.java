//Driver Class --> butuh main method 
public class FriendTest {
    public static void main(String[] args) {
        //method object
        Friend Elzhar = new Friend( "Elzhar", 16, "masak", "fullstack developer");
        Elzhar.print();
        Friend Azizi = new Friend("Azizi", 16, "nonton darkor", "dokter" );
        Azizi.print();
        Friend Grisli = new Friend("Grisli", 16, "belajar", "data scientist");
        Grisli.print();
        Friend Rohman = new Friend("Rohman", 15, "lari", "web designer");
        Rohman.print();
        Friend Rahman = new Friend("Rahman", 15, "olahraga", "kerja diluar negeri");
        Rahman.print();
        Friend Anggita = new Friend("Anggita", 16, "mendengarkan musik", "kerja diluar negeri");
        Anggita.print();

    }
    
}
