package Model;

public class MahasiswaDataView <T extends DataView> {

    Mahasiswa data = new Mahasiswa();


    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    protected String getFields() {
        //return String[] array = {data.getNim(),data.getNama(), data.getEmail(), data.getUmur()};
        return String[] fields = {"nim","nama","email","umur"};
    }

    protected T convertValuesToModel(String[]values) {

    }

    protected String[]convertModelToValues(Mahasiswa data){ 
        return T [] array = {data.getNim(),data.getNama(), data.getEmail(), data.getUmur()};
    }
}
