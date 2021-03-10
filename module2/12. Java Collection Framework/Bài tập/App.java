import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product{
    String name;
    int iD;
    int price;

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + iD + '\'' +
                ", Name=" + name +
                ", Price=" + price +
                '}';
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class ProductManager{
    ArrayList<Product> listProduct = new ArrayList<Product>();
    Scanner input = new Scanner(System.in);
    void add(Product product){
        System.out.println("ID: ");
        product.iD = input.nextInt();
        input.nextLine();
        System.out.println("Name: ");
        product.name = input.nextLine();
        System.out.println("Price: ");
        product.price = input.nextInt();
        listProduct.add(product);
    }
    void showInfo(){
        if (listProduct.size()==0){
            System.out.println("No products.");
        }else {
            for (Product product : listProduct){
                System.out.println(product.toString());
            }
        }
    }
    void search(){
        if (listProduct.size()==0){
            System.out.println("No products found");
        }else {
            input.nextLine();
            System.out.println("Input name product: ");
            String nameSearch = input.nextLine();
            boolean found = false;
            for (Product product : listProduct) {
                if (product.name.equals(nameSearch)){
                    System.out.println(product.toString());
                    found = true;
                }
            }
            if (!found){
                System.out.println("No products found");
            }
        }
    }
    void delete(){
        System.out.println("Input ID product for delete:");
        int iDSearch = input.nextInt();
        boolean found = false;
        for (int i=0; i<listProduct.size(); i++){
            if (iDSearch == listProduct.get(i).iD){
                listProduct.remove(listProduct.get(i));
                System.out.println("Product deleted");
                found = true;
            }
        }
        if (!found){
            System.out.println("No products found");
        }
    }
    void edit(){
        System.out.println("Input id product for edit:");
        int idFound = input.nextInt();
        boolean found = false;
        Product pTmp;
        for (int i=0; i<listProduct.size();i++){
            pTmp = listProduct.get(i);
            if (idFound == pTmp.iD){
//                listProduct.remove(listProduct.get(i));
                System.out.println("ID: ");
//                listProduct.get(i).setiD(input.nextInt());
                pTmp.setiD(input.nextInt());
                input.nextLine();
                System.out.println("Name: ");
//                listProduct.get(i).setName(input.nextLine());
                pTmp.setName(input.nextLine());
                System.out.println("Price: ");
//                listProduct.get(i).setPrice(input.nextInt());
                pTmp.setPrice(input.nextInt());
//                listProduct.add(listProduct.get(i));
                found = true;
            }
        }
        if (!found){
            System.out.println("No products found");
        }
    }
    void sortReduc(){
        Collections.sort(listProduct, (product1, product2) -> {
            if (product1.iD < product2.iD) {
                return 1;
            } else {
                if (product1.iD == product2.iD){
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("sort by v");
        for (Product product : listProduct){
            System.out.println(product.toString());
        }
    }
    void sortInc(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.iD < product2.iD) {
                    return -1;
                } else {
                    if (product1.iD == product2.iD){
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
        System.out.println("sort by v");
        for (Product product : listProduct){
            System.out.println(product.toString());
        }
    }
}
public class App {
    static void Menu(){
        System.out.println("=====PRODUCT MANAGER=====");
        System.out.println("Menu:");
        System.out.println("1.Add new product");
        System.out.println("2.Edit info product by ID");
        System.out.println("3.Delete product by ID");
        System.out.println("4.Show info");
        System.out.println("5.Search");
        System.out.println("6.Sort by v");
        System.out.println("7.Sort by ^");
        System.out.println("8.Exit");
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        int choices;
        ProductManager productManager = new ProductManager();
        Scanner input = new Scanner(System.in);
        Menu();
        while (true){
            System.out.println("Input menu: ");
            choices = input.nextInt();
            switch (choices){
                case 1:
                    productManager.add(new Product());
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.showInfo();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sortReduc();
                    break;
                case 7:
                    productManager.sortInc();
                    break;
                case 8:
                    return;
            }
        }
    }
}
