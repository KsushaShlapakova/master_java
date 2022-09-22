public class MusicBand {

    private String name;
    private String genre;
    private int membersCount;
    private boolean isActive;
    public MusicBand(String name, String genre, int memberCount, boolean isActive)
    {
        this.name=name;
        this.genre=genre;
        this.membersCount=memberCount;
        this.isActive=isActive;
    }

    public String getName()
    {
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public int getMemberCount() {
        return membersCount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void getInfo()
    {
        System.out.println("Music band: name " + name + ", genre " + genre + ", members count " +
                membersCount + ", activity " + isActive + ".");
    }
}

