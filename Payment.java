public class Payment {

   private double paymentAmount;

   public Payment(double paymentAmount) {
       super();
       this.paymentAmount = paymentAmount;
   }

   public double getPaymentAmount() {
       return paymentAmount;
   }

   public void setPaymentAmount(double paymentAmount) {
       this.paymentAmount = paymentAmount;
   }

   public String paymentDetails() {
       return "\n Payment Amount : " + this.paymentAmount;
   }

   @Override
   public String toString() {
       String res = this.paymentDetails();
       return res;
   }

   public static void main(String[] args) {
       CashPayment one = new CashPayment(3000, "dollars");
       CashPayment two = new CashPayment(13000, "yen");

       CreditCardPayment creditOne = new CreditCardPayment(10000, "John Doe", "01/25", "1234567890123456");
       CreditCardPayment creditTwo = new CreditCardPayment(50000, "Jane Doe", "03/27", "1234561234567890");

       System.out.println("\n--------- Cash Payment - 1 ---------");
       System.out.println(one);

       System.out.println("\n--------- Cash Payment - 2 ---------");
       System.out.println(two);

       System.out.println("\n--------- Credit Card Payment - 1 ---------");
       System.out.println(creditOne);

       System.out.println("\n--------- Credit Card Payment - 2 ---------");
       System.out.println(creditTwo);

       CashPayment cashPayments[] = new CashPayment[2];
       cashPayments[0] = one;
       cashPayments[1] = two;

       CreditCardPayment creditCardPayments[] = new CreditCardPayment[2];
       creditCardPayments[0] = creditOne;
       creditCardPayments[1] = creditTwo;

       System.out.println("\n-------- Cash Payments using Array ----------\n");
       for (int i = 0; i < cashPayments.length; i++) {
           System.out.println(cashPayments[i]);
       }

       System.out.println("\n-------- Credit Card Payments using Array ----------\n");
       for (int i = 0; i < creditCardPayments.length; i++) {
           System.out.println(creditCardPayments[i]);
       }

   }
}

// CashPayment.java 
class CashPayment extends Payment{
  
   private String currency;
  
  
  
   public CashPayment(double paymentAmount, String currency) {
       super(paymentAmount);
       this.currency = currency;
   }
   public String getCurrency() {
       return currency;
   }
   public void setCurrency(String currency) {
       this.currency = currency;
   }
   @Override
   public String paymentDetails()
   {
       return "\nCash Payment"
               +"\n Payment - Type : CASH"
               +"\n Cash - Type : "+ currency
               +super.paymentDetails();
              
   }
   @Override
   public String toString()
   {
       return this.paymentDetails();
   }
}

//CreditCardPayment.java 
class CreditCardPayment extends Payment{
  
   private String nameOnCard;
  
   private String expiryDate;
  
   private String cardNumber;

   public CreditCardPayment(double paymentAmount, String nameOnCard, String expiryDate, String cardNumber) {
       super(paymentAmount);
       this.nameOnCard = nameOnCard;
       this.expiryDate = expiryDate;
       this.cardNumber = cardNumber;
   }
   @Override
   public String paymentDetails()
   {
       return "\nCredit Card Payment:"
               +"\n Name on the Card : "+nameOnCard
               +"\n Expiration Date : "+expiryDate
               +"\n Credit Card Number : "+cardNumber
               +super.paymentDetails();
   }
   @Override
   public String toString()
   {
       return paymentDetails();
   }
  
   public String getCardNumber() {
       return cardNumber;
   }

   public void setCardNumber(String cardNumber) {
       this.cardNumber = cardNumber;
   }

   public String getNameOnCard() {
       return nameOnCard;
   }

   public void setNameOnCard(String nameOnCard) {
       this.nameOnCard = nameOnCard;
   }

   public String getExpiryDate() {
       return expiryDate;
   }

   public void setExpiryDate(String expiryDate) {
       this.expiryDate = expiryDate;
   }
  
  
}