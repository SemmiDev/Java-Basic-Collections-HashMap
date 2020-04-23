package belajar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	    // HashMap = tidak ngurut datanya
        // LinkedHashMap = Akan ngurut datanya
        // TreeMap = akan ngurut data dari yg terkecil hingga yg terbesar, dengan referensi key->value
        // PollFirstEntry = hapus data q

        HashMap<Integer,String> data = new HashMap<>();
        data.put(1,"Sammi Aldhiyanto");
        data.put(2,"Abdul Rauf");
        data.put(3,"Dandi Arnanda");

        System.out.println(data); // menampilkan
        System.out.println(data.entrySet());// menampilkan
        System.out.println(data.keySet()); // untuk menampilkan key nya saja
        System.out.println(data.values()); // untuk menampilkan value nya saja


        for(int i : data.keySet()) {
            System.out.println(i);
        }
        for(String a : data.values()){
            System.out.println(a);
        }

        // cek apakah ada data di dalam hashMap | boolean
        System.out.println(data.containsKey(2));
        System.out.println(data.containsValue("Abdul Ruaf"));

        // putIfAbsent = the meaning is, jika data ada, maka ditampilkan begitu saja, dan ketika data tidak ada maka
        // akan di tampilkan dan akan di put atau ditambahkan ke dalam data kita
        data.putIfAbsent(5, "Gusnur");
        data.replace(5, "Ayatullah Ramadhan Jacoeb");
        System.out.println(data);


        // show
        data.entrySet().forEach((no) -> {
            System.out.println(no.getKey() + ". " + no.getValue());
        });



        }
}
