public class Main {
    public static void main(String[] args) {
        God zeus = new God("Zeus", "The king of Gods");
        Human chris = new Human("Christophe", "the teacher");

        /*
         * examples:
         * 
         * zeus.destroy();
         * chris.year_of_death = 2080;
         * 
         * System.out.println(zeus.getName());
         * System.out.println(chris.getName());
         */

        chris.sleep();
        zeus.sleep();
    }
}
