package DependencyInversion.Before;

import java.util.ArrayList;
import java.util.List;

/*
Dependency inversion means the high level component should not know about low level component directly but
only through abstraction.
Also abstraction should not depend on details but details should depend on abstraction

Below code breaks as product catlog directly access sql repo and their is no abstraction and both are tightly coupled
 */
public class ProductCatlog {
    List getAll() {
        return new SQLProductRepo().getAllProducts(); // directly coupled with low level
    }
}

class SQLProductRepo {
    List getAllProducts() {
        return new ArrayList();
    }
}