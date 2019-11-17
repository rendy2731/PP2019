import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P7_1 {
     /* 1 .Avenger : End game
        title : Avenger : Endgame
        release : 24 April 2019
        duration : 3 jam 1 menit
        genre : Adventure,Sci-fi,action
        sinopsis : "Continuing the Avengers Infinity War, where after Thanos managed to get all infinity stones and destroy 50% of all living things in the universe. Will the Avengers succeed in defeating Thanos?"
        */

        /* 2. Spiderman : Far From Home
        title : Spiderman : Far From Home
        release : 3 juli 2019
        duration : 2 jam 9 menit
        genre : Action, Adventure, Sci-Fi
        sinopsis : Peter Parker (Tom Holland) is visiting Europe for a long vacation with his friends. Unfortunately, Parker could not calmly enjoy his vacation, because Nick Fury came suddenly in his hotel room. While in Europe, Peter had to face many enemies ranging from Hydro Man, Sandman and Molten Man."
        */

        /*3. Venom
        judul : Venom
        release : 3 oktober 2018
        duration : 2 jam 20 menit
        genre : Action, Sci-Fi, Thriller 
        sinopsis : "A journalist, Eddie Brock (Tom Hardy) wants to make an investment case for the discovery led by Dr. Carlton Drake (Riz Ahmed). Because of his investigation, Eddie visited Dr.'s lab Calrlton Drake. Everything is intended to prove that Dr. Carlton Drake is doing an evil act using Symbiote"
        */

        /*4. Thor : Ragnarok
        title : Thor : Ragnarok
        release : 10 oktober 2017
        duration : 2 jam 10 menit
        genre :   Action, Adventure, Comedy 
        sinopsis : "Imprisoned, the great Thor found himself in a deadly gladiatorial contest against Hulk, his former ally. Thor must fight to survive and race against time to prevent Hela who is very strong from destroying Asgardian homes and civilizations."
        */ 

    static HashMap <Integer, ArrayList<String>> film =  new HashMap<>();
    static Scanner sep = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            showFilm();
            System.out.println("(a)Add or (r)Remove or (d)Detail or (s)Search or (e)Exit");
            System.out.println("input huruf sesuai menu");
            String abjd = sep.nextLine();

            if (abjd.equals("a")) {
                System.out.println("input index");
                int add = sep.nextInt();
                sep.nextLine();
                add(add);
            } else if (abjd.equals("r")) {
                System.out.println("input index yang ingin dihapus");
                int remove = sep.nextInt();
                remove(remove);
            } else if (abjd.equals("d")) {
                System.out.println("input index detail");
                int detail = sep.nextInt();
                detail(detail);
            } else if (abjd.equals("s")){
                System.out.println("input nama film yang ingin dicari");
                String search = sep.nextLine();
                System.out.printf("hasil pencarian dari %s :", search);
                System.out.println();
                search(search);
            } else if (abjd.equals("e")){
                run = false;
            }
        }
    }
    
    public static void detail(int index){
        System.out.println("judul\t:" + film.get(index).get(0));
        System.out.println("Rilis\t:" + film.get(index).get(1));
        System.out.println("Durasi\t:" + film.get(index).get(2));
        System.out.println("Genre\t:" + film.get(index).get(3));
        System.out.println("Sinopsis:" + film.get(index).get(4));
        System.out.println("cast\t:" + film.get(index).get(5));
    }

    public static void remove(int index) {
        film.remove(index);
    }
    
    public static void showFilm(){
        film.forEach((k, v) -> {
            System.out.println(k+". "+v.get(0));
        });
    }
    
    public static void title(int index){
        System.out.println(film.get(index).get(0));
    }
    
    public static void add(int index){
        ArrayList<String> filmDetail = new ArrayList<>();

        System.out.print("Judul: ");
		String title = sep.nextLine();
		System.out.print("Rilis: ");
		String release = sep.nextLine();
		System.out.print("Durasi: ");
		String duration = sep.nextLine();
		System.out.print("Genre: ");
		String genre = sep.nextLine();
		System.out.print("Sinopsis: ");
		String synopsis = sep.nextLine();
		System.out.print("Cast: ");
        String casting = sep.nextLine();

        filmDetail.add(title);
        filmDetail.add(release);
        filmDetail.add(duration);
        filmDetail.add(genre);
        filmDetail.add(synopsis);
        filmDetail.add(casting);
        film.put(index, filmDetail);    

    } 
    
    public static void search(String indexAgain) {
        ArrayList<Integer> movieAgain = new ArrayList<>();
        try{
            film.forEach((k, v) -> {
                if (v.get(0).toLowerCase().contains(indexAgain.toLowerCase())) {
                    movieAgain.add(k);
                }
            });
            for (Integer index : movieAgain) {
                title(index);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.printf("film tidak ditemukan %s\n" , indexAgain);
        }
    }

}
