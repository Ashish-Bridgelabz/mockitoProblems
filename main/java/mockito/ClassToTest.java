package mockito;

public class ClassToTest {
    private final MyDataBase myDatabase;

    public ClassToTest(MyDataBase myDatabase) {
        this.myDatabase = myDatabase;
    }

    public boolean query(String query) {
        return this.myDatabase.query(query);
    }
}

