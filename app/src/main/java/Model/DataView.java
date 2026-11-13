package Model;
import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> records;

    public DataView(){
        records = new ArrayList<>();
    }

    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T record = this.records.get(i);
            String [] values = this.convertModelToValues(record);
            System.out.print(i+". ");
            for (int j = 0; j < fields.length; j++) {
            System.out.print(fields[j]+ "=" +values[j]+ ", ");
            }
        System.out.println();    
        }
    }


    public void printByPk(String primaryKey) {

    }

    public void showInsertForm() {
        String [] fields = this.getFields();
        T record = this.records.get(i);
            String [] values = this.convertModelToValues(record);
        for (int i = 0; i < fields.length; i++){
            System.out.print(fields[i]+ " ");
        }
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
