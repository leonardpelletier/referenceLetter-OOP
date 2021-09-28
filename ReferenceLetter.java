class ReferenceLetter {
    
    private String name;
    
    public ReferenceLetter() {
        //nothing to do...
    }
    
    public ReferenceLetter(String n) {
        name = n;
    }
    
    public void writeLetter(){
        salutation();
        academicPerformance();
        extraCurriculars();
        personality();
        conclusion();
    }

    private void salutation() {
        System.out.println("To whom it may concern,");
        System.out.println();
    }

    private void academicPerformance() {
        System.out.println(name + " is crushing it in school.");
        System.out.println();
    }
    
    private void extraCurriculars() {
        System.out.println("They are also passionate about many interests.");
        System.out.println();
    }

    private void personality() {
        System.out.println("Above all else, "+name+" is a good human being.");
        System.out.println();
    }

    private void conclusion() {
        System.out.println("I give "+name+" my strongest recommendation.");
        System.out.println();
        System.out.println("-- Mr. Pelletier");
    }

}