package DeepashikaMishraInClass.Lecture_19;

public class CloneableInterface implements Cloneable {
    String Name;
    int Version;

    public static void main(String[] args) {
        CloneableInterface cloneableInterface = new CloneableInterface();
        cloneableInterface.Name="Java";
        cloneableInterface.Version=14;

        System.out.println(cloneableInterface.Name);
        System.out.println(cloneableInterface.Version);
    }
}
