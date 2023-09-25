class ReferenceLetter {
  String teacherName;

  public ReferenceLetter() {
    teacherName = "Leonard Pelletier";
  }

  public ReferenceLetter(String name) {
    teacherName = name;
  }

  public void print(String studentName, int yearsTaught) {
    printIntro();
    printBody(studentName, yearsTaught);
    printSignature();
    printFooter();
  }

  public void printIntro() {
    System.out.println("To Whom It May Concern:");
    System.out.println("");
  }

  public void printBody(String studentName, int yearsTaught) {
    System.out.println(
        "It has been an honor to teach " + studentName + ". I have taught this student for " + yearsTaught + " years. If you don't accept them to your university, you are a fool!");
  }

  public void printSignature() {
    System.out.println("");
    System.out.println("Sincerely,");
    System.out.println(teacherName);
  }

  public void printFooter() {
    System.out.println();
  }

}
