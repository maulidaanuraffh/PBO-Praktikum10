import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CountrySetDemo {
    public static void main(String[] args) {
        // Step 10: Negara tanpa duplikasi
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia"); // duplikat

        System.out.println("Isi HashSet: " + countries);
        System.out.println("Jumlah elemen = " + countries.size());

        // Step 11: contains, remove, size
        System.out.println("Ada Indonesia? " + countries.contains("Indonesia"));
        countries.remove("Japan");
        System.out.println("Setelah remove Japan: " + countries);
        System.out.println("Size akhir: " + countries.size());

        // Step 12: Coba Collections.sort pada Set
        HashSet<String> countriesSet = new HashSet<>();
        countriesSet.add("Japan");
        countriesSet.add("Indonesia");
        countriesSet.add("Malaysia");

        // Baris di bawah ini akan ERROR saat dicompile jika diaktifkan:
        // Collections.sort(countriesSet);

        ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("Japan");
        countriesList.add("Indonesia");
        countriesList.add("Malaysia");

        Collections.sort(countriesList);
        System.out.println("ArrayList terurut: " + countriesList);

        // Step 13: Menampilkan data Set secara terurut tanpa mengubah kontrak Set
        ArrayList<String> sortedCountries = new ArrayList<>(countriesSet);
        Collections.sort(sortedCountries);
        System.out.println("Hasil konversi Set ke List terurut: " + sortedCountries);
    }
}
