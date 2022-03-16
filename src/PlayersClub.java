public class PlayersClub {
    public static void main(String[] args) {
        ClubOwner clubOwner = new ClubOwner("James H");
        clubOwner.setPlayer("asta", 26, 55000, 1);
        clubOwner.setPlayer("levi", 27, 45000, 2);
        clubOwner.setPlayer("melodies", 30, 50000, 3);
        clubOwner.setPlayer("kim jo", 25, 40000, 4);
        clubOwner.setPlayer("yami", 29, 75000, 5);
        clubOwner.setPlayer("tanjiro", 20, 74000, 6);
        clubOwner.setPlayer("gon", 26, 65000, 7);
        System.out.println(String.format("%-13s %-5s %-8s", "Player Name", "Age", "Salary"));
        for (int pos = 1; pos <= 7; pos++)
            System.out.println(clubOwner.getPlayer(pos));
        System.out.println("\nHighest paid player : " + clubOwner.getHighestPaidPlayer());
    }
}
