public class Magic {
	public static void main(String[] args) {
    // My number originally is set to 11
      int myNumber = 88;
      int magicNumber = myNumber * myNumber;
      magicNumber -= myNumber;
      magicNumber /= myNumber;
      magicNumber += 17;
      magicNumber -= myNumber;
      magicNumber /= 6;
      System.out.println(magicNumber);
	}
}