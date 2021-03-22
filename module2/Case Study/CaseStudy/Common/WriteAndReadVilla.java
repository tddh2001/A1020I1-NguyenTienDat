package CaseStudy.Common;

import CaseStudy.Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadVilla {
    static final String PATH_VILLA = "src/CaseStudy/Data/Villa.csv";
    static File file = new File(PATH_VILLA);
    public static void writeVilla(List<Villa> list, boolean selection) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : list) {
                bufferedWriter.write(villa.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Villa> readVilla() {
        List<Villa> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Villa villa = new Villa(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], Integer.parseInt(arr[7]), Integer.parseInt(arr[8]));
                list.add(villa);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" lỗi đọc file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
