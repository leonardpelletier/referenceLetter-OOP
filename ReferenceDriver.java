class Main {
  public static void main(String[] args) {
    ReferenceLetter myLetter = new ReferenceLetter();
    myLetter.print("Cal Culator", 1);
    myLetter.print("Al Gebra", 3);

    ReferenceLetter schniederLetter = new ReferenceLetter("Katrina Schnieder");
    schniederLetter.print("Bob Loblaw", -1);
  }
}
