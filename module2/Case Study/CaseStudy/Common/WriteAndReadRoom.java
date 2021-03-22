package CaseStudy.Common;

import CaseStudy.Models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadRoom {
    static final String PATH_ROOM = "src/CaseStudy/Data/Room.csv";
    static File file = new File(PATH_ROOM);

    public static void writeRoom(List<Room> list, boolean selection) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : list) {
                bufferedWriter.write(room.getInfo());
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

    public static List<Room> readRoom() {
        List<Room> list = new ArrayList<>();
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
                Room room = new Room(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]);
                list.add(room);
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
