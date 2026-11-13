package Model;

public class MahasiswaDataView <T extends DataView> {

    Mahasiswa data = new Mahasiswa();


    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    protected String getFields() {
        //return String[] array = {data.getNim(),data.getNama(), data.getEmail(), data.getUmur()};
    }

    protected T convertValuesToModel(String[]values) {

    }

    protected String[]convertModelToValues(Mahasiswa data){ 

    }
}
