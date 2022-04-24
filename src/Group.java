public class Group {
    public static void main(String[] args) {
        Person ana = new Person("ana", null, 'F', 172);
        Person geamanaAna = new Person("ana", null, 'F', 172);

        System.out.println(ana);
        System.out.println(geamanaAna);
        System.out.println(ana == geamanaAna);
        System.out.println(ana == ana);
        System.out.println(ana.equals(geamanaAna));
        System.out.println(ana.equals(ana));
    }
}
