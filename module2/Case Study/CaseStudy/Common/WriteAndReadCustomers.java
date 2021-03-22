package CaseStudy.Common;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteAndReadCustomers {
    static final String PATH_CUSTOMER = "src/CaseStudy/Data/Customers.csv";
    static File file = new File(PATH_CUSTOMER);

    public static void writeCustomers(List<Customer> list, boolean selection) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : list) {
                bufferedWriter.write(customer.getInfo());
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

    public static List<Customer> readCustomers() {
        List<Customer> list = new ArrayList<>();
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
                Customer customer = new Customer(arr[0], arr[1], arr[2],Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5],arr[6], arr[7]);
                list.add(customer);
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
