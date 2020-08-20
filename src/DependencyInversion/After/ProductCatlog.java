package DependencyInversion.After;

import java.util.ArrayList;
import java.util.List;

/*
Dependency inversion means the high level component should not know about low level component directly but
only through abstraction.
Also abstraction should not depend on details but details should depend on abstraction

Below code breaks as product catlog directly access sql repo and their is no abstraction and both are tightly coupled

We fix it by : adding abstraction between high level and low level component and also making detail depending on abstraction
 */
public class ProductCatlog {
    List getAll() {
        return new SQLProductRepoFactory().create().getAllProducts(); // loosely coupled, accessing low level through abstraction
    }
}

class SQLProductRepoFactory {
    SQLProductRepoAbstraction create() {
        return new SQLProductRepo();
    }
}

interface SQLProductRepoAbstraction {
    List getAllProducts();
}

/*
Detail depends on abstraction, SQLProductRepo depends on SQLProductRepoAbstraction
 */
class SQLProductRepo implements SQLProductRepoAbstraction {
    @Override
    public List getAllProducts() {
        return new ArrayList();
    }
}
