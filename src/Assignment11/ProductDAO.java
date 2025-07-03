        package Assignment11;

        import java.io.Serializable;
        import java.util.List;
        //parameter product
        public class ProductDAO extends DAO<Product> {

            // Cài đặt phương thức update() để cập nhật thông tin sản phẩm

            public void update(Product product) {
                // Lặp qua danh sách sản phẩm
                for (int i = 0; i < getList().size(); i++) {
                    Product p = getList().get(i);
                    // Nếu tên sản phẩm giống với tên sản phẩm cần cập nhật
                    if (p.getName().equals(product.getName())) {
                        getList().set(i, product);  // Cập nhật sản phẩm
                        break;
                    }
                }
            }

            // Cài đặt phương thức find() để tìm sản phẩm theo tên (id trong trường hợp này là tên)

            public Product find(Serializable id) {
                // Lặp qua danh sách sản phẩm
                for (Product p : getList()) {
                    // Nếu tên sản phẩm trùng với id (tên)
                    if (p.getName().equals(((Product) id).getName())) {  // Ép kiểu id thành Product rồi gọi getName()
                        return p;  // Trả về sản phẩm tìm được
                    }
                }
                return null;  // Nếu không tìm thấy sản phẩm, trả về null
            }
        }
