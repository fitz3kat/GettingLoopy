public class partFive {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) //Row(x)
        {
            for (int y = 0; y < 5; y++) //Column(y)
            {
                if (x >= y) {
                    System.out.print("*");
                }
            }
            System.out.println(); //Terminates current line and places a new one
        }
    }
}
