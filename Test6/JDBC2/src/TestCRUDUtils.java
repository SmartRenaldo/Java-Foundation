import org.junit.Test;

import java.util.List;

public class TestCRUDUtils {
    @Test
    public void testUpdate() {
        int update = CRUDUtils.update("update beauty set sex = ? where id = ?",
                "男", "5");

        System.out.println(update > 0 ? "success" : "failed");
    }

    @Test
    public void testQuerySingle(){
        Boys boys = CRUDUtils.querySingle("select * from boys where id = ?", 1);

        System.out.println(boys);
    }

    @Test
    public void testQueryMulti(){
        List<Boys> boys = CRUDUtils.queryMulti("select * from boys where id in (1,2)");

        boys.forEach(System.out::println);
    }
}
