package CaseStudy.Common;

import CaseStudy.Models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadHouse {
    static final String PATH_HOUSE = "src/CaseStudy/Data/House.csv";
    static File file = new File(PATH_HOUSE);

    public static void writeHouse(List<House> list, boolean selection) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : list) {
                bufferedWriter.write(house.getInfo());
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

    public static List<House> readHouse() {
        List<House> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
//            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                House house = new House(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]), arr[4], arr[5],arr[6], Integer.parseInt(arr[7]));
                list.add(house);
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
