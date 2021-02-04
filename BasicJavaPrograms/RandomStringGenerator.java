import java.util.Random;

class Main {
  public static void main(String[] args) {
    int len  = 50;
    int[]  intArray= new Random().ints(len, 4, 12).toArray();
    String[] StringArr =new String[len];
    int arrayLength = intArray.length;
    for(int j=0;j<=arrayLength-1; j++){
    int length = intArray[j];
    // create a string of all characters
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphabet.length());

      // get character specified by index
      // from the string
      char randomChar = alphabet.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    StringArr[j]= randomString;
    // System.out.println("Random String is: " + randomString);
    }
    for(int f=0; f<StringArr.length;f++){
      System.out.println(f + ":" + StringArr[f]);
    }
    
  }
}
