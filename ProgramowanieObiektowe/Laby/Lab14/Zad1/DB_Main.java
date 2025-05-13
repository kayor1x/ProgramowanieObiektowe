public class DB_Main {
    static public void main(String[] args) {
        PersonCRUD personCRUD = new PersonCRUD();

        personCRUD.addPerson("4mo", "Vanuchi", 30);

        personCRUD.viewAllPerson();

        personCRUD.updatePerson(1,"alina", "Vanuchi", 30);
        personCRUD.viewAllPerson();

        personCRUD.deletePerson(1);
        personCRUD.viewAllPerson();
    }
}
