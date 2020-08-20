package InterfaceSegragation.Before;
/*
Segregation of interface principle state the client should not be ask to implement more method then it requires:
Techinique to see if Segregation of interface is broken :
1. Fat interface - interface with more methods
2. LSP is failed, subclass cant be replace with parent object
3. Interface has low cohesion : like scan and fax are totally different action but under same interface
4. Empty implementation
 */
interface IMultifunction {
    void scan();
    void print();
    void fax();
}

class XeroxCenter implements IMultifunction {
    @Override
    public void scan() {

    }

    @Override
    public void print() {

    }

    @Override
    public void fax() {

    }
}

class CanonPrinter implements IMultifunction {

    @Override
    public void scan() {
        // cannot implement as cant scan
    }

    @Override
    public void print() {

    }

    @Override
    public void fax() {
        // cannot implement as cant fax
    }
}

class HPScannerAndPrinter implements IMultifunction {
    @Override
    public void scan() {

    }

    @Override
    public void print() {

    }

    @Override
    public void fax() {
        // cannot implement as cant fax
    }
}
