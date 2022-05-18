//  
// CreditCard.java
// Written by Stephen Connelly
//sjc2235
//
// Determines whether a card is valid through a series of checks
//
//
//

public class CreditCard{

       
        private String number;
        private boolean valid;
        private int code;  

        //intializing instance variables
        public CreditCard(String num){
            number = num;
            valid = true;
            code = 0;
        }
        //1st char must be 4
        private void check1(){ 
            int firstDigit=Integer.parseInt(number.substring(0,1));
            if (firstDigit != 4){
                valid=false;
                if (code == 0){
                    code =1;
                }
            }       
        }
        //4th digit must be less than 5th digit by 1
        private void check2(){
            int fourthDigit=Integer.parseInt(number.substring(3,4));
            int fifthDigit=Integer.parseInt(number.substring(5,6));
            if (fourthDigit - fifthDigit != 1){ 
                valid=false;
                if (code == 0){
                    code =2;
                }
            }
        }
        ///product of 1st, 5th, and ninth digit must be = 24
        private void check3(){
            int firstDigit=Integer.parseInt(number.substring(0,1));
            int fifthDigit=Integer.parseInt(number.substring(5,6));
            int ninthDigit=Integer.parseInt(number.substring(10,11)); 
            if (firstDigit*fifthDigit*ninthDigit!=24){
                valid=false;
                if (code == 0){
                    code =3;
                } 
            }    
        }
        //sum of all digits must be divisible evenly by 4
        private void check4(){
            int firstDigit=Integer.parseInt(number.substring(0,1));
            int secondDigit=Integer.parseInt(number.substring(1,2));
            int thirdDigit=Integer.parseInt(number.substring(2,3));
            int fourthDigit=Integer.parseInt(number.substring(3,4));
            int fifthDigit=Integer.parseInt(number.substring(5,6));
            int sixthDigit=Integer.parseInt(number.substring(6,7));
            int seventhDigit=Integer.parseInt(number.substring(7,8));
            int eighthDigit=Integer.parseInt(number.substring(8,9));
            int ninthDigit=Integer.parseInt(number.substring(10,11));
            int tenthDigit=Integer.parseInt(number.substring(11,12));
            int eleventhDigit=Integer.parseInt(number.substring(12,13));
            int twelthDigit=Integer.parseInt(number.substring(13,14));
            if ((firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+
            sixthDigit+seventhDigit+eighthDigit+ninthDigit+tenthDigit+
            eleventhDigit+twelthDigit)%4 != 0){
                valid=false;
                if (code == 0){
                    code =4;
                }
            }
        }
        //sum of 1st 4 digits must 1 less than sum of last four digits
        private void check5(){
            int firstDigit=Integer.parseInt(number.substring(0,1));
            int secondDigit=Integer.parseInt(number.substring(1,2));
            int thirdDigit=Integer.parseInt(number.substring(2,3));
            int fourthDigit=Integer.parseInt(number.substring(3,4));
            int ninthDigit=Integer.parseInt(number.substring(10,11));
            int tenthDigit=Integer.parseInt(number.substring(11,12));
            int eleventhDigit=Integer.parseInt(number.substring(12,13));
            int twelthDigit=Integer.parseInt(number.substring(13,14));
            if (((firstDigit+secondDigit+thirdDigit+fourthDigit)+1) != 
            (ninthDigit+tenthDigit+eleventhDigit+twelthDigit)){
                valid=false;
                if (code == 0){
                    code =5;
                }
            }
        }
        // sum of first two digits, and 7th and 8th digits, 
            //as a two two-digit numbers must = 100
        private void check6(){
            int firstSecondDigit=Integer.parseInt(number.substring(0,2));
            int seventhEighthDigit=Integer.parseInt(number.substring(7,9));
            if (firstSecondDigit+seventhEighthDigit != 100){
                valid=false;
                    if (code == 0){
                    code =6;
                }
            }
        }
        //calls the supporting check methods to check
        public void check(){
            check1();
            check2();
            check3();
            check4();
            check5();
            check6();
        }
        
        public boolean isValid(){
            return valid;
        }

        public int getErrorCode(){
            return code;
        }
            
}