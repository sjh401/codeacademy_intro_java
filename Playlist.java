import java.util.ArrayList;

class Playlist {
  //1
  public static void main(String[] args) {
    //2
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>(); 
    //3
    desertIslandPlaylist.add("Sunshine");
    desertIslandPlaylist.add("Am I a Psycho");
    desertIslandPlaylist.add("That's My Kind of Night");
    desertIslandPlaylist.add("Forest Whitaker");
    desertIslandPlaylist.add("Pink Venom");
    desertIslandPlaylist.add("Feeling Good");
    desertIslandPlaylist.add("Ain't No Sunshine");
    //4
    System.out.println(desertIslandPlaylist);
    //5
    System.out.println(desertIslandPlaylist.size());
    //6
    desertIslandPlaylist.remove(3);
    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist.size());
    //7 - 8
    int songA = desertIslandPlaylist.indexOf("Ain't No Sunshine");
    int songB = desertIslandPlaylist.indexOf("Sunshine");
    // 9
    String songTitleA = desertIslandPlaylist.get(songA);
    String songTitleB = desertIslandPlaylist.get(songB);
    // 10
    desertIslandPlaylist.set(songB, songTitleA);
    //11
    desertIslandPlaylist.set(songA, songTitleB);
    System.out.println(desertIslandPlaylist);
  }
  
}