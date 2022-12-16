import proxy.BanqueService;
import proxy.BanqueWS;


public class ClientWS {
    public static void main(String[] args) {
        BanqueService sutb = new BanqueWS().getBanqueServicePort();
        System.out.println(sutb.convert(200));
    }
}
