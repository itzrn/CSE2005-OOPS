package DhanavanthiniLabClass.Assignment_04.Oue_02;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet=new Couplet("Goose and Moos");
        System.out.println("Book Name ---> "+couplet.getNamePoem());
        System.out.format("Number of Lines in '%s' ---> '%d'\n",couplet.getNamePoem(),couplet.getNumLine());

        System.out.println();
        Haiku haiku=new Haiku("Natsume Soseki");
        System.out.println("Book Name ---> "+haiku.getNamePoem());
        System.out.format("Number of Lines in '%s' ---> '%d'\n",haiku.getNamePoem(),haiku.getNumLine());

        System.out.println();
        LimeRick limeRick=new LimeRick("The Joy of Nonsense");
        System.out.println("Name Book ---> "+limeRick.getNamePoem());
        System.out.format("Number of Lines In '%s' ---> '%d'",limeRick.getNamePoem(),limeRick.getNumLine());
    }
}