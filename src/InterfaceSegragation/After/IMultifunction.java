package InterfaceSegragation.After;

/*
Segregation of interface principle state the client should not be ask to implement more method then it requires:
Techinique to see if Segregation of interface is broken :
1. Fat interface - interface with more methods
2. LSP is failed, subclass cant be replace with parent object
3. Interface has low cohesion : like scan and fax are totally different action but under same interface
4. Empty implementation
 */
interface IPrint {
    void print();
}

interface IScan {
    void scan();
}

interface IFax {
    void fax();
}

class XeroxCenter implements IPrint, IFax, IScan {
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

class CanonPrinter implements IPrint {
    @Override
    public void print() {

    }
}

class HPScannerAndPrinter implements IScan, IPrint {
    @Override
    public void scan() {

    }

    @Override
    public void print() {

    }
}
