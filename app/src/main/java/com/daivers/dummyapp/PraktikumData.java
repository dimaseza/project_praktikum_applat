package com.daivers.dummyapp;

import java.util.ArrayList;

public class PraktikumData {
    private static String[] praktikumTitle = {
            "Praktikum Modul 1",
            "Praktikum Modul 2",
            "Praktikum Modul 3",
            "Praktikum Modul 4",
            "Praktikum Modul 5",
            "Praktikum Modul 6",
            "Praktikum Modul 7",
            "Praktikum Modul 8",
            "Praktikum Modul 9",
            "Praktikum Modul 10"
    };

    private static String[] praktikumSubtitle = {
            "Pengenalan HTML",
            "Pengenalan CSS",
            "Pengenalan Bootstrap",
            "Pengenalan JavaScript",
            "Pengenalan PHP",
            "Pengenalan CodeIgniter",
            "CodeIgniter CRUD",
            "Android Dasar",
            "Android Layout Dasar",
            "Android Layout Lanjut"
    };

    static ArrayList<Praktikum> getListData() {
        ArrayList<Praktikum> list = new ArrayList<>();
        for (int position = 0; position < praktikumTitle.length; position++) {
            Praktikum praktikum = new Praktikum();
            praktikum.setTitle(praktikumTitle[position]);
            praktikum.setSubtitle(praktikumSubtitle[position]);
            list.add(praktikum);
        }
        return list;
    }
}
