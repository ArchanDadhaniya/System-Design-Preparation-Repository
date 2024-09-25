package StructuralPatterns.CompositePattern.Solution1WithCompositeDesign;

public class Main {
    public static void main(String args[]){

       Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

       Directory comedyMovieDirectory = new Directory("ComedyMovie");
       File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}


/*
Intent:- Compose objects into tree structures to represent part-whole hierarchies. Composite lets client treat individual
         objects and compositions of objects uniformly.
 */