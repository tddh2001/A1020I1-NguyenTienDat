import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomersServlet", urlPatterns = {"/"})
public class CustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customersList = new ArrayList<>();
        customersList.add(new Customers("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "img/mai_van_hoan.jpg"));
        customersList.add(new Customers("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "img/nguyen_van_nam.jpg"));
        customersList.add(new Customers("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "img/nguyen_thai_hoa.jpg"));
        customersList.add(new Customers("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "img/tran_dang_khoa.jpg"));
        customersList.add(new Customers("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "img/nguyen_dinh_thi.jpg"));

        request.setAttribute("customerListServlet", customersList);
        request.getRequestDispatcher("index1.jsp").forward(request, response);
    }
}
