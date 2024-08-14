public class Test {
    public static void main(String[] args) {
        PPay pPay = new PPayImpl();
        
        pPay.setCustCardNo("Luiz");
        pPay.setCardOwnerName("10000000000");
        pPay.setCardExpMonthDate("05/30");
        pPay.setCVVNo(222);
        pPay.setTotalAmount(150.50);
        
        MPay mpayAdapter = new PPayAdapter(pPay);
        testMPay(mpayAdapter);
    }
    
    public static void testMPay(MPay mp){
        System.out.println(mp.getCustomerName());
        System.out.println(mp.getCreditCardNo());
        System.out.println(mp.getCardExpMonth());
        System.out.println(mp.getCardExpYear());
        System.out.println(mp.getCardCVVNo());
        System.out.println(mp.getAmount());
    }
}
