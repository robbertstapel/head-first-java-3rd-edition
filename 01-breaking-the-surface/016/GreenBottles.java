class GreenBottles {
    public static void main(String[] args) {
        String word = "bottles";
        int count = 10;

        while(count >= 0){

            if(count <= 1) {
                word = "bottle";
            }
            if( count == 0){
                System.out.println("There are no green " + word + " hanging on the wall");
                return;
            }
            System.out.println(count + " green " + word + " hanging on the wall");

            count--;
        }


    }
}


//public class GreenBottles {
//    public static void main(String[] args) {
//        String word = "bottles";
//        int bottles = 10;
//
//
//        while (bottles > 0) {
//
//            System.out.println("There is " + bottles + " green " + word + " hanging on the wall");
//
//            System.out.println("And if one green bottle should accidentally fall");
//            bottles = bottles - 1;
//
//            if(bottles > 0){
//                if(bottles == 1){
//                    word = "bottle";
//                }
//                System.out.println("There'll be " + bottles + " green " + word + " hanging on the wall");
//            } else {
//                System.out.println("There'll be no green bottles hanging on the wall");
//            }
//
//        }
//
//    }
//}
