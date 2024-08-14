public class PPayAdapter implements MPay {
    PPay pPay;

    public PPayAdapter(PPay pPay) {
        this.pPay = pPay;
    }
    
    @Override
    public String getCreditCardNo() {
        return pPay.getCustCardNo();
    }

    @Override
    public String getCustomerName() {
        return pPay.getCardOwnerName();
    }

    @Override
    public String getCardExpMonth() {
        String[] splitDate = pPay.getCardExpMonthDate().split("/");
        if (splitDate.length == 2) {
            return splitDate[0];
        } else {
            return "Data invalida";
        }
    }

    @Override
    public String getCardExpYear() {
        String[] splitDate = pPay.getCardExpMonthDate().split("/");
        if (splitDate.length == 2) {
            return splitDate[1];
        } else {
            return "Data invalida";
        }
    }

    @Override
    public Short getCardCVVNo() {
        return pPay.getCVVNo().shortValue();
    }

    @Override
    public Double getAmount() {
        return pPay.getTotalAmount();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        pPay.setCustCardNo(creditCardNo);
    }

    @Override
    public void setCustomerName(String customerName) {
        pPay.setCardOwnerName(customerName);
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        pPay.setCardExpMonthDate(cardExpMonth + "/" + this.getCardExpYear());
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        pPay.setCardExpMonthDate(this.getCardExpMonth() + "/" + cardExpYear);
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        pPay.setCVVNo(cardCVVNo.intValue());
    }

    @Override
    public void setAmount(Double amount) {
       pPay.setTotalAmount(amount);
    }
}
