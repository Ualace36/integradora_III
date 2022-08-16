public class Main {
    public static void main(String[] args) {
        RoupasFlyweight roupasFlyweight = new RoupasFlyweight();
        System.out.println(roupasFlyweight.adicionar("P","Camisas", true,true));
        System.out.println(roupasFlyweight.adicionar("M","Bermudas", true,true));
        System.out.println(roupasFlyweight.adicionar("G","Calça", true,true));
        System.out.println(roupasFlyweight.getRequest());
    }
}
