package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;
import java.util.ArrayList;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 11.0;
    }

    @WebMethod(operationName = "GetCompte")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, 5000);
    }

    @WebMethod(operationName = "GetComptes")
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 5000));
        comptes.add(new Compte(2, 3000));
        return comptes;
    }
}