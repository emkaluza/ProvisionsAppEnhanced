import daos.ProductDaoImpl;
import daos.UnitDaoImpl;
import entities.Product;
import entities.Unit;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by msi on 2016-04-04.
 */
public class Test {

    private ProductDaoImpl productDao;
    private UnitDaoImpl unitDao;

    public void setProductDao(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    public void setUnitDao(UnitDaoImpl unitDao) {
        this.unitDao = unitDao;
    }

    public void run(){
        //Long idUnit = unitDao.save(new Unit("test1", "test1pl"));

        //productDao.save(new Product("product1", "product1pl", idUnit, "commentary"));

        System.out.println(unitDao.getAll());
        System.out.println(productDao.getAll());
    }
}
