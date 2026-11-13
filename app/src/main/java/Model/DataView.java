package Model;
import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> records;

    public DataView(){
        records = new ArrayList<>();
    }

    public void printAll() {

    }

    public void printByPk(String primaryKey) {

    }

    public void showInsertForm() {

    }

    public void showUpdateForm() {

    }

    public void showDeleteForm() {

    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[]getFields();

    protected abstract T convertValuesToModel(String[]values);

    protected abstract String[]convertModelToValues(T data);
}
